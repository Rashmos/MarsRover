package com.thoughtworks.mars.rover.exceptions;

public class InvalidInputPosition extends Exception {
	public InvalidInputPosition() {
		super("Invalid input was entered, please check your input for the Rover's initial position");
	}
}
