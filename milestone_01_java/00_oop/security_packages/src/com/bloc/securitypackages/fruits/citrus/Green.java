package com.bloc.securitypackages.fruits.citrus;

public class Green extends Apple {

	Green() {
		super(Green.class.getSimpleName(), 230, new LimeGreen(), 0.21d);
	}

	public void bite() {
		setWeight(getWeight() - 0.02d);
	}

}