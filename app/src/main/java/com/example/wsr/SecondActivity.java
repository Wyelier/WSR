package com.example.wsr;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private Button BtnReg;
    private Button BtnHaveAcc;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        BtnReg = findViewById(R.id.btnHaveAcc);
        BtnReg.setOnClickListener(v -> {
            Intent okno2 = new Intent(this, MainActivity.class);
            startActivity(okno2);
            finish();
        });
    }
}