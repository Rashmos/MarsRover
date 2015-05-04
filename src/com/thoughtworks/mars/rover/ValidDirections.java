package com.thoughtworks.mars.rover;

import java.util.HashMap;

import com.thoughtworks.mars.rover.Directions.Direction;
import com.thoughtworks.mars.rover.Directions.East;
import com.thoughtworks.mars.rover.Directions.North;
import com.thoughtworks.mars.rover.Directions.South;
import com.thoughtworks.mars.rover.Directions.West;

public class ValidDirections {
	private static HashMap<String, Direction> validDirections;

	public static HashMap<String, Direction> getDirection() {
		validDirections = new HashMap<>();
		validDirections.put("N", new North());
		validDirections.put("S", new South());
		validDirections.put("W", new West());
		validDirections.put("E", new East());
		return validDirections;
	}
}
