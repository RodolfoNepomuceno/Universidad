package com.example.rodolfo.universidad;

import android.app.Activity;
import android.view.KeyEvent;
import android.widget.Toast;

/**
 * Created by Rodolfo on 28/8/14.
 */
public class Recinto1 extends Activity

{
    @Override
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
                        Toast.LENGTH_LONG).show();
                return true;
        }
        return super.onKeyUp(keyCode, event);
    }
}
