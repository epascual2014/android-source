package com.bloc.securitypackages;

// YOUR IMPORTS GO HERE
// import com.bloc.{your_package};
import com.bloc.apples;
import com.bloc.colors;
import com.bloc.citrus;

public class Main extends Object {

	public static void main(String [] args) {
		Fruit[] fruits = new Fruits[4];
		fruits[0] = new Macintosh();
		fruits[1] = new Green();
		fruits[2] = new Orange();
		fruits[3] = new Grapefruit();

		Color[] colors = new Colors[5];
		colors[0] = fruits[0].getColor();
		colors[0] = fruits[1].getColor();
		colors[0] = fruits[2].getColor();
		colors[0] = fruits[3].getColor();
		colors[4] = new OrangeColor();

		
		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/*   If you see this,   */");
		System.out.println("/*   congratulations!   */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}
}
