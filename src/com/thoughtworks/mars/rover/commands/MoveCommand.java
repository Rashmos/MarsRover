package com.thoughtworks.mars.rover.commands;

import com.thoughtworks.mars.rover.Rover;

public class MoveCommand implements Command {
	public void runCommand(Rover rover) {
		rover.move();
	}
}
