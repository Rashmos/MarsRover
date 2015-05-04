package com.thoughtworks.mars.rover;

public interface Direction {
	public Direction moveLeft();
	public Direction moveRight();
	public RoverPosition move(RoverPosition position);
}
