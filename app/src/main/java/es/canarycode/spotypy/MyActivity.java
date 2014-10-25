package es.canarycode.spotypy;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Outline;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MyActivity extends Activity {
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        imageButton = (ImageButton) findViewById(R.id.fab_1);


        int size = getResources().getDimensionPixelSize(R.dimen.fab_size); //Obtenemos los 56dp aconsejados por google
        Outline outline = new Outline();                                    //Obj. que simula sombras usando el eje z
        outline.setOval(0, 0, size, size);                                 //Creamos la sombra de forma circular porque nuestro botón es circular. Va como en CSS de arriba hacia la derecha

    }

    
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(), "Entrando", Toast.LENGTH_LONG).show();

        startActivity(new Intent(getApplicationContext(), MyMusic.class));
        
    }

}
