package com.example.prm392_unit_converter.Volume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.prm392_unit_converter.ConverterActivity;
import com.example.prm392_unit_converter.R;
import com.example.prm392_unit_converter.Unit;

import java.util.ArrayList;
import java.util.List;

public class VolumeConverterActivity extends ConverterActivity {
    @Override
    public void setContentView() {
        setContentView(R.layout.activity_converter);
    }

    @Override
    public String getLayoutTitle() {
        return "Volume";
    }

    @Override
    public int getLayoutIcon() {
        return R.drawable.volume;
    }

    @Override
    public List<Unit> getUnitList() {
        List<Unit> unitList = new ArrayList<>();
        unitList.add(new Unit("m3","Cubic Meter","1.0"));
        unitList.add(new Unit("km3","Cubic Kilometer","1.E-9"));
        unitList.add(new Unit("cm3","Cubic Centimeter","1000000.0"));
        unitList.add(new Unit("mm3","Cubic Milimeter","1000000000.0"));
        unitList.add(new Unit("l","Liter","1000"));
        unitList.add(new Unit("mi3","Cubic Mile","2.399128636E-10"));
        unitList.add(new Unit("yd3","Cubic Yard","1.3079506193"));
        unitList.add(new Unit("ft3","Cubic Foot","35.314666721"));
        unitList.add(new Unit("in3","Cubic Inch","61023.744095"));
        unitList.add(new Unit("gal","US Gallon","264.17217686s"));
        return unitList;
    }
}