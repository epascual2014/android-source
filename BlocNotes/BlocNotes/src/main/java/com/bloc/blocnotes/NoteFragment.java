package com.bloc.blocnotes;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * A placeholder fragment containing a simple view.
 */
public class NoteFragment extends Fragment {

    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */

    private static final String EDIT_TEXT = "My_Edit_Text";

    private EditText myEditText;


    public static NoteFragment newInstance(int sectionNumber) {
        NoteFragment fragment = new NoteFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }


    public NoteFragment() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
           /* FragmentManager fragmentManager = getFragmentManager(); // Calling a FragmentManager to manage Fragments.
            fragmentManager.beginTransaction() //start of the transaction
                    .replace(R.id.container, NoteFragment.newInstance(position + ))
                    .commit();*/
        View rootView = inflater.inflate(R.layout.fragment_bloc_notes, container, false);


        myEditText = (EditText) rootView.findViewById(R.id.my_edit_text_note_fragment);
        return rootView;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (savedInstanceState != null){
            String myEdit = savedInstanceState.getString(EDIT_TEXT); // Data type String (myEdit) is where we store the string EDIT TEXT.
            myEditText.setText(myEdit);  //  here we call the saved text myEDIT.

            //Toast.makeText(getActivity(), myEdit, Toast.LENGTH_SHORT).show(); // testing if its being saved.
        }

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString(EDIT_TEXT, myEditText.getText().toString());// Saving the string in a value that will be return
        //Toast.makeText(getActivity(), "try it", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((BlocNotes) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
       // Toast.makeText(activity, "It's working!", Toast.LENGTH_LONG).show();
    }

}
