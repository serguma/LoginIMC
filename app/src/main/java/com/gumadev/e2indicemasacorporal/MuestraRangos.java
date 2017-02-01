package com.gumadev.e2indicemasacorporal;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

/**
 * Created by sergu on 19/01/2017.
 */

public class MuestraRangos implements View.OnClickListener {

    private Context ctx;

    public MuestraRangos (Context context){
        this.ctx = context;
    }

    @Override
    public void onClick(View view){

        Log.d(getClass().getCanonicalName(), "Se ha pulsado el botón mostrar rangos");
        Activity activity = (Activity) ctx;

        ListView listView = (ListView) activity.findViewById(R.id.listaRangos);
        listView.setAdapter(new RangoAdapter(activity));
    }
}
