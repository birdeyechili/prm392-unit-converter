package com.example.prm392_unit_converter.Pressure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.prm392_unit_converter.ConverterActivity;
import com.example.prm392_unit_converter.R;
import com.example.prm392_unit_converter.Unit;

import java.util.ArrayList;
import java.util.List;

public class PressureConverterActivity extends ConverterActivity {
    @Override
    public void setContentView() {
        setContentView(R.layout.activity_converter);
    }

    @Override
    public String getLayoutTitle() {
        return "Pressure";
    }

    @Override
    public int getLayoutIcon() {
        return R.drawable.pressure;
    }

    @Override
    public List<Unit> getUnitList() {
        List<Unit> unitList = new ArrayList<>();
        unitList.add(new Unit("Pa","Pascal","1.0"));
        unitList.add(new Unit("kPa","Kilopascal","1000.0"));
        unitList.add(new Unit("MPa","Megapascal","1000000.0"));
        unitList.add(new Unit("GPa","Gigapascal","1000000000.0"));
        unitList.add(new Unit("dPa","Decipascal","0.1"));
        unitList.add(new Unit("cPa","Centipascal","0.01"));
        unitList.add(new Unit("mPa","Millipascal","0.001"));
        unitList.add(new Unit("psi","Psi","6894.7572931783"));
        unitList.add(new Unit("ksi","Ksi","6894757.2931783"));
        unitList.add(new Unit("atm","Standard atmosphere","101325.0"));
        return unitList;
    }
}