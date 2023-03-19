package com.example.prm392_unit_converter.Weight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.prm392_unit_converter.ConverterActivity;
import com.example.prm392_unit_converter.R;
import com.example.prm392_unit_converter.Unit;

import java.util.ArrayList;
import java.util.List;

public class WeightConverterActivity extends ConverterActivity {
    @Override
    public String getLayoutTitle() {
        return "Weight";
    }

    @Override
    public int getLayoutIcon() {
        return R.drawable.weight;
    }
//
    @Override
    public List<Unit> getUnitList() {
        List<Unit> unitList = new ArrayList<>();
        unitList.add(new Unit("kg","Kilogram","1.0"));
        unitList.add(new Unit("g","Gram","0.001"));
        unitList.add(new Unit("mg","Milligram","0.000001"));
        unitList.add(new Unit("t","Metric ton ","1000"));
        unitList.add(new Unit("£","Pound","0.453592"));
        unitList.add(new Unit("oz","Ounce","0.0283495"));
        unitList.add(new Unit("ct","Carat","0.0002"));
        return unitList;
    }
}