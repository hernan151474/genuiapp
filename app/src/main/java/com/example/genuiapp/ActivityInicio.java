package com.example.genuiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class ActivityInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }


    public void Invitado(View view){
        Intent invitado = new Intent(this, MainActivity.class);
        startActivity(invitado);
    }

    public void Registrar(View view){
        Intent registrar = new Intent(this, AgregarUser.class);
        startActivity(registrar);
    }
}