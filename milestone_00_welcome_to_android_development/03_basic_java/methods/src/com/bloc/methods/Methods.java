package com.bloc.methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

import com.bloc.test.Test;

public class Methods extends Object {

	public static void main(String [] args) {
		Methods methods = new Methods();
		Method method = null;
		if ((method = Test.testMethods(methods)) == null) {
			System.out.println("Excellent, all of your methods worked!\n");
		} else {
			System.out.println("Looks like your \'" + method.getName() + "\' method has an issue with it.\n");
		}
	}

	public boolean giveMeTheOpposite(boolean original) {

		/*
		 * ASSIGNMENT:
		 * Return the logical opposite of the passed parameter 'original'
		 */
		return !original;
	}

	public void flipTheSign(int[] numbers) {
		for (int i = 0; i < numbers.length; i++){
			numbers[i] =  -numbers[i];
		}
		/*
		 * ASSIGNMENT:
		 * For all the integers in the array, reverse their sign:
		 * e.g. {1, 54, -12} becomes {-1, -54, 12}
		 */
	}

	public boolean[] boolsRule(int floor, int[] someNumbers) {
		boolean[] array = new boolean [someNumbers.length]; // stored new array [what size of array]
		for (int i = 0; i < someNumbers.length; i++){ // loop
			array[i] = someNumbers[i] >= floor; 
		}	
			return array;
		/*
		 * ASSIGNMENT:
		 * This method returns an array of booleans of length someNumbers.length
		 * Each boolean represents whether that corresponding entry in the integer
		 * array is at least 'floor' e.g.
		 * {0, 5, 18, 2} with a floor of 6 returns {false, false, true, false}
		 */
	}

	public int[] getMinAndMax(int[] someNumbers) {
		
		int smallNumber = someNumbers[0]; // set which element in the array will be the smallest number
		int highNumber = someNumbers[0]; // set which element in the array will be the highest number
		for (int i = 0; i < someNumbers.length; i++) {
			if ( someNumbers[i] >= highNumber) {
				highNumber = someNumbers[i]; 
			} 
			if ( someNumbers[i] <= smallNumber) {
					smallNumber = someNumbers[i];
			}
		}
		/*
		 * ASSIGNMENT:
		 * This method returns an array of length 2, the 0th index should contain
		 * the smallest number from within someNumbers and the 1st index must
		 * be the largest e.g.
		 * {3, 6, 202, 2, 9986, 5} returns {2, 9986}
		 */
		return new int[] {smallNumber, highNumber}; // return value, w/ small and high number from array
	}
}
