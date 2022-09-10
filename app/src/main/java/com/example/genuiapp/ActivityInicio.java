package com.example.genuiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

<<<<<<< HEAD
=======

>>>>>>> 3ed99b4e26ec53417f60b02b54a1aa1f73f5026e
public class ActivityInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }
<<<<<<< HEAD

    public void Invitado(View view){
        Intent invitado = new Intent(this, MainActivity.class);
        startActivity(invitado);
    }

    public void Registrar(View view){
        Intent registrar = new Intent(this, AgregarUser.class);
        startActivity(registrar);
    }
}
=======
    public void Oficio (View view){
        Intent oficio = new Intent(this, OficioActivity.class);
        startActivity(oficio);
    }

    public void Comercio (View view){
        Intent comercio = new Intent(this, ComercioActivity.class);
        startActivity(comercio);
    }

}
>>>>>>> 3ed99b4e26ec53417f60b02b54a1aa1f73f5026e
