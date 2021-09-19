package com.myprojects;

public class CommonRoom extends Room{
	private RoomType room_type;
	CommonRoom(int id, RoomType room_type){
		super(id);
		this.room_type = room_type;
	}
	
	public String collectData() {
		return "Common Room - ID: " + getId() + ", Room Type: " + room_type + ", Temperature: " + getTemperature() + ", Heating Enabled: " + isHeatingEnabled() + ", Cooling Enabled: " + isCoolingEnabled();
	}
}
