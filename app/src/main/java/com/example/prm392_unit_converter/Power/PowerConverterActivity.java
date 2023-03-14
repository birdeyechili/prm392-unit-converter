package com.example.prm392_unit_converter.Power;

import com.example.prm392_unit_converter.ConverterActivity;
import com.example.prm392_unit_converter.R;
import com.example.prm392_unit_converter.Unit;

import java.util.ArrayList;
import java.util.List;

public class PowerConverterActivity extends ConverterActivity {
    @Override
    public void setContentView() {
        setContentView(R.layout.activity_converter);
    }

    @Override
    public String getLayoutTitle() {
        return "Power";
    }

    @Override
    public int getLayoutIcon() {
        return R.drawable.power;
    }

    @Override
    public List<Unit> getUnitList() {
        List<Unit> unitList = new ArrayList<>();
        unitList.add(new Unit("W","Watt",1.0));
        unitList.add(new Unit("hW","Hectowatt",100.0));
        unitList.add(new Unit("kW","Kilowatt",1000.0));
        unitList.add(new Unit("MW","Megawatt",1000000.0));
        unitList.add(new Unit("dW","Deciwatt ",0.1));
        unitList.add(new Unit("cW","Centiwatt",0.01));
        unitList.add(new Unit("mW","Milliwatt",0.001));
        return unitList;
    }
}