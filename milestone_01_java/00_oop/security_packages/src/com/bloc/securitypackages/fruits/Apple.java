package com.bloc.securitypackages.fruits;

import com.bloc.securitypackages.Fruit;
import com.bloc.securitypackages.Color;

public abstract class Apple extends Fruit {
	
	public Apple(String name, int calories, Color color, double weight){
		super(name, calories, color, weight);
	}

	public abstract void bite();

}