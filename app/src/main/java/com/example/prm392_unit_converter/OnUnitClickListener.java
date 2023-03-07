package com.example.prm392_unit_converter;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

public class OnUnitClickListener implements View.OnClickListener {
    private Context context;
    private String title;
    private String[] options;
    private TextView tv;

    public OnUnitClickListener(Context context, String title, String[] options, TextView tv) {
        this.context = context;
        this.title = title;
        this.options = options;
        this.tv = tv;
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);
        alertBuilder.setTitle(title);

        alertBuilder.setSingleChoiceItems(
                options,        //Items list
                -1,             //Index of checked item (-1 = no selection)
                new DialogInterface.OnClickListener() //Item click listener
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String selectedItem = options[which];
                        tv.setText(selectedItem);
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
}
