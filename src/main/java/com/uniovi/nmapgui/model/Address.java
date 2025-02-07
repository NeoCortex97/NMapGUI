package com.uniovi.nmapgui.model;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="address")
public class Address {
	
	private String address;

    public Address(String address) {
		setAddress(address);
	}
    public Address(){}

	@XmlAttribute(name="addr")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [address=" + getAddress() + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (address == null) {
			return other.address == null;
		} else return address.equals(other.address);
	}
    
	

}
