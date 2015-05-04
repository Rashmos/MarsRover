package com.thoughtworks.mars.rover;

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
