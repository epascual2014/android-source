package com.bloc.securitypackages.fruits;

import com.bloc.securitypackages.color.LimeGreen;
import com.bloc.securitypackages.fruits.Apple;

public class Green extends Apple {

	public Green() {
		super(Green.class.getSimpleName(), 230, new LimeGreen(),.21d);
	}

	public void bite() {
		setWeight(getWeight() - 0.02d);
	}

}