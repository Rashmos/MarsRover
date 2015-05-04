package com.thoughtworks.mars.rover;

public class East implements Direction {
	
	public Direction moveLeft() {
		return new North();
	}
	
	public Direction moveRight() {
		return new South();
	}

	@Override
	public RoverPosition move(RoverPosition position) {
		position.moveXForward();
		return position;
	}
	
	public String toString() {
		return "E";
	}
}
