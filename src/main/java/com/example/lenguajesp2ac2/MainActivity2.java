package com.example.lenguajesp2ac2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private EditText editTextNumber;
    private Button btnIncrementar, btnDecrementar;

    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editTextNumber = findViewById(R.id.editTextNumber);
        btnDecrementar = findViewById(R.id.btnDecrementar);
        btnIncrementar = findViewById(R.id.btnIncrementar);

        btnIncrementar.setOnClickListener(v ->{
            contador++;
            editTextNumber.setText(String.valueOf(contador));
        });

        btnDecrementar.setOnClickListener(v->{
            contador--;
            editTextNumber.setText(String.valueOf(contador));
        });
        }
    }
