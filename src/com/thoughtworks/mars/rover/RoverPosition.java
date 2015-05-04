package com.thoughtworks.mars.rover;

import com.thoughtworks.mars.rover.Directions.Direction;

public class RoverPosition {
	private Direction direction;
	private Coordinate coordinate;
	
	public RoverPosition(int x, int y, Direction direction) {
		this.direction = direction;
		this.coordinate = new Coordinate(x, y);
	}
	
	public RoverPosition(Direction direction, Coordinate coordinate) {
		this.coordinate = coordinate;
		this.direction = direction;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	
	public void moveLeft() {
		this.direction = direction.moveLeft();
	}
	
	public void moveRight() {
		this.direction =  direction.moveRight();
	}
	
	public void move(RoverPosition currPosition) {
		RoverPosition newPosition = direction.move(currPosition);
		this.coordinate = newPosition.coordinate;
	}
	
	public void moveXForward() {
		this.coordinate.setxCoordinate(this.coordinate.getxCoordinate() + 1);
	}

	public void moveYForward() {
		this.coordinate.setyCoordinate(this.coordinate.getyCoordinate() + 1);
	}

	public void moveXBackward() {
		this.coordinate.setxCoordinate(this.coordinate.getxCoordinate() - 1);
	}

	public void moveYBackward() {
		this.coordinate.setyCoordinate(this.coordinate.getyCoordinate() - 1);
	}
	
	public String toString() {
		return "Rover Position is: " + coordinate.toString() + " " + direction.toString();
	}
}
