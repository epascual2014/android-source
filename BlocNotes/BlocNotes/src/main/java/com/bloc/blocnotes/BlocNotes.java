package com.bloc.blocnotes;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
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
    private String mEdit;



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
        NoteFragment noteFragment = (NoteFragment) fragmentManager.findFragmentByTag("noteFrag");

        EditText editText = (EditText) findViewById(R.id.my_note_fragment_edit_text);
        Typeface type = Typeface.createFromAsset(getAssets(),"fonts/Helvetica_Reg.ttf");
        editText.setTypeface(Typeface.SANS_SERIF);

        if (noteFragment == null)
        //created note fragment
        {
            noteFragment = NoteFragment.newInstance(0);

        }
        fragmentManager.beginTransaction().
                replace(R.id.container, noteFragment, "noteFrag").commit();

        if (savedInstanceState != null) {
            savedInstanceState.getString("mEdit", mEdit);
            return;
        }

    }


    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        // Toast.makeText(getApplicationContext(), "hi there", Toast.LENGTH_SHORT).show();
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
            Toast.makeText(getApplicationContext(), "Settings clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.action_add) {
            Toast.makeText(getApplicationContext(), "ADD an I OWE YOU!", Toast.LENGTH_SHORT).show();
            return true;
        }

        if (id == R.id.action_erase) {
            Toast.makeText(getApplicationContext(), "Exit.", Toast.LENGTH_SHORT).show();
            //Delete inside edit text notes
            return true;
        }

        if (id == R.id.action_menu_view) {
            CustomStyleDialogFragment newFragment = new CustomStyleDialogFragment();
            newFragment.show(getFragmentManager(),null);
            Toast.makeText(getApplicationContext(), "Font settings clicked", Toast.LENGTH_SHORT).show();

            return true;
        }
        return super.onOptionsItemSelected(item);
     }


 }
