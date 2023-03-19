package com.example.prm392_unit_converter.Angle;

import com.example.prm392_unit_converter.ConverterActivity;
import com.example.prm392_unit_converter.R;
import com.example.prm392_unit_converter.Unit;

import java.util.ArrayList;
import java.util.List;

public class AngleConverterActivity extends ConverterActivity {
    @Override
    public String getLayoutTitle() {
        return "Angle";
    }

    @Override
    public int getLayoutIcon() {
        return R.drawable.angle;
    }

    @Override
    public List<Unit> getUnitList() {
        List<Unit> unitList = new ArrayList<>();
        unitList.add(new Unit("°","Degree ","1"));
        unitList.add(new Unit("rad","Radian ","57.2957795131"));
        unitList.add(new Unit("^g","Grad ","0.9"));
        unitList.add(new Unit("'","Minute ","0.01666666666666666666"));
        unitList.add(new Unit("\"","Second ","0.00027777777777777777"));
        unitList.add(new Unit("r","Revolution ","360"));
        unitList.add(new Unit("","Sextant ","60"));
        unitList.add(new Unit("","Circle ","360"));
        unitList.add(new Unit("","Quadrant  ","90"));
        return unitList;
    }
}