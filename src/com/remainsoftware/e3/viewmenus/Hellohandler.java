package com.remainsoftware.e3.viewmenus;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class Hellohandler extends AbstractHandler {

	// something
	
	@OverridegetActiveWorkbenchWindow
	public Object execute(ExecutionEvent event) throws ExecutionException {
	Shell shell = ((Window) PlatformUI.getWorkbench()).getShell();	
	MessageDialog.openInformation(shell, "hello handler", "eclipse says hello through handler");
		return null;
		
	} 
}
