package com.example.estudiantes.mmmm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
int res ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random mirandom =new Random();
        res=mirandom.nextInt();
    }
public void ejemplo (View  vista ){
    TextView buscador = (TextView) findViewById(R.id.textView2);
    Button elbutton = (Button) findViewById(R.id.button);
    EditText miedit = (EditText) findViewById(R.id.editText12);

    int numero = Integer.parseInt(buscador.getText().toString());
    if(numero==res){
        buscador.setText("ese es el numero");
    }else{
        if (numero>res){
            buscador.setText("no era el numero ");
        }
    }


    }


}
