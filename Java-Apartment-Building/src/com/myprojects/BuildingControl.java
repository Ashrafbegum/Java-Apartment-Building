package com.myprojects;

import java.util.List;

public class BuildingControl {
	public static void main(String[] args) {	
		Building building = new Building(25);

		Room room1 = new Apartment(101, "Ashraf");
		Room room2 = new Apartment(102, "Khan");
		Room room3 = new CommonRoom(201, RoomType.GYM);
		Room room4 = new CommonRoom(202, RoomType.LIBRARY);

		building.addRoom(room1);
		building.addRoom(room2);
		building.addRoom(room3);
		building.addRoom(room4);
		
		List<Room> allRooms = building.getRooms();
		BuildingControl buildControl = new BuildingControl();
		buildControl.setHeatCool(building, allRooms);
	}
		public void setHeatCool(Building building, List<Room> allRooms) {
			allRooms.stream().forEach((room) -> {
				if(room.getTemperature() > building.getSetpoint()) {
					room.setCoolingEnabled(true);
				} else {
					room.setCoolingEnabled(false);
				}
				
				if(room.getTemperature() < building.getSetpoint()) {
					room.setHeatingEnabled(true);
				} else {
					room.setHeatingEnabled(false);
				}
				System.out.println(room.collectData());
		});
	}
}
