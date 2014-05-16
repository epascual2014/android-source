package com.bloc.securitypackages.fruits;

import com.bloc.securitypackages.Fruit;
import com.bloc.securitypackages.color.OrangeRed;


public class Grapefruit extends Fruit {
	public Grapefruit() {
		super(Grapefruit.class.getSimpleName(), 210, new OrangeRed(), .48d);
	}
}