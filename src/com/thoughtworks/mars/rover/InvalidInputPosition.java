package com.thoughtworks.mars.rover;

public class InvalidInputPosition extends Exception {
	public InvalidInputPosition() {
		super("Invalid input was entered, please check your input for the Rover's initial position");
	}
}
