package com.myprojects;
import java.util.Random;

public abstract class Room {
	private int id;
	private int temperature;
	private boolean heating_enabled;
	private boolean cooling_enabled;
	
	Room(int id){
		Random random = new Random();
		int lowerBound = 10;
		int upperBound = 40;
		this.id = id;
		temperature = random.nextInt(upperBound - lowerBound) + lowerBound;
		heating_enabled = false;
		cooling_enabled = false;
	}
	
	 public int getId() {
	        return this.id;
	 }

	 public void setId(int id) {
	        this.id = id;
	 }
	
	 public int getTemperature() {
	        return this.temperature;
	 }

	 public void setTemperature(int temp) {
	        this.temperature = temp;
	 }
	 
	 public boolean isHeatingEnabled() {
	        return this.heating_enabled;
	 }

	 public void setHeatingEnabled(boolean heating_enabled) {
	        this.heating_enabled = heating_enabled;
	 }
	 public boolean isCoolingEnabled() {
	        return this.cooling_enabled;
	 }

	 public void setCoolingEnabled(boolean cooling_enabled) {
	        this.cooling_enabled = cooling_enabled;
	 }
	 
	 public String collectData() {
		 return "ID: " + id + " Temperature: " + temperature + " Heating Enabled: " + heating_enabled + " Cooling Enabled: " + cooling_enabled;
	 }
}
