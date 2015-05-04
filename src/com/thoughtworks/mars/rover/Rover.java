package com.thoughtworks.mars.rover;

import java.util.HashMap;

import com.thoughtworks.mars.rover.Directions.Direction;
import com.thoughtworks.mars.rover.Directions.North;
import com.thoughtworks.mars.rover.commands.Command;
import com.thoughtworks.mars.rover.exceptions.InvalidInputDirection;
import com.thoughtworks.mars.rover.exceptions.InvalidInputPosition;
import com.thoughtworks.mars.rover.exceptions.RoverPositionOutOfBoundaryException;

public class Rover {
	protected Topography topography;
	protected RoverPosition position;
	
	public Rover(Topography t) {
		topography = t;
		Direction direction = new North();
		Coordinate coordinate = new Coordinate(0, 0);
		this.position = new RoverPosition(direction, coordinate);
	}
	
	public Topography getTopography() {
		return topography;
	}

	public void setTopography(Topography topography) {
		this.topography = topography;
	}

	public RoverPosition getPosition() {
		return position;
	}

	public void setPosition(RoverPosition position) {
		this.position = position;
	}

	public void moveLeft() {
		position.moveLeft();
	}
	
	public void moveRight() {
		position.moveRight();
	}
	
	public void move() {
		position.move(position);
		if (!isValidPosition(position))
			throw new RoverPositionOutOfBoundaryException(position);
	}
	
	public boolean isValidPosition(RoverPosition position) {
		Coordinate newCoordinates = position.getCoordinate();
		int newXCoordiante = newCoordinates.getxCoordinate();
		int newYCoordinate = newCoordinates.getyCoordinate();
		if (newXCoordiante < 0 || newXCoordiante > topography.getCoordinate().getxCoordinate())
			return false;
		if (newYCoordinate < 0 || newYCoordinate > topography.getCoordinate().getyCoordinate())
			return false;
		return true;
	}
	
	public void ExecuteCommand(String commands) {
		HashMap<String,Command> validCommands = ValidCommands.getCommand(); 
		CommandParser parser = new CommandParser(validCommands);
		char[] commandChars = commands.toCharArray();
		for(int i = 0 ; i < commandChars.length; i++) {
			String inputCommand = commandChars[i]+"";
			Command commandToExecute = parser.ExecuteCommand(inputCommand);
			commandToExecute.runCommand(this);
		}
	}
	
	public void buildRoverInitialFromInput(String input) throws InvalidInputPosition, InvalidInputDirection {
		String[] inputVars = input.split(" ");
		//there should be 3 vars - rover initial x coordinate, y coordinate, direction
		if(inputVars.length != 3)
			throw new InvalidInputPosition();
		
		int x = Integer.parseInt(inputVars[0]);
		int y = Integer.parseInt(inputVars[1]);
		Coordinate initialCoordinate = new Coordinate(x, y);
		
		Direction initialDirection;
		HashMap<String,Direction> validDirections = ValidDirections.getDirection();
		if(validDirections.containsKey(inputVars[2])) {
			initialDirection = validDirections.get(inputVars[2]);
		}
		else
			throw new InvalidInputDirection();
		 
		RoverPosition initialPosition = new RoverPosition(initialDirection, initialCoordinate);
		setPosition(initialPosition);
	}
	
	public String toString() {
		return "Rover Position: " + position ;
	}
}
