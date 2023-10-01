package com.example.labone_22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;
    Button btnChangeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);
        this.btnChangeText = findViewById(R.id.btnChangeText);

        btnChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText("Pasikeites tesktas!");
                Toast.makeText(getApplicationContext(), "you did it!", Toast.LENGTH_LONG).show();
            }
        });


    }
}