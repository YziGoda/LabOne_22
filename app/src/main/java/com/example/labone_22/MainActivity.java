package com.example.labone_22;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;
    Button btnChangeText;
    Button btnChangeColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);
        this.btnChangeText = findViewById(R.id.btnChangeText);
        this.btnChangeColour = findViewById(R.id.btnChangeColour);

        btnChangeText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvMain.setText("Pasikeites tesktas!");
                Toast.makeText(getApplicationContext(), "you did it!", Toast.LENGTH_LONG).show();
            }
        });

        btnChangeColour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvMain.setTextColor(Color.parseColor("#d20000"));
                Toast.makeText(getApplicationContext(), "colour changed, yay!", Toast.LENGTH_LONG).show();
            }
        });

    }
}