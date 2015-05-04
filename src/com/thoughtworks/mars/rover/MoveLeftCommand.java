package com.thoughtworks.mars.rover;

public class MoveLeftCommand implements Command {
	public void runCommand(Rover rover) {
		rover.moveLeft();
	}
}
