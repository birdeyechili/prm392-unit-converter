package com.example.prm392_unit_converter.Illumination;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.prm392_unit_converter.ConverterActivity;
import com.example.prm392_unit_converter.R;
import com.example.prm392_unit_converter.Unit;

import java.util.ArrayList;
import java.util.List;

public class IlluminationConverterActivity extends ConverterActivity {
    @Override
    public void setContentView() {
        setContentView(R.layout.activity_converter);
    }

    @Override
    public String getLayoutTitle() {
        return "Illumination";
    }

    @Override
    public int getLayoutIcon() {
        return R.drawable.illuminance;
    }

    @Override
    public List<Unit> getUnitList() {
        List<Unit> unitList = new ArrayList<>();
        unitList.add(new Unit("lx", "Lux", "1"));
        unitList.add(new Unit("cm*c", "Centimeter-candle", "10000"));
        unitList.add(new Unit("ft*c", "foot-candle", "10.7639104167"));
        unitList.add(new Unit("flame", "Flame", "43.0556416668"));
        unitList.add(new Unit("ph", "Phot", "10000"));
        unitList.add(new Unit("nox", "Nox", "0.001"));
        unitList.add(new Unit("lm/m^2", "Lumen/square meter", "1"));
        unitList.add(new Unit("lm/ft^2", "Lumen/square foot", "10.7639104167"));
        return unitList;
    }
}