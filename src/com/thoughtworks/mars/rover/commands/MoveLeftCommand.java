package com.thoughtworks.mars.rover.commands;

import com.thoughtworks.mars.rover.Rover;

public class MoveLeftCommand implements Command {
	public void runCommand(Rover rover) {
		rover.moveLeft();
	}
}
