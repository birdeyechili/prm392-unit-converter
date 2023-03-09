package com.example.prm392_unit_converter;

public class Unit {
    private String symbol;
    private String name;
    private double value;

    public Unit(String symbol, String name, double value) {
        this.symbol = symbol;
        this.name = name;
        this.value = value;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name+" ["+symbol+"]";
    }
}
