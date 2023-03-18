package com.example.prm392_unit_converter.Currency;

import java.math.BigDecimal;

public class TypeConverter {
    @androidx.room.TypeConverter
    public static String fromBigDecimal(BigDecimal val) {
        return val == null ? "" : val.toString();
    }

    @androidx.room.TypeConverter
    public static BigDecimal toBigDecimal(String val) {
        return val.isEmpty() ? new BigDecimal(0) : new BigDecimal(val);
    }
}
