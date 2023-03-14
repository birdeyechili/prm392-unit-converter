package com.example.prm392_unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DataConverterActivity extends AppCompatActivity {
    List<Unit> unitList;
    EditText et_fromUnit;
    EditText et_toUnit;
    TextView tv_fromUnit;
    TextView tv_toUnit;
    RelativeLayout rl_fromUnit;
    RelativeLayout rl_toUnit;
    RelativeLayout rl_convert;
    TextView tv_fromValue;
    TextView tv_toValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        //set header resource
        ((TextView) findViewById(R.id.tv_text)).setText("DATA");
        ((ImageView) findViewById(R.id.img_logo)).setImageResource(R.drawable.data);

        //Initialize hashmap
        unitList = new ArrayList<>();
        unitList.add(new Unit("b", "bit", 1.0));
        unitList.add(new Unit("B", "byte", 8.0));
        unitList.add(new Unit("block", "block", 4096.0));
        unitList.add(new Unit("word", "word", 16.0));
        unitList.add(new Unit("kB", "kilobyte", 8192.0));
        unitList.add(new Unit("MB", "megabyte", 8388608.0));
        unitList.add(new Unit("GB", "gigabyte", 8589934592.0));
        unitList.add(new Unit("TB", "terabyte", 8796093022208.0));

        //Initialize views
        et_fromUnit = findViewById(R.id.et_fromUnit);
        et_toUnit = findViewById(R.id.et_toUnit);
        tv_fromUnit = findViewById(R.id.tv_fromUnit);
        tv_toUnit = findViewById(R.id.tv_toUnit);
        rl_fromUnit = findViewById(R.id.rl_fromUnit);
        rl_toUnit = findViewById(R.id.rl_toUnit);
        rl_convert = findViewById(R.id.rl_convert);
        tv_fromValue = findViewById(R.id.tv_fromValue);
        tv_toValue = findViewById(R.id.tv_toValue);

        //Set on click listener
        rl_fromUnit.setOnClickListener(
                new OnUnitClickListener(DataConverterActivity.this, "Select From Unit", unitList,
                        tv_fromUnit, tv_fromValue));
        rl_toUnit.setOnClickListener(
                new OnUnitClickListener(DataConverterActivity.this, "Select To Unit", unitList,
                        tv_toUnit, tv_toValue));
        rl_convert.setOnClickListener(v -> {
            String fromInput_raw = et_fromUnit.getText().toString();
            String fromValue_raw = tv_fromValue.getText().toString();
            String toValue_raw = tv_toValue.getText().toString();
            System.out.println(
                    "fromInput_raw: " + fromInput_raw + ", fromValue_raw: " + fromValue_raw +
                            ", toValue_raw: " + toValue_raw);
            if (!(fromInput_raw.isEmpty() || fromValue_raw.equals("") || toValue_raw.equals(""))) {
                Double fromInput = Double.parseDouble(fromInput_raw);
                Double fromValue = Double.parseDouble(fromValue_raw);
                Double toValue = Double.parseDouble(toValue_raw);
                et_toUnit.setText(String.valueOf(Util.convert(fromInput, fromValue, toValue)));
            }
        });
    }
}