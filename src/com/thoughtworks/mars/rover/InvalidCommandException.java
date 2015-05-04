package com.thoughtworks.mars.rover;

public class InvalidCommandException extends RuntimeException{
	/**
	 * This Error is thrown whenever the command to be executed is not in the ValidCommands class
	 * To add a new command, add it to the HashMap in the ValidCommands class.
	 */
	public InvalidCommandException() {
		super("This is not a valid command");
	}

}
