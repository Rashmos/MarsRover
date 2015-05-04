package com.thoughtworks.mars.rover.tests;

import org.junit.Test;

import static org.junit.Assert.*;

import com.thoughtworks.mars.rover.*;
import com.thoughtworks.mars.rover.Directions.Direction;
import com.thoughtworks.mars.rover.Directions.East;
import com.thoughtworks.mars.rover.Directions.North;

import static org.hamcrest.CoreMatchers.instanceOf;

public class TestProject {

	@Test
	public void testExampleOne() {
		Topography plateau = new Plateau();
		plateau.setCoordinate(5, 5);
		Rover rover = new Rover(plateau);
		Coordinate initialPosition = new Coordinate(1, 2);
		Direction initialDirection = new North();
		RoverPosition startPoisiton = new RoverPosition(initialDirection, initialPosition);
		rover.setPosition(startPoisiton);
		
		String commands = "LMLMLMLMM";
		rover.ExecuteCommand(commands);
		RoverPosition newPosition = rover.getPosition();
		assertEquals(1, newPosition.getCoordinate().getxCoordinate());
		assertEquals(3, newPosition.getCoordinate().getyCoordinate());
		assertThat(newPosition.getDirection(), instanceOf(North.class));		
	}
	
	@Test
	public void testExampleTwo() {
		Topography plateau = new Plateau();
		plateau.setCoordinate(5, 5);
		Rover rover = new Rover(plateau);
		Coordinate initialPosition = new Coordinate(3, 3);
		Direction initialDirection = new East();
		RoverPosition startPoisiton = new RoverPosition(initialDirection, initialPosition);
		rover.setPosition(startPoisiton);
		
		String commands = "MMRMMRMRRM";
		rover.ExecuteCommand(commands);
		RoverPosition newPosition = rover.getPosition();
		assertEquals(5, newPosition.getCoordinate().getxCoordinate());
		assertEquals(1, newPosition.getCoordinate().getyCoordinate());
		assertThat(newPosition.getDirection(), instanceOf(East.class));	
	}
}
