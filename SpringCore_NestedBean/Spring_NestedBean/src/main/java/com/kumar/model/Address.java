package com.kumar.model;

public class Address {
	
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Address() {
		super();
		
	}

	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}
	
	

}
