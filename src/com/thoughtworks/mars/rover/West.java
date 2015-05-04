package com.thoughtworks.mars.rover;

public class West implements Direction{
	
	public Direction moveLeft() {
		return new South();
	}
	
	public Direction moveRight() {
		return new North();
	}

	@Override
	public RoverPosition move(RoverPosition position) {
		position.moveXBackward();
		return position;
	}
	
	public String toString() {
		return "W";
	}
}
