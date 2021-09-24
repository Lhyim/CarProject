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
    private ToggleButton ToggleButton;
    private TextView MonthView;


    private void setForEditing(boolean enabled) {
        @Override
        setContentView(R.layout.activity_main);

        EditPrice = findViewById(R.id.EditPrice);
        button = findViewById(R.id.button);
        EditPayment = findViewById(R.id.EditPayment);
        EditInterest = findViewById(R.id.EditInterest);
        EditLength = findViewById(R.id.EditLength);
        MonthView = findViewById(R.id.MonthView);
        ToggleButton = findViewById(R.id.ToggleButton);

        EditPrice.setEnabled(enabled);
        EditPayment.setEnabled(enabled);
        EditInterest.setEnabled(enabled);
        EditLength.setEnabled(enabled);
        MonthView.setEnabled(enabled);

        int MR = Integer.parseInt(EditInterest.getText().toString())/12;
        int n = Integer.parseInt(EditLength.getText().toString());
        int L = Integer.parseInt(EditPrice.getText().toString());

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { setForEditing(ToggleButton.isChecked());
                if (ToggleButton.isChecked()) {
                            MonthView.setText("Your monthly payment is" + (MR * L / (1 - (1 + MR) ^ -n)));
                } else {
                            MonthView.setText("Your Monthly Payment is" + (MR * (L/3)/ (1 - (1 + MR) ^ -36)));
                        }
            }
        });

    }}






    //private void initToggleButton() {
        //ToggleButton.setOnClickListener(new View.OnClickListener() {
           // @Override
            //public void onClick(View view) { setForEditing(ToggleButton.isChecked());
                //if (ToggleButton.isChecked()) {
                    //button.setOnClickListener(new View.OnClickListener() {
                        //@Override
                        //public void onClick(View view) {
                            //MonthView.setText("Your monthly payment is" + (MR * L / (1 - (1 + MR) ^ -n)));
                //} else {
                    //button.setOnClickListener(new View.OnClickListener() {
                        //@Override
                        //public void onClick(View view) {
                            //MonthView.setText("Your Monthly Payment is" + (MR * (L/3)/ (1 - (1 + MR) ^ -36)));




