package com.myprojects;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Building {
	private List<Apartment> apartments;
	private List<CommonRoom> commonRooms;
	private int setpoint;
	final int DEFAULT_SETPOINT = 20;
	
	Building(){
		this.setpoint = DEFAULT_SETPOINT;
		apartments = new ArrayList<Apartment>();
		commonRooms = new ArrayList<CommonRoom>();
	}
	
	Building(int setPoint){
		this.setpoint = setPoint;
		apartments = new ArrayList<Apartment>();
		commonRooms = new ArrayList<CommonRoom>();
	}
	
	public int getSetpoint() {
		return setpoint;
	}

	public void addRoom(Room room) {
		if (room instanceof Apartment) {
			apartments.add((Apartment) room);
		} if (room instanceof CommonRoom) {
			commonRooms.add((CommonRoom) room);
		}
	}
	
	public List<Room> getRooms() {
		List<Room> rooms = Stream.concat(apartments.stream(), commonRooms.stream()).collect(Collectors.toList());
		return rooms;
	}
}
