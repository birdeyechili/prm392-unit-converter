package com.example.prm392_unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PowerConverterActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_power_converter);

        //Initialize hashmap
        unitList = new ArrayList<>();
        unitList.add(new Unit("W","Watt",1.0));
        unitList.add(new Unit("hW","Hectowatt",100.0));
        unitList.add(new Unit("kW","Kilowatt",1000.0));
        unitList.add(new Unit("MW","Megawatt",1000000.0));
        unitList.add(new Unit("dW","Deciwatt ",0.1));
        unitList.add(new Unit("cW","Centiwatt",0.01));
        unitList.add(new Unit("mW","Milliwatt",0.001));

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
        rl_fromUnit.setOnClickListener(new OnUnitClickListener(PowerConverterActivity.this,"Select From Unit", unitList, tv_fromUnit, tv_fromValue));
        rl_toUnit.setOnClickListener(new OnUnitClickListener(PowerConverterActivity.this,"Select To Unit", unitList, tv_toUnit, tv_toValue));
        rl_convert.setOnClickListener(v -> {
            String fromInput_raw = et_fromUnit.getText().toString();
            String fromValue_raw = tv_fromValue.getText().toString();
            String toValue_raw = tv_toValue.getText().toString();
            if(!(fromInput_raw.isEmpty()||fromValue_raw.equals("")||toValue_raw.equals(""))) {
                Double fromInput = Double.parseDouble(fromInput_raw);
                Double fromValue = Double.parseDouble(fromValue_raw);
                Double toValue = Double.parseDouble(toValue_raw);
                et_toUnit.setText(String.valueOf(Util.convert(fromInput,fromValue,toValue)));
            }
        });
    }
}