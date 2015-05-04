package com.thoughtworks.mars.rover.Directions;

import com.thoughtworks.mars.rover.RoverPosition;

public class South implements Direction{
	
	public Direction moveLeft() {
		return new East();
	}
	
	public Direction moveRight() {
		return new West();
	}
	
	@Override
	public RoverPosition move(RoverPosition position) {
		position.moveYBackward();
		return position;
	}
	
	public String toString() {
		return "S";
	}

}
