package com.myprojects;

public class Apartment extends Room{
	private String owner;
	Apartment(int id, String owner) {
		super(id);
		this.owner = owner;
	}
	
	public String collectData() {
		return "Apartment - ID: " + getId() + " Owner: " + owner + " Temperature: " + getTemperature() + " Heating Enabled: " + isHeatingEnabled() + " Cooling Enabled: " + isCoolingEnabled();
	}
}
