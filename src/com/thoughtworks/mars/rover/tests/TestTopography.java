package com.thoughtworks.mars.rover.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.thoughtworks.mars.rover.Plateau;
import com.thoughtworks.mars.rover.Topography;

public class TestTopography {

	@Test
	public void testTopographyRoverPositionatStart() {
		Topography plateau = new Plateau();
		plateau.setCoordinate(7, 7);
		assertEquals(7, plateau.getCoordinate().getxCoordinate());
		assertEquals(7, plateau.getCoordinate().getyCoordinate());
	}
}
