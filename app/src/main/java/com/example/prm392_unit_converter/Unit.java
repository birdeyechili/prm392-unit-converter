package com.example.prm392_unit_converter;

import java.math.BigDecimal;

public class Unit {
    private String symbol;
    private String name;
    private BigDecimal value;

    public Unit(String symbol, String name, double value) {
        this.symbol = symbol;
        this.name = name;
        this.value = BigDecimal.valueOf(value);
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name+" ["+symbol+"]";
    }
}
