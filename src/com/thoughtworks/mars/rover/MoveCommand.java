package com.thoughtworks.mars.rover;

public class MoveCommand implements Command {
	public void runCommand(Rover rover) {
		rover.move();
	}
}
