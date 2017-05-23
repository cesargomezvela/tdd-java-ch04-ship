package com.packtpublishing.tddjava.ch04ship;

public class Ship {
	private final Location location;
	
	public Ship( Location location ){
		this.location = location;
	}
	
	public Location getLocation(  ){
		return this.location;
	}
	
	public void moveForward(){
		this.location.forward();
	}
	
	public void moveBackward(){
		this.location.backward();
	}
}
