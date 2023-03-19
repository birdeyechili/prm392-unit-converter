package com.example.prm392_unit_converter.Length;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.prm392_unit_converter.ConverterActivity;
import com.example.prm392_unit_converter.R;
import com.example.prm392_unit_converter.Unit;

import java.util.ArrayList;
import java.util.List;

public class LengthConverterActivity extends ConverterActivity {
    @Override
    public String getLayoutTitle() {
        return "Length";
    }

    @Override
    public int getLayoutIcon() {
        return R.drawable.length;
    }

    @Override
    public List<Unit> getUnitList() {
        List<Unit> unitList = new ArrayList<>();
        unitList.add(new Unit("cm","Centimeter","0.01"));
        unitList.add(new Unit("m","Meter","1.0"));
        unitList.add(new Unit("km","Kilometer","1000.0"));
        unitList.add(new Unit("mm","Millimeter","0.001"));
        unitList.add(new Unit("in","Inch ","0.0254"));
        unitList.add(new Unit("ft","Foot","0.3048"));
        unitList.add(new Unit("mi","Mile","1609.344"));
        unitList.add(new Unit("yd","Yard ","0.9144"));

        return unitList;
    }
}