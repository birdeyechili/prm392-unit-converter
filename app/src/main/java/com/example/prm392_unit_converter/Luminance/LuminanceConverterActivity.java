package com.example.prm392_unit_converter.Luminance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.prm392_unit_converter.R;

import java.math.BigDecimal;
import java.util.HashMap;

public class LuminanceConverterActivity extends AppCompatActivity {

    HashMap<LuminanceUnit, BigDecimal> LuminanceUnits = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luminance_converter);

        LuminanceUnits.put(new LuminanceUnit("cd/m2", "candela/square meter"), BigDecimal.valueOf(1));
        LuminanceUnits.put(new LuminanceUnit("cd/cm2", "candela/square centimeter"), BigDecimal.valueOf(1000));
        LuminanceUnits.put(new LuminanceUnit("cd/ft2", "candela/square foot"), BigDecimal.valueOf(10.7639104167));
        LuminanceUnits.put(new LuminanceUnit("cd/in2", "candela/square inch"), BigDecimal.valueOf(1550.0031000062));
        LuminanceUnits.put(new LuminanceUnit("kcd/m2", "kilocandela/square meter"), BigDecimal.valueOf(1000));
        LuminanceUnits.put(new LuminanceUnit("sb", "stilb"), BigDecimal.valueOf(1000));
        LuminanceUnits.put(new LuminanceUnit("nt", "nit"), BigDecimal.valueOf(1));
        LuminanceUnits.put(new LuminanceUnit("mnt", "milli-nit"), BigDecimal.valueOf(0.001));
        LuminanceUnits.put(new LuminanceUnit("L", "lambert"), BigDecimal.valueOf(3183.0988618379));
        LuminanceUnits.put(new LuminanceUnit("mL", "milli-lambert"), BigDecimal.valueOf(3.1830988618));
        LuminanceUnits.put(new LuminanceUnit("fL", "foot-lambert"), BigDecimal.valueOf(3.4262590996));
        LuminanceUnits.put(new LuminanceUnit("asb", "apostilb"), BigDecimal.valueOf(0.3183098862));
        LuminanceUnits.put(new LuminanceUnit("sk", "skot"), BigDecimal.valueOf(0.0003183099));

    }

    public BigDecimal convert(BigDecimal from, String baseUnit, String targetUnit) {
        BigDecimal result = BigDecimal.valueOf(0);
        

        return result;
    }
}