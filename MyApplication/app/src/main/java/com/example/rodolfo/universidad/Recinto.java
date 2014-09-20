package com.example.rodolfo.universidad;


import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Recinto extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recinto);

    //Establece el Activity solo en vertical
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //Control de los Toast


        //Objetos asociados a los botones
   /* final ImageButton button_recinto1 = (ImageButton) findViewById(R.id.imageButton_r1);
    final ImageButton button_recinto2 = (ImageButton) findViewById(R.id.imageButton_r2);*/


   /* button_recinto1.setOnClickListener(new ImageButton.OnClickListener() {

        @Override
        public void onClick(View view) {
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }
    }
    );

    button_recinto2.setOnClickListener(new ImageButton.OnClickListener() {

        CharSequence text = "Recinto Santo Domingo";

        @Override
        public void onClick(View view) {
            setContentView(R.layout.recinto2);
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    });*/
}
    //Funcion del Metodo OnClick llamado en el layout
    public void boton_recinto1 (View view)
    {
        CharSequence text = "Recinto Santiago";

        final Context context = getApplicationContext();
        final int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Intent i = new Intent(this, Recinto1.class );
        startActivity(i);
    }

    //Funcion del Metodo OnClick llamado en el layout
    public void boton_recinto2 (View view)
    {
        CharSequence text = "Recinto Santo Domingo";

        final Context context = getApplicationContext();
        final int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Intent i = new Intent(this, Recinto1.class );
        startActivity(i);
    }


   /* @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub

        switch (keyCode) {
            case KeyEvent.KEYCODE_VOLUME_UP:
                Toast.makeText(this, "Boton de Volumen Up presionado",
                        Toast.LENGTH_SHORT).show();
                return true;
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                Toast.makeText(this, "Boton de Volumen Down presionado",
                        Toast.LENGTH_SHORT).show();
                return true;
            case KeyEvent.KEYCODE_BACK:
                Toast.makeText(this, "Boton Atras",
                        Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onKeyUp(keyCode, event);
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.recinto, menu);
        return true;
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
}
