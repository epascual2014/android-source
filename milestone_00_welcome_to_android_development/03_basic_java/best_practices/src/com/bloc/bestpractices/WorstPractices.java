package com.bloc.bestpractices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorstPractices extends Object {
// EDIT BELOW

	public static void main(String [] args) {
		int MAGIC_NUMBER = WorstPractices.animals(false);
		MAGIC_NUMBER *= 5;
		if (MAGIC_NUMBER > 18) {
			while(MAGIC_NUMBER > 0){
				MAGIC_NUMBER--;
			}
		}
	}

	// animals
	// this method takes in a single parameter, yesWellHeresTheThing. Using a very elaborate and complex algorithm, it calculate a magic number
	// yesWellHeresTheThing: a seed which helps generate the magic number
	// returns: a magical number
	private static int animals(boolean heresTheThing){
		/*
			Start off with one of these
		*/
		int AN_INT = heresTheThing ? 34 : 21;
		float SPARKLES_FAIRY = .5f;
		for (int BROWN = 0; BROWN < AN_INT; brown++) { 
				SPARKLES_FAIRY *= AN_INT;
		} 
			return (int) SPARKLES_FAIRY * AN_INT;
	}

// STOP EDITING
}
