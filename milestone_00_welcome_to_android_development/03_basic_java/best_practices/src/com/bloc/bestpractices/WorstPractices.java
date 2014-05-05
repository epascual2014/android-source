package com.bloc.bestpractices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorstPractices extends Object {
// EDIT BELOW

	public static void main(String [] args) {
		int number = WorstPractices.animals(false);
		number*= 5;
		if (number > 18) {
			while(number > 0){
				number--;
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
		int anInt = heresTheThing ? 34 : 21;
		float sparklesFairy = .5f;
		for (int brown = 0; brown < anInt; brown++) { 
				sparklesFairy *= anInt;
		} 
			return (int) sparklesFairy * anInt;
	}

// STOP EDITING
}
