package com.example.alumno.clase4;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.*;
import android.support.v7.appcompat.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Persona persona = new Persona();
        // View.OnClickListener listener = new Controlador();
        Controlador controlador = new Controlador(persona);
        Vista vista = new Vista(this,controlador);
       // Controlador controlador = new Controlador(persona);

        controlador.setVista(vista);
    }
}
