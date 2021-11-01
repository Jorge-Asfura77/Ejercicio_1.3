package com.example.ejercicio13_jorgeasfura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnagregar_main = (Button) findViewById(R.id.btnagregar_main);
        Button btnconsultar_main = (Button) findViewById(R.id.btnconsultar_main);

        btnagregar_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityAgregar.class);
                startActivity(intent);

            }
        });

        btnconsultar_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityConsultar.class);
                startActivity(intent);
            }
        });
    }
}