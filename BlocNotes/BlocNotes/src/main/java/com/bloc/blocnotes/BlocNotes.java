package com.bloc.blocnotes;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;


public class BlocNotes extends Activity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;
    private String myEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloc_notes);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));

        FragmentManager fragmentManager = getFragmentManager(); // Calling a FragmentManager to manage Fragments.
        NoteFragment noteFragment = (NoteFragment) fragmentManager.findFragmentById(R.id.container);
        if (noteFragment == null) {
            noteFragment = NoteFragment.newInstance(0);
            fragmentManager.beginTransaction().
                    replace(R.id.container, noteFragment).commit();
        }

        if (savedInstanceState != null) {
            savedInstanceState.getString("mEdit", myEdit);
            return;
        }


    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Toast.makeText(getApplicationContext(), "hi there", Toast.LENGTH_SHORT).show();
     }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }



    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getFragmentManager(); // Calling a FragmentManager to manage Fragments.
        fragmentManager.beginTransaction() //start of the transaction
                .replace(R.id.container, NoteFragment.newInstance(position + 1))
                .commit();
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                break;
            case 4:
                mTitle = getString(R.string.title_section4);
                break;
            case 5:
                mTitle = getString(R.string.title_section5);
                break;
            case 6:
                mTitle = getString(R.string.title_section6);
                break;

        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.bloc_notes, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    /**
     * A placeholder fragment containing a simple view.
     */
    public static class NoteFragment extends Fragment {

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

        private EditText mEditText;


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
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);

            if (savedInstanceState != null){
                String myEdit = savedInstanceState.getString(EDIT_TEXT); // Data type String (myEdit) is where we store the string EDIT TEXT.
                mEditText.setText(myEdit);  //  here we call the saved text myEDIT.
                Toast.makeText(getActivity(), myEdit, Toast.LENGTH_SHORT).show();
            }

        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
           /* FragmentManager fragmentManager = getFragmentManager(); // Calling a FragmentManager to manage Fragments.
            fragmentManager.beginTransaction() //start of the transaction
                    .replace(R.id.container, NoteFragment.newInstance(position + ))
                    .commit();*/
            View rootView = inflater.inflate(R.layout.fragment_bloc_notes, container, false);


            mEditText = (EditText) rootView.findViewById(R.id.edit_text_note_fragment);


            return rootView;
        }



        @Override
        public void onSaveInstanceState(Bundle savedInstanceState){
            super.onSaveInstanceState(savedInstanceState);
            savedInstanceState.putString(EDIT_TEXT, mEditText.getText().toString());// Saving the string in a value that will be return
            Toast.makeText(getActivity(), "try it", Toast.LENGTH_SHORT).show();
        }


        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((BlocNotes) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
            Toast.makeText(activity, "It's working!", Toast.LENGTH_LONG).show();
        }




    }

}
