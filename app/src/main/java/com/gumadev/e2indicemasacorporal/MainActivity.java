package com.gumadev.e2indicemasacorporal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle bundle) {

        Log.v(getClass().getCanonicalName(), "Estamos en el Oncreate");

        super.onCreate(bundle);

        setContentView(R.layout.activity_main);

        Button boton = (Button) findViewById(R.id.calcular);
        EscuchaBoton escuchaBoton = new EscuchaBoton(this);
        boton.setOnClickListener(escuchaBoton);

        Button button = (Button) findViewById(R.id.salir);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utils.salir(MainActivity.this);
            }
        });


    }
}
