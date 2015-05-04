package com.thoughtworks.mars.rover;

public class Plateau implements Topography{
	public Coordinate plauteauCoordinate;
	
	public Plateau() {
		plauteauCoordinate = new Coordinate(0, 0);
	}

	@Override
	public void setCoordinate(int x, int y) {
		plauteauCoordinate.setxCoordinate(x);
		plauteauCoordinate.setyCoordinate(y);
	}

	@Override
	public Coordinate getCoordinate() {
		return plauteauCoordinate;
	}

	@Override
	public void buildTopographyFromInput(String plateauCoordinates) {
		String[] coordinates = plateauCoordinates.split(" ");
		int x = Integer.parseInt(coordinates[0]);
		int y = Integer.parseInt(coordinates[1]);
		this.setCoordinate(x, y);
	}
	
	
}
