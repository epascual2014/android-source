package com.bloc.securitypackages;

import com.bloc.securitypackages.Color;

public abstract class Fruit extends Object {
	// The name of the fruit
	private String mName;
	// Number of calories
	private int mCalories;
	// Color of the fruit
	private Color mColor;
	// Weight of the fruit, in pounds
	private double mWeight;

	public Fruit() {
		this("Apple");
		// Default fruit
	}

	public Fruit(String name) {
		this(name, 0);
	}

	public Fruit(String name, int calories) {
		this(name, calories, null);
	}

	public Fruit(String name, int calories, Color color) {
		this(name, calories, color, 0d);
	}

	public Fruit(String name, int calories, Color color, double weight) {
		this.mName = name;
		this.mCalories = calories;
		this.mColor = color;
		this.mWeight = weight;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		mName = name;
	}

	public int getCalories() {
		return mCalories;
	}

	public void setCalories(int calories) {
		mCalories = calories;
	}

	public Color getColor() {
		return mColor;
	}

	public void setColor(Color color) {
		mColor = color;
	}

	public double getWeight() {
		return mWeight;
	}

	public void setWeight(double weight) {
		mWeight = weight;
	}
}