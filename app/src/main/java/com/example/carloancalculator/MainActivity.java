package com.example.carloancalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private EditText EditPrice;
    private EditText EditPayment;
    private EditText EditInterest;
    private EditText EditLength;
    private Button button;
    private TextView MonthView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditPrice = findViewById(R.id.EditPrice);
        button = findViewById(R.id.button);
        EditPayment = findViewById(R.id.EditPayment);
        EditInterest = findViewById(R.id.EditInterest);
        EditLength = findViewById(R.id.EditLength);
        MonthView = findViewById(R.id.MonthView);
        ToggleButton = findViewById(R.id.toggleButton;



    }
    private void initToggleButton() {
        ToggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                } else {
                    // The toggle is disabled
                }
            }
            });

        }}