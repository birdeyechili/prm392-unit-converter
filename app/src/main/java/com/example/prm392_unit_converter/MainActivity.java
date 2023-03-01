package com.example.prm392_unit_converter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Button btn_alertDialog;
    TextView tv_chosen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_force_converter);

        tv_chosen = findViewById(R.id.tv_fromUnit);
        btn_alertDialog = findViewById(R.id.btn_fromUnit);
        btn_alertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertBuilder = new AlertDialog.Builder(MainActivity.this);
                alertBuilder.setTitle("Ayo testing");

                String[] options = new String[]{
                        "Nguyen",
                        "Duy",
                        "Phuong",
                        "hahahaha",
                        "hahahahahahaha",
                };

                alertBuilder.setSingleChoiceItems(
                        options,        //Items list
                        -1,             //Index of checked item (-1 = no selection)
                        new DialogInterface.OnClickListener() //Item click listener
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String selectedItem = Arrays.asList(options).get(which);
                                tv_chosen.setText(selectedItem);
                            }
                        }
                );

                alertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //dismiss the alert dialog after selection
                        dialog.dismiss();
                    }
                });

                AlertDialog dialog = alertBuilder.create();
                //display the alert dialog
                dialog.show();
            }
        });
    }
}