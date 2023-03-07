package com.example.prm392_unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ForceConverterActivity extends AppCompatActivity {
    HashMap<String,Double> forceConversions;
    EditText et_fromUnit;
    EditText et_toUnit;
    TextView tv_fromUnit;
    TextView tv_toUnit;
    RelativeLayout rl_fromUnit;
    RelativeLayout rl_toUnit;
    RelativeLayout rl_convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_force_converter);

        //Initialize hashmap
        forceConversions = new LinkedHashMap<>();
        forceConversions.put("N",1.0);
        forceConversions.put("kN",1000.0);
        forceConversions.put("kgf",9.80665);
        forceConversions.put("hN",100.0);
        forceConversions.put("daN",10.0);
        forceConversions.put("dN",0.1);
        forceConversions.put("cN",0.01);
        forceConversions.put("mN",0.001);
        forceConversions.put("lbf",4.4482216153);
        forceConversions.put("ozf",0.278013851);

        //Initialize views
        et_fromUnit = (EditText) findViewById(R.id.et_fromUnit);
        et_toUnit = (EditText) findViewById(R.id.et_toUnit);
        tv_fromUnit = (TextView) findViewById(R.id.tv_fromUnit);
        tv_toUnit = (TextView) findViewById(R.id.tv_toUnit);
        rl_fromUnit = (RelativeLayout) findViewById(R.id.rl_fromUnit);
        rl_toUnit = (RelativeLayout) findViewById(R.id.rl_toUnit);
        rl_convert = (RelativeLayout) findViewById(R.id.rl_convert);

        //Set on click listener
        rl_fromUnit.setOnClickListener(new OnUnitClickListener(ForceConverterActivity.this,"From Unit", forceConversions.keySet().toArray(new String[0]), tv_fromUnit));
        rl_toUnit.setOnClickListener(new OnUnitClickListener(ForceConverterActivity.this,"To Unit", forceConversions.keySet().toArray(new String[0]), tv_toUnit));
        rl_convert.setOnClickListener(v -> {
            String fromValue_raw = et_fromUnit.getText().toString();
            if(!fromValue_raw.isEmpty()) {
                Double fromValue = Double.parseDouble(fromValue_raw);
                et_toUnit.setText(String.valueOf(convert(fromValue,tv_fromUnit.getText().toString(),tv_toUnit.getText().toString())));
            }
        });
    }

    private BigDecimal convert(double fromValue, String fromForce, String toForce){
        BigDecimal toNewton = BigDecimal.valueOf(fromValue).multiply(BigDecimal.valueOf(forceConversions.get(fromForce)));
        return toNewton.divide(BigDecimal.valueOf(forceConversions.get(toForce)), 5,RoundingMode.HALF_EVEN).stripTrailingZeros();
    }
}