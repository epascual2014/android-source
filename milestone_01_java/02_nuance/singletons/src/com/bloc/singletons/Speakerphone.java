package com.bloc.singletons;

import java.util.ArrayList;

/*
 * This is a singleton class which maintains communication
 * between classes and Listeners
 */
public class Speakerphone extends Object {
	/*
	 * get
	 * @return the singleton instance of Speakerphone
	 */
	private static Speakerphone speakerPhone = new Speakerphone();
	private static ArrayList<Listener>mListeners = new ArrayList<Listener>();
	
	public static Speakerphone get(){
		return speakerPhone;
	}
	
	/*
	 * addListener
	 * Add a listener to Speakerphone's list
	 * @param listener an instance of the Listener interface
	 */
	public void addListener(Listener listener){
		mListeners.add(listener);
	}
	
	/*
	 * removeListener
	 * Remove a Listener from the Speakerphone's list
	 * @param listener the Listener to remove
	 */
	public void removeListener(Listener remove){
		mListeners.remove(remove);
	}

	/*
	 * shoutMessage
	 * Sends the message to all of the Listeners tracked by Speakerphone
	 * @param talker a Talker whose message will be sent
	 */
	public static void shoutMessage(Talker talker){
		String gotMessage = talker.getMessage().trim();
		for (int i = 0; i < mListeners.size(); ++i){ // Loop from 0 to 1 less than mListener's size (loop over all mListeners)
			Listener listener = mListeners.get(i); // Get a reference of the current Listener in mListener and store it in a local listener variable
			listener.onMessageReceived(gotMessage); // get message and pass it to the listeners
		}
	}
	
	/*
	 * shoutMessage
	 * Sends the message to all of the Listeners which are instances of
	 * the class parameter
	 * @param talker a Talker whose message will be sent
	 * @param cls a Class object representing the type which the Listener
	 *			  should extend from in order to receive the message
	 *
	 * HINT: see Class.isAssignableFrom()
	 *		 http://docs.oracle.com/javase/7/docs/api/java/lang/Class.html#isAssignableFrom(java.lang.Class)
	 */
	public static void shoutMessage(Talker talker, Class<?> myClass){
		String gotMessage = talker.getMessage().trim();
		for (int i = 0; i < mListeners.size(); ++i){ // loops message to all listeners 
			Listener listener = mListeners.get(i); // created local listener and stored mesage
			if (myClass.isAssignableFrom(listener.getClass())) { // check specific listener if matches with class instance
				listener.onMessageReceived(gotMessage); //once received, send message out.
			} 
		}
		 
	}
	
	/*
	 * removeAll
	 * Removes all Listeners from Speakerphone
	 */
	public static void removeAll(){
		
	}
}