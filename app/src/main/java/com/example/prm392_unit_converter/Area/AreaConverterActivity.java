package com.example.prm392_unit_converter.Area;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.prm392_unit_converter.ConverterActivity;
import com.example.prm392_unit_converter.R;
import com.example.prm392_unit_converter.Unit;

import java.util.ArrayList;
import java.util.List;

public class AreaConverterActivity extends ConverterActivity {
    @Override
    public void setContentView() {
        setContentView(R.layout.activity_converter);
    }

    @Override
    public String getLayoutTitle() {
        return "Area";
    }

    @Override
    public int getLayoutIcon() {
        return R.drawable.area;
    }

    @Override
    public List<Unit> getUnitList() {
        List<Unit> unitList = new ArrayList<>();
        unitList.add(new Unit("m2","Square Meter","1.0"));
        unitList.add(new Unit("cm2","Square Centimeter","0.0001"));
        unitList.add(new Unit("km2","Square Kilometer","1000000.0"));
        unitList.add(new Unit("mm2","Square Millimeter","1.0e-6"));
        unitList.add(new Unit("ha","Hectare ","10000"));
        unitList.add(new Unit("ac","Acre","4046.8564224"));
        unitList.add(new Unit("sq. ft.","Square Foot","0.09290304"));
        unitList.add(new Unit("sq in.","Square Inch","0.00064516"));

        return unitList;
    }
}