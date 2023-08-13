package com.uniovi.nmapgui.model;

import jakarta.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ExecutionObjectFactory {

	public Scan createScan() {
	    return new Scan();
	}
	
	public ScriptHelp createScriptHelp() {
	    return new ScriptHelp();
	}
}
