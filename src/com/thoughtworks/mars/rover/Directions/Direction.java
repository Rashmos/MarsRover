package com.thoughtworks.mars.rover.Directions;

import com.thoughtworks.mars.rover.RoverPosition;

public interface Direction {
	public Direction moveLeft();
	public Direction moveRight();
	public RoverPosition move(RoverPosition position);
}
