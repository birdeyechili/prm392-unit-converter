package com.example.prm392_unit_converter.Data;

import com.example.prm392_unit_converter.ConverterActivity;
import com.example.prm392_unit_converter.R;
import com.example.prm392_unit_converter.Unit;

import java.util.ArrayList;
import java.util.List;

public class DataConverterActivity extends ConverterActivity {
    @Override
    public String getLayoutTitle() {
        return "Data";
    }

    @Override
    public int getLayoutIcon() {
        return R.drawable.data;
    }

    @Override
    public List<Unit> getUnitList() {
        List<Unit> unitList = new ArrayList<>();
        unitList.add(new Unit("b", "bit", "1"));
        unitList.add(new Unit("B", "byte", "8"));
        unitList.add(new Unit("block", "block", "4096"));
        unitList.add(new Unit("word", "word", "16"));
        unitList.add(new Unit("kB", "kilobyte", "8192"));
        unitList.add(new Unit("MB", "megabyte", "8388608"));
        unitList.add(new Unit("GB", "gigabyte", "8589934592"));
        unitList.add(new Unit("TB", "terabyte", "8796093022208"));
        return unitList;
    }
}