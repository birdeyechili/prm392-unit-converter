package com.example.prm392_unit_converter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;

public class ForceConverterActivity extends AppCompatActivity {
    HashMap<String,Double> forceConversions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_force_converter);

        //Initialize hashmap
        forceConversions = new HashMap<>();
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

        //Testing
        ((TextView)findViewById(R.id.tv_test_convert)).setText(String.valueOf(convert(100,"kN","lbf")));
    }

    private double convert(double from, String fromForce, String toForce){
        double toNewton = from * forceConversions.get(fromForce);
        return toNewton / forceConversions.get(toForce);
    }
}