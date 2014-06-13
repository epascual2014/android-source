package com.bloc.threads;

import java.net.URL;
import java.io.*;

import javax.imageio.*;

import java.awt.image.BufferedImage;

public class Main extends Object {
		

	public static void main(String [] args) throws InterruptedException {
		
		// Move the try catch to imageGetter, turn imageGetter into a thread (extend thread or implement runable.)
		// Replace try catch to Imagegetter and run it.
		ImageGetter mImage = new ImageGetter(); // create a var and store it to be able to call it later
		mImage.start();
		mImage.join();
	
		File logo = new File("google_logo.png");
		boolean exists = false;
		try {
			exists = logo.exists();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

		// ^^^ Extract the above to ImageGetter

		// This shouldn't exist yet, therefore we should be able to print 
		if (exists == true) {
			System.out.println("/************************/");
			System.out.println("/*                      */");
			System.out.println("/*                      */");
			System.out.println("/*   If you see this,   */");
			System.out.println("/*   congratulations!   */");
			System.out.println("/*                      */");
			System.out.println("/*                      */");
			System.out.println("/************************/");	
		}
	}
}
