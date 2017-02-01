package com.gumadev.e2indicemasacorporal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MuestraResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle){

        super.onCreate(bundle);

        setContentView(R.layout.activity_muestra_resultado);

        //Obtengo los valores para realizar el cálculo
        Intent intent = getIntent();
        float peso = intent.getFloatExtra("peso",0);
        float altura = intent.getFloatExtra("altura",0);

        TextView elmensaje = (TextView) findViewById(R.id.elmensaje);
        String resultado = Utils.calculaIMC(peso,altura,this);
        elmensaje.setText(resultado);

        //Le doy la accción al botón definida en MuestrRangos
        Button boton = (Button) findViewById(R.id.volver);
        MuestraRangos muestraRangos = new MuestraRangos(this);
        boton.setOnClickListener(muestraRangos);


    }

}
