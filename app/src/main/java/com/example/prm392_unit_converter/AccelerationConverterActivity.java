package com.example.prm392_unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AccelerationConverterActivity extends AppCompatActivity {
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
        ((TextView) findViewById(R.id.tv_text)).setText("ACCELERATION");
        ((ImageView) findViewById(R.id.img_logo)).setImageResource(R.drawable.acceleration);

        //Initialize hashmap
        unitList = new ArrayList<>();
        unitList.add(new Unit("m/s^2","Meter/square second",1.0));
        unitList.add(new Unit("dm/s^2","Decimeter/square second",0.1));
        unitList.add(new Unit("km/s^2","Kilometer/square second",1000.0));
        unitList.add(new Unit("hm/s^2","Hectometer/square second",100.0));
        unitList.add(new Unit("cm/s^2","Centimeter/square second",0.01));
        unitList.add(new Unit("mm/s^2","Milimeter/square second",0.001));
        unitList.add(new Unit("mi/s^2","Mile/square second",1609.344));
        unitList.add(new Unit("yd/s^2","Yard/square second",0.9144));
        unitList.add(new Unit("ft/s^2","Foot/square second",0.3048));
        unitList.add(new Unit("in/s^2","Inch/square second",0.0254));
        unitList.add(new Unit("g","Acceleration of gravity",9.80665));

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
        rl_fromUnit.setOnClickListener(new OnUnitClickListener(AccelerationConverterActivity.this,"Select From Unit",
                unitList, tv_fromUnit, tv_fromValue));
        rl_toUnit.setOnClickListener(new OnUnitClickListener(AccelerationConverterActivity.this,"Select To Unit", unitList,
                tv_toUnit, tv_toValue));
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