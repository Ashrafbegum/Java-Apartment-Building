package com.myprojects;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBuilding {
	@Test
	public void testHeatCool() {
		Building building = new Building(25);
		
		Room room1 = new Apartment(101, "Ashraf");
		Room room2 = new Apartment(102, "Khan");
		Room room3 = new CommonRoom(201, RoomType.GYM);
		Room room4 = new CommonRoom(202, RoomType.LIBRARY);
		
		room1.setTemperature(27);
		room2.setTemperature(17);
		room3.setTemperature(30);
		room4.setTemperature(20);

		building.addRoom(room1);
		building.addRoom(room2);
		building.addRoom(room3);
		building.addRoom(room4);
		
		List<Room> allRooms = building.getRooms();
		
		BuildingControl buildControl = new BuildingControl();
		buildControl.setHeatCool(building, allRooms);
				
		Assert.assertEquals(false, room1.isHeatingEnabled());
		Assert.assertEquals(true, room1.isCoolingEnabled());
		
		Assert.assertEquals(true, room2.isHeatingEnabled());
		Assert.assertEquals(false, room2.isCoolingEnabled());
		
		Assert.assertEquals(false, room3.isHeatingEnabled());
		Assert.assertEquals(true, room3.isCoolingEnabled());
		
		Assert.assertEquals(true, room4.isHeatingEnabled());
		Assert.assertEquals(false, room4.isCoolingEnabled());
		
	}
	
	@Test
	public void testCollectData() {
		Building building = new Building(25);
		
		Room room1 = new Apartment(101, "Ashraf");
		Room room2 = new Apartment(102, "Khan");
		Room room3 = new CommonRoom(201, RoomType.GYM);
		Room room4 = new CommonRoom(202, RoomType.LIBRARY);
	
		room1.setTemperature(27);
		room2.setTemperature(17);
		room3.setTemperature(30);
		room4.setTemperature(20);
		
		building.addRoom(room1);
		building.addRoom(room2);
		building.addRoom(room3);
		building.addRoom(room4);
		
	    List<Room> allRooms = building.getRooms();
		
		BuildingControl buildControl = new BuildingControl();
		buildControl.setHeatCool(building, allRooms);
			
		String resultString1 = "Apartment - ID: 101, Owner: Ashraf, Temperature: 27, Heating Enabled: false, Cooling Enabled: true";
		Assert.assertEquals(resultString1, room1.collectData());
		
		String resultString2 = "Apartment - ID: 102, Owner: Khan, Temperature: 17, Heating Enabled: true, Cooling Enabled: false";
		Assert.assertEquals(resultString2, room2.collectData());
		
		String resultString3 = "Common Room - ID: 201, Room Type: GYM, Temperature: 30, Heating Enabled: false, Cooling Enabled: true";
		Assert.assertEquals(resultString3, room3.collectData());
		
		String resultString4 = "Common Room - ID: 202, Room Type: LIBRARY, Temperature: 20, Heating Enabled: true, Cooling Enabled: false";
		Assert.assertEquals(resultString4, room4.collectData());
	}
	
	@Test 
	public void testing() {
		System.out.println("testing executed");
	}
}
