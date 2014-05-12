package com.bloc.objects;

class Song extends Object {
	// The ensemble which produced it
	Ensemble mEnsemble;
	// Title of the song
	String mTitle;
	// The year it was released
	int mYearReleased;

	/*
	 * Basic Constructor
	 * Side-effects: Assigns some default ensemble, title and
	 *				 and year of your choosing
	 */
	// CONSTRUCTOR CODE GOES HERE
	Song(){
		this.mEnsemble = new Ensemble(new Artist[] { new Artist("Kurt","Cobain")}); // new array, inside the array is a new element 
		this.mTitle = "In Utero";
		this.mYearReleased = 1992;
	}
	/*
	 * Partial Constructor
	 * Side-effects: Sets the year of release to 0
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 */
	// CONSTRUCTOR CODE GOES HERE
	Song(Ensemble mEnsemble, String title){
		this.mYearReleased = 0;
		this.mEnsemble = mEnsemble;
		this.mTitle = title;
	}	

	/*
	 * Full Constructor
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 * @param yearReleased the year the song was released
	 */
	// CONSTRUCTOR CODE GOES HERE
	Song(Ensemble mEnsemble, String title, int year){
		this.mEnsemble = mEnsemble;
		this.mTitle = title;
		this.mYearReleased = year;
	}
}