package com.thoughtworks.mars.rover;

import java.util.HashMap;

import com.thoughtworks.mars.rover.commands.Command;
import com.thoughtworks.mars.rover.exceptions.InvalidCommandException;

public class CommandParser {
	private HashMap<String, Command> commands;
	
	public CommandParser(HashMap<String, Command> validCommands) {
		commands = validCommands;
	}
	
	public Command ExecuteCommand(String commandToExecute) {
		if(commands.containsKey(commandToExecute))
			return commands.get(commandToExecute);
		else
			throw new InvalidCommandException();
	}

}
