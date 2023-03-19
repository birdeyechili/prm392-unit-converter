package com.example.prm392_unit_converter.Luminance;

import com.example.prm392_unit_converter.ConverterActivity;
import com.example.prm392_unit_converter.R;
import com.example.prm392_unit_converter.Unit;

import java.util.ArrayList;
import java.util.List;

public class LuminanceConverterActivity extends ConverterActivity {
    @Override
    public String getLayoutTitle() {
        return "Luminance";
    }

    @Override
    public int getLayoutIcon() {
        return R.drawable.illuminance;
    }

    @Override
    public List<Unit> getUnitList() {
        List<Unit> LuminanceUnits = new ArrayList<>();
        LuminanceUnits.add(new Unit("nt", "Nit", "1"));
        LuminanceUnits.add(new Unit("cd/m2", "Candela/square meter", "1"));
        LuminanceUnits.add(new Unit("cd/cm2", "Candela/square centimeter", "1000"));
        LuminanceUnits.add(new Unit("cd/ft2", "Candela/square foot", "10.7639104167"));
        LuminanceUnits.add(new Unit("cd/in2", "Candela/square inch", "1550.0031000062"));
        LuminanceUnits.add(new Unit("kcd/m2", "Kilocandela/square meter", "1000"));
        LuminanceUnits.add(new Unit("sb", "Stilb", "10000"));
        LuminanceUnits.add(new Unit("mnt", "Milli-nit", "0.001"));
        LuminanceUnits.add(new Unit("L", "Lambert", "3183.0988618379"));
        LuminanceUnits.add(new Unit("mL", "Milli-lambert", "3.1830988618"));
        LuminanceUnits.add(new Unit("fL", "Foot-lambert", "3.4262590996"));
        LuminanceUnits.add(new Unit("asb", "Apostilb", "0.3183098862"));
        LuminanceUnits.add(new Unit("sk", "Skot", "0.0003183099"));
        return LuminanceUnits;
    }

}