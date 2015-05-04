package com.thoughtworks.mars.rover.tests;

import org.junit.Test;
import org.junit.Before;

import java.util.HashMap;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;

import com.thoughtworks.mars.rover.*;
import com.thoughtworks.mars.rover.commands.Command;
import com.thoughtworks.mars.rover.commands.MoveCommand;
import com.thoughtworks.mars.rover.commands.MoveLeftCommand;
import com.thoughtworks.mars.rover.commands.MoveRightCommand;
import com.thoughtworks.mars.rover.exceptions.InvalidCommandException;

public class CommandParserTest {
	private HashMap<String,Command> commands;
	
	@Before
	public void setUp() {
		commands = ValidCommands.getCommand();
	}
	
	@Test
	public void testGetMoveCommand() {
		CommandParser parser = new CommandParser(commands);
		Command moveCommand = parser.ExecuteCommand("M");
		assertThat(moveCommand, instanceOf(MoveCommand.class));
	}
	
	@Test
	public void testGetMoveLeftCommand() {
		CommandParser parser = new CommandParser(commands);
		Command moveCommand = parser.ExecuteCommand("L");
		assertThat(moveCommand, instanceOf(MoveLeftCommand.class));
	}
	
	@Test
	public void testGetMoveRightCommand() {
		CommandParser parser = new CommandParser(commands);
		Command moveCommand = parser.ExecuteCommand("R");
		assertThat(moveCommand, instanceOf(MoveRightCommand.class));
	}
	
	@Test (expected = InvalidCommandException.class)
	public void testGetInvalidCommand() {
		CommandParser parser = new CommandParser(commands);
		Command moveCommand = parser.ExecuteCommand("X");
	}
	
	
	

}
