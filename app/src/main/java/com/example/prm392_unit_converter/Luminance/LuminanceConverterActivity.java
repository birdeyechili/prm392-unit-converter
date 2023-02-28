package com.example.prm392_unit_converter.Luminance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.prm392_unit_converter.R;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class LuminanceConverterActivity extends AppCompatActivity {

    HashMap<LuminanceUnit, BigDecimal> LuminanceUnits = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luminance_converter);

        Button submitBtn = findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView inputText = findViewById(R.id.inputBox);
                BigDecimal input = new BigDecimal(inputText.getText().toString());
                BigDecimal result = convert(input, "cd/ft2", "cd/m2");
                TextView resultText = findViewById(R.id.resultText);
                resultText.setText(result.toString());
            }
        });
    }

    public BigDecimal convert(BigDecimal from, String baseUnit, String targetUnit) {
        LuminanceUnits.put(new LuminanceUnit("nt", "nit"), BigDecimal.valueOf(1));
        LuminanceUnits.put(new LuminanceUnit("cd/m2", "candela/square meter"), BigDecimal.valueOf(1));
        LuminanceUnits.put(new LuminanceUnit("cd/cm2", "candela/square centimeter"), BigDecimal.valueOf(1000));
        LuminanceUnits.put(new LuminanceUnit("cd/ft2", "candela/square foot"), BigDecimal.valueOf(10.7639104167));
        LuminanceUnits.put(new LuminanceUnit("cd/in2", "candela/square inch"), BigDecimal.valueOf(1550.0031000062));
        LuminanceUnits.put(new LuminanceUnit("kcd/m2", "kilocandela/square meter"), BigDecimal.valueOf(1000));
        LuminanceUnits.put(new LuminanceUnit("sb", "stilb"), BigDecimal.valueOf(10000));
        LuminanceUnits.put(new LuminanceUnit("mnt", "milli-nit"), BigDecimal.valueOf(0.001));
        LuminanceUnits.put(new LuminanceUnit("L", "lambert"), BigDecimal.valueOf(3183.0988618379));
        LuminanceUnits.put(new LuminanceUnit("mL", "milli-lambert"), BigDecimal.valueOf(3.1830988618));
        LuminanceUnits.put(new LuminanceUnit("fL", "foot-lambert"), BigDecimal.valueOf(3.4262590996));
        LuminanceUnits.put(new LuminanceUnit("asb", "apostilb"), BigDecimal.valueOf(0.3183098862));
        LuminanceUnits.put(new LuminanceUnit("sk", "skot"), BigDecimal.valueOf(0.0003183099));

        BigDecimal result = BigDecimal.valueOf(0);
        BigDecimal toNitValue = BigDecimal.valueOf(0);
        for (Map.Entry<LuminanceUnit, BigDecimal> ele : LuminanceUnits.entrySet()) {
            String keyUnit = ele.getKey().getUnitSymbol();
            if (baseUnit.equalsIgnoreCase(keyUnit)) {
                toNitValue = from.multiply(ele.getValue(), MathContext.DECIMAL64);
            }
        }
        for (Map.Entry<LuminanceUnit, BigDecimal> ele : LuminanceUnits.entrySet()) {
            String keyUnit = ele.getKey().getUnitSymbol();
            if (targetUnit.equalsIgnoreCase(keyUnit)) {
                result = toNitValue.divide(ele.getValue(), MathContext.DECIMAL64);
            }
        }
        return result;
    }
}