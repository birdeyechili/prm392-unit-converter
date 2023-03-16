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
        unitList.add(new Unit("m/s","meter/second","0.2777777778"));
        unitList.add(new Unit("m/h","meter/hour ","1000"));
        unitList.add(new Unit("m/min","meter/minute","16.666666667"));
        unitList.add(new Unit("km/min","kilometer/minute","0.0166666667"));
        unitList.add(new Unit("km/s","kilometer/second","0.0002777778"));
        unitList.add(new Unit("cm/h","centimeter/hour","100000"));
        unitList.add(new Unit("cm/min","centimeter/minute","1666.6666667"));
        unitList.add(new Unit("cm/s","centimeter/second","27.777777778"));
        unitList.add(new Unit("mm/h","milimeter/hour","1000000"));
        unitList.add(new Unit("mm/min","milimeter/minute","16666.666667"));
        unitList.add(new Unit("mm/s","milimeter/second","277.77777778"));
        unitList.add(new Unit("ft/h","foot/hour","3280.839895"));
        unitList.add(new Unit("ft/min","foot/minute","54.680664917"));
        unitList.add(new Unit("ft/s","foot/second","0.9113444153"));
        unitList.add(new Unit("yd/h","yard/hour","1093.6132983"));
        unitList.add(new Unit("yd/min","yard/minute","18.226888306"));
        unitList.add(new Unit("yd/s","yard/second","0.3037814718"));
        unitList.add(new Unit("mi/h","mile/hour","0.6213711922"));
        unitList.add(new Unit("mi/min","mile/minute","0.0103561865"));
        unitList.add(new Unit("mi/s","mile/second","0.0001726031"));
        return unitList;
    }
}