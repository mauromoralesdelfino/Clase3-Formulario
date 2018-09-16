package com.example.alumno.clase4;

import android.app.Activity;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Persona {

    String nombre;
    String apellido;
    Integer dni;


    public Persona()
    {}

    public Persona(String nomb,String ape, Integer doc)
    {
        this.nombre=nomb;
        this.apellido=ape;
        this.dni=doc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }
}
