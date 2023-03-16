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
        unitList.add(new Unit("cm2","Square Centimeter","10000.0"));
        unitList.add(new Unit("km2","Square Kilometer","0.000001"));
        unitList.add(new Unit("mm2","Square Millimeter","1000000.0"));
        unitList.add(new Unit("ha","Hectare ","0.0001"));
        unitList.add(new Unit("ac","Acre","0.0002471054"));
        unitList.add(new Unit("sq. ft.","Square Foot","10.763910417"));
        unitList.add(new Unit("sq in.","Square Inch","1550.0031"));

        return unitList;
    }
}