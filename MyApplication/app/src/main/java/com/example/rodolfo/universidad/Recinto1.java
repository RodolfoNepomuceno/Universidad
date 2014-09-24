package com.example.rodolfo.universidad;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;


/**
 * Created by Rodolfo on 28/8/14.
 */
public class Recinto1 extends Activity
{
        private static final String TAG = "dialog";

        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recinto1);

        //Control de los Toast
        final Context context = getApplicationContext();
        final int duration = Toast.LENGTH_SHORT;

     /* //Objetos asociados a los botones
        final ImageButton button_estudiantes = (ImageButton) findViewById(R.id.imageButton_estudiante);

        button_estudiantes.setOnClickListener(new ImageButton.OnClickListener() {

            CharSequence text = "Estudiantes";

            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                DialogFragment dialog = new Credenciales();
                dialog.show(getSupportFragmentManager(), "dialog");
            }
        });*/

      }

    //Funcion del Metodo OnClick llamado en el layout
     public void form_credenciales ()
    {
        CharSequence text = "Estudiante Recinto Santiago";

        final Context context = getApplicationContext();
        final int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        //Intent i = new Intent(Recinto1.this,Credenciales.class);
        //startActivity(i);

    }

}

