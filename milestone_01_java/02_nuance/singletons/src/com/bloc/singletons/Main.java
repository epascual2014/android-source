package com.bloc.singletons;

import com.bloc.singletons.listeners.AudienceMember;
import com.bloc.singletons.listeners.Child;
import com.bloc.singletons.listeners.Pet;
import com.bloc.singletons.talkers.Parent;
import com.bloc.singletons.talkers.PetOwner;
import com.bloc.singletons.talkers.Singer;


public class Main extends Object {

	public static void main(String [] args) {
		// Instantiate some talkers and some listeners
	 	Listener audienceMember = new AudienceMember();
	 	Listener child = new Child();
	 	Listener pet = new Pet();
	 	Talker parent = new Parent();
	 	Talker petOwner = new PetOwner();
	 	Talker singer = new Singer();

	 	// Register listeners (use static get each time to prove its the same instance)
	 	Speakerphone.get().addListener(audienceMember);
	 	Speakerphone.get().addListener(child);
	 	Speakerphone.get().addListener(pet);

	 	// Send messages!
	 	Speakerphone.get().shoutMessage(parent);
	 	Speakerphone.get().shoutMessage(petOwner);
	 	Speakerphone.get().shoutMessage(singer);
	 	Speakerphone.get().shoutMessage(parent, Child.class);
		
		
	}
}
