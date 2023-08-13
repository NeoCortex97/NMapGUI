package com.uniovi.nmapgui.executor;

public interface CommandExecutor {
	boolean execute();
	void addObserver(CommandExecutorObserver observer) ;
	void removeObserver(CommandExecutorObserver observer);
	void notifyEnd();

}
