package com.uniovi.nmapgui.executor;

import com.uniovi.nmapgui.model.Command;

public interface CommandExecutorObserver {
	
	 void finishedCommand(Command cmd);

}
