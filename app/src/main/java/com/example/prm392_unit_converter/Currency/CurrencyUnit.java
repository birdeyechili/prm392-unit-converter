package com.example.prm392_unit_converter.Currency;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.math.BigDecimal;

@Entity
public class CurrencyUnit {
    @PrimaryKey
    @NonNull
    private String symbol;
    private BigDecimal value;

    public CurrencyUnit() {
    }

    public CurrencyUnit(String symbol, String value) {
        this.symbol = symbol;
        this.value = new BigDecimal(value);
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
