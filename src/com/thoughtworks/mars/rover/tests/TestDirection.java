package com.thoughtworks.mars.rover.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

import com.thoughtworks.mars.rover.*;
import com.thoughtworks.mars.rover.Directions.Direction;
import com.thoughtworks.mars.rover.Directions.East;
import com.thoughtworks.mars.rover.Directions.North;
import com.thoughtworks.mars.rover.Directions.South;
import com.thoughtworks.mars.rover.Directions.West;

public class TestDirection {
	
	/**
	 * When current Direction is North, tests for move to left and move to right
	 */
	@Test 
	public void testWhenNorthMoveLeft() {
		Direction currDirection = new North();
		Direction newDirecttion = currDirection.moveLeft();
		assertThat(newDirecttion, instanceOf(West.class));
	}
	
	@Test
	public void testWhenNorthMoveRight() {
		Direction currDirection = new North();
		Direction newDirection = currDirection.moveRight();
		assertThat(newDirection, instanceOf(East.class));
	}
	
	/**
	 * When current Direction is South, tests for move to left and move to right
	 */
	@Test
	public void testWhenSouthMoveLeft() {
		Direction currDirection = new South();
		Direction newDirection = currDirection.moveLeft();
		assertThat(newDirection, instanceOf(East.class));
	}
	
	@Test
	public void testWhenSouthMoveRight() {
		Direction currDirection = new South();
		Direction newDirection = currDirection.moveRight();
		assertThat(newDirection, instanceOf(West.class));
	}
	
	/**
	 * When current Direction is West, tests for move to left and move to right
	 */
	@Test
	public void testWhenWestMoveLeft() {
		Direction currDirection = new West();
		Direction newDirection = currDirection.moveLeft();
		assertThat(newDirection, instanceOf(South.class));
	}
	
	@Test
	public void testWhenWestMoveRight() {
		Direction currDirection = new West();
		Direction newDirection = currDirection.moveRight();
		assertThat(newDirection, instanceOf(North.class));
	}
	
	/**
	 * When current Direction is East, tests for move to left and move to right
	 */
	@Test
	public void testWhenEastMoveLeft() {
		Direction currDirection = new East();
		Direction newDirection = currDirection.moveLeft();
		assertThat(newDirection, instanceOf(North.class));
	}
	
	@Test
	public void testWhenEastMoveRight() {
		Direction currDirection = new East();
		Direction newDirection = currDirection.moveRight();
		assertThat(newDirection, instanceOf(South.class));
	}

}
