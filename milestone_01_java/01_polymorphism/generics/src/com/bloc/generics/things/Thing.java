package com.bloc.generics.things;

public class Thing <T>extends Object {
	private T mName;

	public Thing(T name) {
		mName = name;
	}
}