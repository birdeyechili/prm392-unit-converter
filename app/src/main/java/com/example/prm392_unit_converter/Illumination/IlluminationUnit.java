package com.example.prm392_unit_converter.Illumination;

public class IlluminationUnit {
    private String unitSymbol;
    private String unitDefinition;

    public IlluminationUnit(String unitSymbol, String unitDefinition) {
        this.unitSymbol = unitSymbol;
        this.unitDefinition = unitDefinition;
    }

    public String getUnitSymbol() {
        return unitSymbol;
    }

    public void setUnitSymbol(String unitSymbol) {
        this.unitSymbol = unitSymbol;
    }

    public String getUnitDefinition() {
        return unitDefinition;
    }

    public void setUnitDefinition(String unitDefinition) {
        this.unitDefinition = unitDefinition;
    }
}
