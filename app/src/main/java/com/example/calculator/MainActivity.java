package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);

        display.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (getString(R.string.display).equals(display.getText().toString())){
                    display.setText("");
                }
            }
        });
    }

    public void zero(View view){
    }

    public void clear(View view) {
    }

    public void parenthesis(View view) {
    }

    public void exponent(View view) {
    }

    public void divide(View view) {
    }

    public void seven(View view) {
    }

    public void eight(View view) {
    }

    public void nine(View view) {
    }

    public void multiply(View view) {
    }

    public void four(View view) {
    }

    public void five(View view) {
    }

    public void six(View view) {
    }

    public void subtract(View view) {
    }

    public void one(View view) {
    }

    public void two(View view) {
    }

    public void three(View view) {
    }

    public void add(View view) {
    }

    public void plusMinus(View view) {
    }

    public void point(View view) {
    }

    public void equals(View view) {
    }
}