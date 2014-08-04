package com.bloc.blocnotes;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by epascual on 7/9/14.
 */
public class CustomStyleDialogFragment extends DialogFragment {

    private Spinner spinner;
    String[] fonts_array;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_custom_dialog, container, false);
        spinner = (Spinner) rootView.findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.fonts, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                int index = arg0.getSelectedItemPosition();

                // storing string resources into Array
                fonts_array = getResources().getStringArray(R.array.fonts);
                Toast.makeText(getActivity(), "Font changed to...", Toast.LENGTH_SHORT).show();
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // do nothing
            }

        });

        final View buttonView = inflater.inflate(R.layout.fragment_custom_dialog,container, false);

        // Creating button var
        final Button fontButtonS = (Button)buttonView.findViewById(R.id.btn_small);

        // Adding listener to button
        fontButtonS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    {
                        // observer pattern interfaces
                        EditText editText = (EditText) getView().findViewById(R.id.my_note_fragment_edit_text);
                        editText.setText(R.style.text_small);

                    }


            }


        });

        return rootView;

    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);





    }
}











