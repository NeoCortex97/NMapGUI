package com.uniovi.nmapgui.model.menu;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="menu")
public class Menu {
	
	private List<Submenu> submenus = new ArrayList<>();

	@XmlElement(name="submenu")
	public List<Submenu> getSubmenus() {
		return submenus;
	}

	public void setSubmenus(List<Submenu> submenus) {
		this.submenus = submenus;
	}

}
