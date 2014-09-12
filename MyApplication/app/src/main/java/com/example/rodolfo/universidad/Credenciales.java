package com.example.rodolfo.universidad;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Toast;

/**
 * Created by Rodolfo on 10/9/14.
 */


@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class Credenciales extends DialogFragment {

        @Override
        public Dialog onCreateDialog (Bundle savedInstanceState){

            // Use the Builder class for convenient dialog construction
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

            // Get the layout inflater
            LayoutInflater inflater = getActivity().getLayoutInflater();

            // Inflate and set the layout for the dialog
            // Pass null as the parent view because its going in the dialog layout
            builder.setView(inflater.inflate(R.layout.credenciales, null))
                    // Add action buttons
                    .setPositiveButton(android.R.string.yes,
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    Toast.makeText(getActivity(), "Yes",
                                            Toast.LENGTH_SHORT).show();
                                }
                            })
                    .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Toast.makeText(getActivity(), "No", Toast.LENGTH_SHORT).show();
                        }
                    });

            // Create the AlertDialog object and return it
            return builder.create();
        }
    }
