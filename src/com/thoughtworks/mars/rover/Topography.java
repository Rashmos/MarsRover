package com.thoughtworks.mars.rover;

public interface Topography {	
	public void setCoordinate(int x, int y);
	public Coordinate getCoordinate();
	public void buildTopographyFromInput(String topographyCoordinates);
}
