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
    public void setContentView() {
        setContentView(R.layout.activity_converter);
    }

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
        unitList.add(new Unit("cm","Centimeter","100.0"));
        unitList.add(new Unit("m","Meter","1.0"));
        unitList.add(new Unit("km","Kilometer","0.001"));
        unitList.add(new Unit("mm","Millimeter","1000.0"));
        unitList.add(new Unit("in","Inch ","39.37007874"));
        unitList.add(new Unit("ft","Foot","3.280839895"));
        unitList.add(new Unit("mi","Mile","0.0006213689"));
        unitList.add(new Unit("mi","Mile","0.0006213689"));

        return unitList;
    }
}