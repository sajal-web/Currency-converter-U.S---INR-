package com.example.sajal.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText editTextNumber;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber = findViewById(R.id.editTextNumber);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = editTextNumber.getText().toString();
                Double z =Double.parseDouble(x);
                Double y = z * 76.8275;
                Toast.makeText(MainActivity.this, "The value in indian currency is : "+y, Toast.LENGTH_SHORT).show();
            }
        });
    }
}