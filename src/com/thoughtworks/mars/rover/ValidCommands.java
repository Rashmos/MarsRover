package com.thoughtworks.mars.rover;

import java.util.HashMap;

import com.thoughtworks.mars.rover.commands.Command;
import com.thoughtworks.mars.rover.commands.MoveCommand;
import com.thoughtworks.mars.rover.commands.MoveLeftCommand;
import com.thoughtworks.mars.rover.commands.MoveRightCommand;

public class ValidCommands {
	private static HashMap<String, Command> validCommand;

	public static HashMap<String, Command> getCommand() {
		validCommand = new HashMap<>();
		validCommand.put("L", new MoveLeftCommand());
		validCommand.put("R", new MoveRightCommand());
		validCommand.put("M", new MoveCommand());
		return validCommand;
	}
}
