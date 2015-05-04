package com.thoughtworks.mars.rover.commands;

import com.thoughtworks.mars.rover.Rover;

public interface Command {
	void runCommand(Rover rover);
}
