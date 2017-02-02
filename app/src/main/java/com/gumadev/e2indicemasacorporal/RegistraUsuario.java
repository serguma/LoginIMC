package com.gumadev.e2indicemasacorporal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by sergu on 29/01/2017.
 */

public class RegistraUsuario {

    private Context ctx;

    public RegistraUsuario(Context ctx) {
        this.ctx = ctx;
    }

    public static void registro(Usuario usuario, Context ctx){

        BaseDatosUsuarios baseDatosUsuarios = new BaseDatosUsuarios(ctx, "usuariosdb", null, 1);

        if(!baseDatosUsuarios.existeUsuario(usuario)){
            baseDatosUsuarios.insertarUusario(usuario);
            Intent intent = new Intent(ctx, MainActivity.class);
            ctx.startActivity(intent);

            Activity activity = (Activity) ctx;
            activity.finishAffinity();

            Toast.makeText(ctx,"Lo registro "+ baseDatosUsuarios.existeUsuario(usuario),Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(ctx,"Este usuario ya existe",Toast.LENGTH_LONG).show();
        }

    }
}
