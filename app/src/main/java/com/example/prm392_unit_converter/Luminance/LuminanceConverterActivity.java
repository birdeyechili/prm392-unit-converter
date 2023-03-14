package com.example.prm392_unit_converter.Luminance;

import com.example.prm392_unit_converter.ConverterActivity;
import com.example.prm392_unit_converter.R;
import com.example.prm392_unit_converter.Unit;

import java.util.ArrayList;
import java.util.List;

public class LuminanceConverterActivity extends ConverterActivity {
    @Override
    public void setContentView() {
        setContentView(R.layout.activity_converter);
    }

    @Override
    public String getLayoutTitle() {
        return "Illumination";
    }

    @Override
    public int getLayoutIcon() {
        return R.drawable.illuminance;
    }

    @Override
    public List<Unit> getUnitList() {
        List<Unit> LuminanceUnits = new ArrayList<>();
        LuminanceUnits.add(new Unit("nt", "nit", "1"));
        LuminanceUnits.add(new Unit("cd/m2", "candela/square meter", "1"));
        LuminanceUnits.add(new Unit("cd/cm2", "candela/square centimeter", "1000"));
        LuminanceUnits.add(new Unit("cd/ft2", "candela/square foot", "10.7639104167"));
        LuminanceUnits.add(new Unit("cd/in2", "candela/square inch", "1550.0031000062"));
        LuminanceUnits.add(new Unit("kcd/m2", "kilocandela/square meter", "1000"));
        LuminanceUnits.add(new Unit("sb", "stilb", "10000"));
        LuminanceUnits.add(new Unit("mnt", "milli-nit", "0.001"));
        LuminanceUnits.add(new Unit("L", "lambert", "3183.0988618379"));
        LuminanceUnits.add(new Unit("mL", "milli-lambert", "3.1830988618"));
        LuminanceUnits.add(new Unit("fL", "foot-lambert", "3.4262590996"));
        LuminanceUnits.add(new Unit("asb", "apostilb", "0.3183098862"));
        LuminanceUnits.add(new Unit("sk", "skot", "0.0003183099"));
        return LuminanceUnits;
    }

}