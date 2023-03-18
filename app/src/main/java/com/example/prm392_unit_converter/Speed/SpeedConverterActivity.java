package com.example.prm392_unit_converter.Speed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.prm392_unit_converter.ConverterActivity;
import com.example.prm392_unit_converter.R;
import com.example.prm392_unit_converter.Unit;

import java.util.ArrayList;
import java.util.List;

public class SpeedConverterActivity extends ConverterActivity {
    @Override
    public void setContentView() {
        setContentView(R.layout.activity_converter);
    }

    @Override
    public String getLayoutTitle() {
        return "Speed";
    }

    @Override
    public int getLayoutIcon() {
        return R.drawable.speed;
    }

    @Override
    public List<Unit> getUnitList() {
        List<Unit> unitList = new ArrayList<>();
        unitList.add(new Unit("km/h","kilometer/hour","1.0"));
        unitList.add(new Unit("m/s","meter/second","3.6"));
        unitList.add(new Unit("m/h","meter/hour ","0.001"));
        unitList.add(new Unit("m/min","meter/minute","0.06"));
        unitList.add(new Unit("km/min","kilometer/minute","60"));
        unitList.add(new Unit("km/s","kilometer/second","3600"));
        unitList.add(new Unit("cm/h","centimeter/hour","0.00001"));
        unitList.add(new Unit("cm/min","centimeter/minute","0.0006"));
        unitList.add(new Unit("cm/s","centimeter/second","0.036"));
        unitList.add(new Unit("mm/h","milimeter/hour","0.000001"));
        unitList.add(new Unit("mm/min","milimeter/minute","0.00006"));
        unitList.add(new Unit("mm/s","milimeter/second","0.0036"));
        unitList.add(new Unit("ft/h","foot/hour","0.0003048"));
        unitList.add(new Unit("ft/min","foot/minute","0.018288"));
        unitList.add(new Unit("ft/s","foot/second","1.09728"));
        unitList.add(new Unit("yd/h","yard/hour","0.0009144"));
        unitList.add(new Unit("yd/min","yard/minute","0.054864"));
        unitList.add(new Unit("yd/s","yard/second","3.29184"));
        unitList.add(new Unit("mi/h","mile/hour","1.609344"));
        unitList.add(new Unit("mi/min","mile/minute","96.56064"));
        unitList.add(new Unit("mi/s","mile/second","5793.6384"));
        return unitList;
    }
}