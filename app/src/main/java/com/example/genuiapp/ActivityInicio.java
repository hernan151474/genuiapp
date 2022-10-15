package com.example.genuiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;


public class ActivityInicio extends AppCompatActivity {
    EditText usuario_inicio, password_inicio;
    Button login;
    MyDbHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        usuario_inicio = (EditText) findViewById(R.id.usuario_inicio);
        password_inicio = (EditText) findViewById(R.id.password_inicio);
        login = (Button) findViewById(R.id.login);
        dbHelper = new MyDbHelper(this);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario, contraseña;
                String user = usuario_inicio.getText().toString();
                String password = password_inicio.getText().toString();
                if(user.equals("")||password.equals(""))
                    Toast.makeText(ActivityInicio.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass = dbHelper.checkusernamepassword(user, password);
                    if(checkuserpass==true){
                        Toast.makeText(ActivityInicio.this, "Sign in successfull", Toast.LENGTH_SHORT).show();
                        Intent intent  = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(ActivityInicio.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
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