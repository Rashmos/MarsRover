package com.thoughtworks.mars.rover;

public class RoverPositionOutOfBoundaryException extends RuntimeException{
	/**
	 * This Error is thrown whenever the rover's coordinates fall outside the
	 * boundary of the Topograph it is on. 
	 * 0 <= x coordinate <= topograph bound
	 * 0 <= y coordinate <= topograph bound
	 * @param position
	 */
	public RoverPositionOutOfBoundaryException(RoverPosition position) {
		super("Rover Position is out of bounds");
	}
}
