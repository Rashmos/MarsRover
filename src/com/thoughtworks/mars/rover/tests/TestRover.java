package com.thoughtworks.mars.rover.tests;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;

import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.mars.rover.Coordinate;
import com.thoughtworks.mars.rover.Plateau;
import com.thoughtworks.mars.rover.Rover;
import com.thoughtworks.mars.rover.RoverPosition;
import com.thoughtworks.mars.rover.Topography;
import com.thoughtworks.mars.rover.Directions.East;
import com.thoughtworks.mars.rover.Directions.North;
import com.thoughtworks.mars.rover.Directions.West;
import com.thoughtworks.mars.rover.exceptions.RoverPositionOutOfBoundaryException;

public class TestRover {
	
	private Topography topography;
	
	@Before
	public void setUp() {
		topography = new Plateau();
		topography.setCoordinate(7, 7);
	}

	@Test
	public void testOnCreateRoverDirectionNorth() {
		Rover rover = new Rover(topography);
		RoverPosition position = rover.getPosition();
		assertThat(position.getDirection(), instanceOf(North.class));
	}
	
	@Test
	public void testMoveLeftFromNorth() {
		Rover rover = new Rover(topography);
		rover.moveLeft();
		RoverPosition position = rover.getPosition();
		assertThat(position.getDirection(), instanceOf(West.class));
	}
	
	@Test
	public void testMoveRightFromNorth() {
		Rover rover = new Rover(topography);
		rover.moveRight();
		RoverPosition position = rover.getPosition();
		assertThat(position.getDirection(), instanceOf(East.class));
	}
	
	@Test
	public void testMoveWhenInNorth() {
		Rover rover = new Rover(topography); //Rover begins in North direction
		rover.move();
		RoverPosition position = rover.getPosition();
		Coordinate coordiante = position.getCoordinate();
		assertEquals(0, coordiante.getxCoordinate());
		assertEquals(1, coordiante.getyCoordinate());
	}
	
	@Test 
	public void testMoveWhenInEast() {
		Rover rover = new Rover(topography); //Rover begins in North direction
		rover.moveRight(); //Now in East direction
		rover.move();
		RoverPosition position = rover.getPosition();
		Coordinate coordiante = position.getCoordinate();
		assertEquals(1, coordiante.getxCoordinate());
		assertEquals(0, coordiante.getyCoordinate());
	}
	
	@Test (expected = RoverPositionOutOfBoundaryException.class)
	public void testMoveWhenInSouth() {
		Rover rover = new Rover(topography); //Rover begins in North direction
		rover.moveRight(); //Now in East direction
		rover.moveRight(); //Now in South direction
		rover.move();
		RoverPosition position = rover.getPosition();
		Coordinate coordiante = position.getCoordinate();
		assertEquals(0, coordiante.getxCoordinate());
		assertEquals(-1, coordiante.getyCoordinate());
	}

}
