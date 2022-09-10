package com.example.genuiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


<<<<<<< HEAD
=======
    public void Registrar(View view){
        Intent registrar = new Intent(this, AgregarUser.class);
        startActivity(registrar);
    }

    public void Invitado(View view){
        Intent invitado = new Intent(this, ActivityInicio.class);
        startActivity(invitado);
    }


>>>>>>> 3ed99b4e26ec53417f60b02b54a1aa1f73f5026e
    public void Oficio (View view){
        Intent oficio = new Intent(this, OficioActivity.class);
        startActivity(oficio);
    }

    public void Comercio (View view){
        Intent comercio = new Intent(this, ComercioActivity.class);
        startActivity(comercio);
    }

<<<<<<< HEAD


    public void Registrar(View view){
        Intent registrar = new Intent(this, AgregarUser.class);
        startActivity(registrar);
    }

=======
>>>>>>> 3ed99b4e26ec53417f60b02b54a1aa1f73f5026e
    public void Objetivo (View view){
        Intent objetivo = new Intent(this, ObjetivosActivity.class);
        startActivity(objetivo);
    }

    public void Genui (View view){
        Intent genui = new Intent(this,Que_es_Genui.class);
        startActivity(genui);
    }

    public void Valor (View view){
        Intent valor = new Intent(this,Valor.class);
        startActivity(valor);
    }

    public void Vision_Hitos (View view){
        Intent vision_hitos = new Intent(this, Vision_Hitos.class);
        startActivity(vision_hitos);
    }

    public void Foco_Alcance (View view){
        Intent foco_alcance = new Intent(this, Foco_Alcance.class);
        startActivity(foco_alcance);
    }
}