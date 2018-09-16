package com.example.alumno.clase4;

import android.app.Activity;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Vista
{

    public EditText et1;
    public EditText et2;
    public EditText et3;
    public RadioButton rd;


    public Vista(Activity activity, View.OnClickListener escuchador)

    {/*this.et = (EditText) activity.findViewById(R.id.eText1);
        this.t = (TextView) activity.findViewById(R.id.txt1);

        Button btn1 = (Button) activity.findViewById(R.id.btn1);*/
        this.et1= (EditText) activity.findViewById(R.id.eText1);
        this.et2= (EditText) activity.findViewById(R.id.eText2);
        this.et3= (EditText) activity.findViewById(R.id.eText3);

        this.rd = (RadioButton) activity.findViewById(R.id.rd1);

        Button btnGuardar = (Button) activity.findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(escuchador);
    }
}
