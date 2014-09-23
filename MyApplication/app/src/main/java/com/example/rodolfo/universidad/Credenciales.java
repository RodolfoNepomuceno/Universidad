package com.example.rodolfo.universidad;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;




/**
 * Created by Rodolfo on 10/9/14.
 */

public class Credenciales extends DialogFragment {



       @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(R.layout.dialog_credenciales, null))
                // Add action buttons
                .setPositiveButton(R.string.iniciar, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // sign in the user ...
                        Toast.makeText(getActivity(),
                                android.R.string.yes,
                                Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getActivity(), android.R.string.no,
                                Toast.LENGTH_SHORT).show();
                    }
                });
        return builder.create();

    }
}
