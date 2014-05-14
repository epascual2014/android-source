package com.bloc.securitypackages.fruits.apples;

public class Macintosh extends Apple {

	Macintosh() {
		super(Macintosh.class.getSimpleName(), 200, new Red(), 0.14d);
	}

	public void bite() {
		setWeight(getWeight() - 0.01d);
	}

}