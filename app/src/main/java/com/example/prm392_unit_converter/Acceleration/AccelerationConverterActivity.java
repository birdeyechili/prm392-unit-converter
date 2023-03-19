package com.example.prm392_unit_converter.Acceleration;

import com.example.prm392_unit_converter.ConverterActivity;
import com.example.prm392_unit_converter.R;
import com.example.prm392_unit_converter.Unit;

import java.util.ArrayList;
import java.util.List;

public class AccelerationConverterActivity extends ConverterActivity {
    @Override
    public String getLayoutTitle() {
        return "Acceleration";
    }

    @Override
    public int getLayoutIcon() {
        return R.drawable.acceleration;
    }

    @Override
    public List<Unit> getUnitList() {
        List<Unit> unitList = new ArrayList<>();
        unitList.add(new Unit("m/s^2", "Meter/square second", "1.0"));
        unitList.add(new Unit("dm/s^2", "Decimeter/square second", "0.1"));
        unitList.add(new Unit("km/s^2", "Kilometer/square second", "1000.0"));
        unitList.add(new Unit("hm/s^2", "Hectometer/square second", "100.0"));
        unitList.add(new Unit("cm/s^2", "Centimeter/square second", "0.01"));
        unitList.add(new Unit("mm/s^2", "Milimeter/square second", "0.001"));
        unitList.add(new Unit("mi/s^2", "Mile/square second", "1609.344"));
        unitList.add(new Unit("yd/s^2", "Yard/square second", "0.9144"));
        unitList.add(new Unit("ft/s^2", "Foot/square second", "0.3048"));
        unitList.add(new Unit("in/s^2", "Inch/square second", "0.0254"));
        unitList.add(new Unit("g", "Acceleration of gravity", "9.80665"));
        return unitList;
    }
}