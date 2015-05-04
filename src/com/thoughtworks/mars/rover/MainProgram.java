package com.thoughtworks.mars.rover;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.thoughtworks.mars.rover.exceptions.InvalidInputDirection;
import com.thoughtworks.mars.rover.exceptions.InvalidInputPosition;


public class MainProgram {
	
	public static void main(String args[]) throws IOException, InvalidInputPosition, InvalidInputDirection  {
		String filename = args[0];
		File inputFile = new File(filename);
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		String line = br.readLine();
		//first line is the top right corner of the plateau, ex: 5 5
		String plateauCoordinates = line;
		Topography plateau = new Plateau();
		plateau.buildTopographyFromInput(plateauCoordinates);
		
		//Next 2 lines: 1st line gets the rover's initial position, 2nd line gets the commands
		String line1, line2 ;
		while((line1 = br.readLine()) != null && (line2 = br.readLine()) != null) {
			Rover rover = new Rover(plateau);
			rover.buildRoverInitialFromInput(line1);
			rover.ExecuteCommand(line2);
			System.out.println(rover);
		}
		
		
	}

}
