package com.example.prm392_unit_converter.Time;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.prm392_unit_converter.ConverterActivity;
import com.example.prm392_unit_converter.R;
import com.example.prm392_unit_converter.Unit;

import java.util.ArrayList;
import java.util.List;

public class TimeConverterActivity extends ConverterActivity {
    @Override
    public void setContentView() {
        setContentView(R.layout.activity_converter);
    }

    @Override
    public String getLayoutTitle() {
        return "Time";
    }

    @Override
    public int getLayoutIcon() {
        return R.drawable.time;
    }

    @Override
    public List<Unit> getUnitList() {
        List<Unit> unitList = new ArrayList<>();
        unitList.add(new Unit("hr","Hour","1.0"));
        unitList.add(new Unit("s","Second","3600"));
        unitList.add(new Unit("ms","Milisecond","3600000"));
        unitList.add(new Unit("μs","Microsecond","3600000000"));
        unitList.add(new Unit("ns","Nanosecond","3600000000000"));
        unitList.add(new Unit("min","Minute","60"));
        unitList.add(new Unit("d","day","0.0416666667"));
        unitList.add(new Unit("week","Week","0.005952381"));
        unitList.add(new Unit("month","Month","0.0013689254"));
        unitList.add(new Unit("y","Year","0.0001140771"));

        return unitList;
    }
}