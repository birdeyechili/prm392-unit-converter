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
        unitList.add(new Unit("s","Second","0.0002777777777777777"));
        unitList.add(new Unit("ms","Milisecond","0.00000027777777777777"));
        unitList.add(new Unit("μs","Microsecond","0.00000000027777777777"));
        unitList.add(new Unit("ns","Nanosecond","0.00000000000027777777"));
        unitList.add(new Unit("min","Minute","0.016666666666666666666"));
        unitList.add(new Unit("d","day","24"));
        unitList.add(new Unit("week","Week","168"));
        unitList.add(new Unit("month","Month","730.5"));
        unitList.add(new Unit("y","Year","8766"));

        return unitList;
    }
}