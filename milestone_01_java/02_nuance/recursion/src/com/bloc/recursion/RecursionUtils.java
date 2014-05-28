package com.bloc.recursion;

import java.util.*;

public class RecursionUtils extends Object {
	/*
	 * findMaxRecursively
	 * Takes a list of numbers and finds the largest among them
	 * using recursive calls.
	 *
	 * @param numbers a list of numbers, can be odd or even numbered
	 * @return the largest number in the list
	 *
	 * Hint: your base case may be a comparison of 2 numbers
	 */
	
	public static final int findMaxRecursively(List<Integer> numbers) {
		// IMPLEMENT ME
		if (numbers.size() == 1){ // size of list equals to 1
			return numbers.get(0); // returns the first element
		} else {
			int numStored = numbers.get(0); // store info
			int maxOfRest = findMaxRecursively(numbers.subList(1, numbers.size())); // the max number the rest of the array not including stored list
			return Math.max(numStored, maxOfRest);
		}
		
	}
}
		/*
		int count = 1, max = 1;
		List<Integer> numbers = new List<Integer>();
		for (int i = 1; i < numbers.length; ++i) {
			if (numbers[i] >= numbers[i-1]) {
				count++;
			} else {
				if (count > max) {
					max = count;
				}
				count = 1;
			}
		}
		return 0;
	}*/
