package com.example.rodolfo.universidad;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by Rodolfo on 29/8/14.
 */
public class Recinto2 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recinto2);

        //Control de los Toast
        final Context context = getApplicationContext();
        final int duration = Toast.LENGTH_SHORT;


        //Objetos asociados a los botones
        final ImageButton button_estudiantes = (ImageButton) findViewById(R.id.imageButton_estudiante);

        button_estudiantes.setOnClickListener(new ImageButton.OnClickListener() {

            @Override
            public void onClick(View view) {

                CharSequence text = "Estudiantes Recinto Santo Domingo";

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                //Crea una instancia de la clase Credenciales
                DialogFragment dialog = new Estudiantes_Credenciales();
                dialog.show(getSupportFragmentManager(), "dialog");
            }
        });

        final ImageButton button_docentes = (ImageButton) findViewById(R.id.imageButton_docente);

        button_docentes.setOnClickListener(new ImageButton.OnClickListener() {

                                               @Override
                                               public void onClick(View view) {
                                                   CharSequence text = "Docentes Recinto Santo Domingo";

                                                   Toast toast = Toast.makeText(context, text, duration);
                                                   toast.show();

                                                   //Crea una instancia de la clase Credenciales
                                                   DialogFragment dialog = new Docentes_Credenciales();
                                                   dialog.show(getSupportFragmentManager(), "dialog");

                                               }
                                           }
        );
    }

}
