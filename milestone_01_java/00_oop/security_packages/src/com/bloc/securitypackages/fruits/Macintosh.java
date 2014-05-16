package com.bloc.securitypackages.fruits;


import com.bloc.securitypackages.fruits.Apple;

import com.bloc.securitypackages.Fruit;

import com.bloc.securitypackages.Color;

import com.bloc.securitypackages.color.Red;



public class Macintosh extends Apple {

	public Macintosh() {
		super(Macintosh.class.getSimpleName(), 200, new Red(), 0.14d);
	}

	public void bite() {
		setWeight(getWeight() - 0.01d);
	}

}