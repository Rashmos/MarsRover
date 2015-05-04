package com.thoughtworks.mars.rover.Directions;

import com.thoughtworks.mars.rover.RoverPosition;

public class North implements Direction{
	
	public Direction moveLeft() {
		return new West();
	}
	
	public Direction moveRight() {
		return new East();
	}

	@Override
	public RoverPosition move(RoverPosition position) {
		position.moveYForward();
		return position;
	}
	
	public String toString() {
		return "N";
	}
}
