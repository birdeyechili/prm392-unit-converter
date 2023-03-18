package com.example.prm392_unit_converter;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.math.BigDecimal;

@Entity(tableName = "currency")
public class Unit {
    @PrimaryKey
    @NonNull
    private String symbol;
    private String name;

    private BigDecimal value;

    public Unit() {
    }

    public Unit(String symbol, String name, String value) {
        this.symbol = symbol;
        this.name = name;
        this.value = new BigDecimal(value);
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return name+" ["+symbol+"]";
    }
}
