package com.lowcoupling.mdpm.lng.wbs.editor;
import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;

public class WBSDiagramProvider extends AbstractDiagramTypeProvider {

       public WBSDiagramProvider() {
    	   	super();
            setFeatureProvider(new WPFeatureProvider(this));
       }
}