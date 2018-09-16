package com.example.alumno.clase4;

import android.util.Log;
import android.view.View;
import android.app.Activity;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Controlador implements View.OnClickListener
{
    private Vista vista;
    private Persona persona;

    public Controlador(Persona persona)
    {
        this.persona=persona;

    }

    public void setVista(Vista v) {
        this.vista = v;
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {

            case R.id.btnGuardar:

               /* s = vista.t.getText().toString();
                vista.t.setText(s + "1");
                ActivarOperaciones();*/
               persona.setNombre(vista.et1.getText().toString());
               persona.setApellido(vista.et2.getText().toString());
                persona.setApellido(vista.et3.getText().toString());
                Log.d("Nombre: ", persona.getNombre());
                break;
        }

    }

    public Vista getVista() {
        return vista;
    }
}
