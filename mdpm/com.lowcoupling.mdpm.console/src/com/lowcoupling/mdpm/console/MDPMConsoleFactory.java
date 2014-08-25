package com.lowcoupling.mdpm.console;
 
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleFactory;
import org.eclipse.ui.console.IConsoleManager;

public class MDPMConsoleFactory implements IConsoleFactory {

    private static MDPMConsole _console;

    public void openConsole() {
    	MDPMConsole console = getConsole();
        if (console != null) {
            IConsoleManager manager =
            ConsolePlugin.getDefault().getConsoleManager();
            IConsole[] existing = manager.getConsoles();
            boolean exists = false;
            for (int i = 0; i < existing.length; i++) {
                if(console == existing[i])
                    exists = true;
            }
            if(! exists)
                manager.addConsoles(new IConsole[] {console});
            manager.showConsoleView(console);
        }

    }

    public static MDPMConsole getConsole() {
        if (_console == null) {
            _console = new MDPMConsole("MDPM Console",null );
        }
        return _console;
    }
    
 

}