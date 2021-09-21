package com.myprojects;

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
		room2.setTemperature(20);

		building.addRoom(room1);
		building.addRoom(room2);
		building.addRoom(room3);
		building.addRoom(room4);
		
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
	public void testing() {
		System.out.println("testing executed");
	}
}
