package com.bloc.inherit;

// CLASS DEFINITION GOES HERE
// Chihuahuas have a high metabolism, they only grow to a new size after being fed 5 times
class Chihuahua extends Dog {
	@override
	void feed(){
		dogMeal = dogMeal + 1; // or dogMeal++
		if (dogMeal % 5 == 0){ 
			// dog grows into new size
		}
			
	}
}