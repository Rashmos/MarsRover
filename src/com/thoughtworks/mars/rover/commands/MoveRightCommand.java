package com.thoughtworks.mars.rover.commands;

import com.thoughtworks.mars.rover.Rover;

public class MoveRightCommand implements Command {
	public void runCommand(Rover rover) {
		rover.moveRight();
	}
}
