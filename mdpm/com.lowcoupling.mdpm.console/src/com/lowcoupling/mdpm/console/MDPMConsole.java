package com.lowcoupling.mdpm.console;

import java.io.IOException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.IConsoleDocumentPartitioner;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.IOConsole;
import org.eclipse.ui.console.IOConsoleInputStream;
import org.eclipse.ui.console.IOConsoleOutputStream;
import org.eclipse.ui.console.TextConsole;
import org.eclipse.ui.console.TextConsolePage;
import org.eclipse.ui.console.TextConsoleViewer;
import org.eclipse.ui.part.IPageBookViewPage;
import org.eclipse.ui.progress.WorkbenchJob;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;


public class MDPMConsole extends IOConsole implements ISelectionListener {

	private EObject element= null;
	private MDPMConsolePage page = null;
	public MDPMConsole(String name, ImageDescriptor imageDescriptor) {
		super(name, imageDescriptor);
		// TODO Auto-generated constructor stub
		IOConsoleOutputStream stream = this.newOutputStream(); 
		try {
			stream.write("mdpm>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().addSelectionListener(this);
		Thread t1 = new Thread(new ConsoleStreamReader(this,stream));
		t1.start();
	}

	public MDPMConsolePage getPage(){
		return this.page;
	}
	@Override
	public IPageBookViewPage createPage(IConsoleView view) {
		this.page=  new MDPMConsolePage(this, view);
		return this.page;

	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		EObject eobject = null;
		if(selection != null && !selection.isEmpty()){

			if (selection instanceof ITextSelection){
				final ITextSelection textSel = (ITextSelection) selection;
				IEditorPart ie = (IEditorPart)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
				XtextEditor editor = (XtextEditor)ie;
				if(editor!=null){
					try{
						eobject = editor.getDocument().readOnly(
								new IUnitOfWork<EObject, XtextResource>() {
									public EObject exec(XtextResource resource)  {
										EObjectAtOffsetHelper eObjectAtOffsetHelper = new EObjectAtOffsetHelper();
										EObject eObject = eObjectAtOffsetHelper.resolveElementAt(resource, textSel.getOffset());
										return eObject;
									}
								});
					} catch  (Exception e){
						e.printStackTrace();
					}
				}
			}

			if (selection instanceof IStructuredSelection) {
				Object first = ((IStructuredSelection)selection).getFirstElement();
				if (first!=null && first instanceof EObjectNode){
					EObjectNode enode = (EObjectNode)first;
					ResourceSet resourceSet = new ResourceSetImpl();
					Resource inResource = resourceSet.getResource(enode.getEObjectURI(),true);
					eobject = (EObject)inResource.getEObject(enode.getEObjectURI().fragment());
				}
			}
			element = eobject;
		}


	}

	class MDPMConsolePage extends TextConsolePage{
		 
		public MDPMConsolePage(TextConsole console, IConsoleView view) {
			super(console, view); 
			 
			// TODO Auto-generated constructor stub
		}
		@Override
		protected TextConsoleViewer createViewer(Composite parent) {
			return new MDPMConsoleViewer(parent, (MDPMConsole) this.getConsole());
		}

	}

	class MDPMConsoleViewer extends TextConsoleViewer{
		private boolean fAutoScroll = true;
		private IDocumentListener fDocumentListener;
		public boolean isAutoScroll() {
			return fAutoScroll;
		}

		public void setAutoScroll(boolean scroll) {
			fAutoScroll = scroll;
		}
		public MDPMConsoleViewer(Composite parent, TextConsole console) {

			super(parent, console);
			this.cursorEnd(0);
		}
		 
		 public boolean isReadOnly() {
		        return !getTextWidget().getEditable();
		    }
		   
		    /* (non-Javadoc)
		     * @see org.eclipse.jface.text.ITextViewer#setDocument(org.eclipse.jface.text.IDocument)
		     */
		 @Override
		    public void setDocument(IDocument document) {
		        IDocument oldDocument= getDocument();
		        
		        super.setDocument(document);
		        
		        if (oldDocument != null) {
		            oldDocument.removeDocumentListener(getDocumentListener());
		        }
		        if (document != null) {
		            document.addDocumentListener(getDocumentListener());
		        }
		    }
		    
		    private IDocumentListener getDocumentListener() {
		        if (fDocumentListener == null) {
		            fDocumentListener= new IDocumentListener() {
		                public void documentAboutToBeChanged(DocumentEvent event) {
		                }

		                public void documentChanged(DocumentEvent event) {
		                    if (fAutoScroll) {
		                        revealEndOfDocument();
		                    }
		                }
		            };
		        }
		        return fDocumentListener;
		    }
		    
		@Override
		protected void handleVerifyEvent(VerifyEvent e) {
			 
			IDocument doc = getDocument();
			String[] legalLineDelimiters = doc.getLegalLineDelimiters();
			String eventString = e.text;
			try {
				IConsoleDocumentPartitioner partitioner = (IConsoleDocumentPartitioner) doc.getDocumentPartitioner();
				if (!partitioner.isReadOnly(e.start)) {
					boolean isCarriageReturn = false;
					for (int i = 0; i < legalLineDelimiters.length; i++) {
						if (e.text.equals(legalLineDelimiters[i])) {
							isCarriageReturn = true;
							break;
						}
					}

					if (!isCarriageReturn) {
						super.handleVerifyEvent(e);
						return;
					}
				}

				int length = doc.getLength();
				if (e.start == length) {
					super.handleVerifyEvent(e);
				} else {
					try {
						doc.replace(length, 0, eventString);
					} catch (BadLocationException e1) {
					}
					e.doit = false;
				}
			} finally {
				StyledText text = (StyledText) e.widget;
				text.setCaretOffset(text.getCharCount());
			}
			revealEndOfDocument();
		}
		
		public void cursorEnd(int outputOffset){
			WorkbenchJob job = new CaretEndJob("CaretEnd",outputOffset);
			job.schedule();
		}
		
		class CaretEndJob extends WorkbenchJob{
			int outputOffset = 0;
			public CaretEndJob(String name,int outputOffset) {
				super( name);
				this.outputOffset=outputOffset;
				// TODO Auto-generated constructor stub
			}

			@Override
			 public IStatus runInUIThread(IProgressMonitor monitor) {
	            StyledText textWidget = getTextWidget();
	            if (textWidget != null && !textWidget.isDisposed()) {
	            	System.out.println("Caret End: "+textWidget.getCharCount()+ " offset count "+outputOffset);
	            	
	            	textWidget.setCaretOffset(textWidget.getCharCount()+outputOffset);
	            }
	            return Status.OK_STATUS;
	        }
		}

	}

	class ConsoleStreamReader implements Runnable{
		private MDPMConsole console;
		private IOConsoleInputStream stream;
		private IOConsoleOutputStream output;
		public ConsoleStreamReader(MDPMConsole console, IOConsoleOutputStream outputStream){
			this.console=console;
			this.stream = console.getInputStream();
			this.output = outputStream;
			output.setActivateOnWrite(true);
			stream.setColor(new org.eclipse.swt.graphics.Color(Display.getCurrent(),new RGB(0,100,0)));
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			byte data[] =  new byte[1000];
			String line=null;
			try {
				while (stream.read(data)>0){
					line = new String(data);
					if(line.contains("name")){
						if(element !=null){
							//output.write(element.getClass().getName());
							String outputString=element.getClass().getName()+"\n";
							int outputOffset = outputString.length();
							output.write(outputString);
							outputString="mdpm>";
							outputOffset += outputString.length();
							output.write(outputString);
							output.flush();
							Thread.sleep(100);
							((MDPMConsoleViewer) console.getPage().getViewer()).cursorEnd(outputOffset);

						}
					}
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
