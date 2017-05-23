package com.packtpublishing.tddjava.ch04ship;

import org.testng.annotations.*;

import static org.testng.Assert.*;

@Test
public class ShipSpec {

	private Location location;
	private Ship ship;
	
	@BeforeTest
	public void beforeTest(){
		location = new Location(
				new Point(21,13), 
				Direction.NORTH
		);
		ship = new Ship(location);
	}

	public void whenInstantiatedThenLocationIsSet(){
		assertEquals(location, ship.getLocation());
	}
	
	public void whenForwardThenForward(){
		Location expected = this.location.copy();
		expected.forward();
		ship.moveForward();
		assertEquals(ship.getLocation(),expected);
	}
	
	public void whenBackwardThenBackward(){
		Location expected = this.location.copy();
		expected.backward();
		ship.moveBackward();
		assertEquals(ship.getLocation(),expected);
	}
}
