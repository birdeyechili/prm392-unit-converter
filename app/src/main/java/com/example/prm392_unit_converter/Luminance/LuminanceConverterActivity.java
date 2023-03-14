package com.example.prm392_unit_converter.Luminance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.prm392_unit_converter.R;
import com.example.prm392_unit_converter.Unit;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LuminanceConverterActivity extends AppCompatActivity {

    ArrayList<Unit> LuminanceUnits = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luminance_converter);

        Button submitBtn = findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LuminanceUnits.add(new Unit("nt", "nit", BigDecimal.valueOf(1)));
                LuminanceUnits.add(new Unit("cd/m2", "candela/square meter", BigDecimal.valueOf(1)));
                LuminanceUnits.add(new Unit("cd/cm2", "candela/square centimeter", BigDecimal.valueOf(1000)));
                LuminanceUnits.add(new Unit("cd/ft2", "candela/square foot", BigDecimal.valueOf(10.7639104167)));
                LuminanceUnits.add(new Unit("cd/in2", "candela/square inch", BigDecimal.valueOf(1550.0031000062)));
                LuminanceUnits.add(new Unit("kcd/m2", "kilocandela/square meter", BigDecimal.valueOf(1000)));
                LuminanceUnits.add(new Unit("sb", "stilb", BigDecimal.valueOf(10000)));
                LuminanceUnits.add(new Unit("mnt", "milli-nit", BigDecimal.valueOf(0.001)));
                LuminanceUnits.add(new Unit("L", "lambert", BigDecimal.valueOf(3183.0988618379)));
                LuminanceUnits.add(new Unit("mL", "milli-lambert", BigDecimal.valueOf(3.1830988618)));
                LuminanceUnits.add(new Unit("fL", "foot-lambert", BigDecimal.valueOf(3.4262590996)));
                LuminanceUnits.add(new Unit("asb", "apostilb", BigDecimal.valueOf(0.3183098862)));
                LuminanceUnits.add(new Unit("sk", "skot", BigDecimal.valueOf(0.0003183099)));

                TextView inputText = findViewById(R.id.inputBox);
                TextView resultText = findViewById(R.id.resultText);
                BigDecimal input = new BigDecimal(inputText.getText().toString());
                BigDecimal result = convert(input, "cd/ft2", "cd/m2").stripTrailingZeros();
                resultText.setText(result.toString());
            }
        });
    }

    public BigDecimal convert(BigDecimal from, String baseUnit, String targetUnit) {
        BigDecimal result = BigDecimal.valueOf(0);
        BigDecimal toNitValue = BigDecimal.valueOf(0);
        for (Unit ele : LuminanceUnits) {
            String keyUnit = ele.getSymbol();
            if (baseUnit.equalsIgnoreCase(keyUnit)) {
                toNitValue = from.multiply(ele.getValue(), MathContext.DECIMAL64);
            }
        }
        for (Unit ele : LuminanceUnits) {
            String keyUnit = ele.getSymbol();
            if (targetUnit.equalsIgnoreCase(keyUnit)) {
                result = toNitValue.divide(ele.getValue(), MathContext.DECIMAL64);
            }
        }
        return result;
    }
}