package com.thoughtworks.mars.rover.exceptions;

public class InvalidInputDirection extends Exception {
	public InvalidInputDirection() {
		super("Invalid input was entered, please check your input for the Rover's initial direction");
	}
}
