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
        unitList.add(new Unit("s","Second","0.0002777778"));
        unitList.add(new Unit("ms","Milisecond","2.777777777E-7"));
        unitList.add(new Unit("μs","Microsecond","2.777777777E-10"));
        unitList.add(new Unit("ns","Nanosecond","2.777777777E-13"));
        unitList.add(new Unit("min","Minute","0.0166666667"));
        unitList.add(new Unit("d","day","24"));
        unitList.add(new Unit("week","Week","168"));
        unitList.add(new Unit("month","Month","730.5"));
        unitList.add(new Unit("y","Year","8766"));

        return unitList;
    }
}