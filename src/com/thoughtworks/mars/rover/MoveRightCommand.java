package com.thoughtworks.mars.rover;

public class MoveRightCommand implements Command {
	public void runCommand(Rover rover) {
		rover.moveRight();
	}
}
