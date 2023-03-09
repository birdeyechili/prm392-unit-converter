package com.example.prm392_unit_converter;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Util {
    public static BigDecimal convert(double fromInput, double fromValue, double toValue){
        BigDecimal toWatt = BigDecimal.valueOf(fromInput).multiply(BigDecimal.valueOf(fromValue));
        return toWatt.divide(BigDecimal.valueOf(toValue), 5, RoundingMode.HALF_EVEN).stripTrailingZeros();
    }
}
