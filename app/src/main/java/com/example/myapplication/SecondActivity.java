package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    EditText txt1 ;
    EditText txt2 ;
    TextView label;
    int N1,N2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt1 = findViewById(R.id.etNum1);
        txt2 =  findViewById(R.id.editTextNumber2);
        label = findViewById(R.id.textView3);
        Intent myIntent = getIntent();
        String n1  =  myIntent.getStringExtra("n1");
        String n2  =  myIntent.getStringExtra("n2");

        N1 = Integer.parseInt(n1);
        N2 = Integer.parseInt(n2);
        txt1.setText(n1);
        txt2.setText(n2);



    }

    public void addition(View view){

         int ans = N1 + N2;

        label.setText(N1 + " + "+ N2 + "= " + ans);

    }

    public void multiplication(View view){

        int ans = N1 * N2;
        label.setText(N1 + " * "+ N2 + "= " + ans);



    }
    public void division(View view){

        int ans = N1 / N2;
        label.setText(N1 + " / "+ N2 + "= " + ans);



    }

    public void substraction (View view){

        int ans = N1 - N2;
        label.setText(N1 + " - "+ N2 + "= " + ans);

    }



}