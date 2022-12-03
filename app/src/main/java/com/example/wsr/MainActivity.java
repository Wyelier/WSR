package com.example.wsr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private Button btnRegister;
    private Button btnLogin;
    private EditText email, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnRegister = findViewById(R.id.btnReg);
        btnRegister.setOnClickListener(v -> {
            Intent okno1 = new Intent(this, SecondActivity.class);
            startActivity(okno1);
            finish();
        });
            }
        }
