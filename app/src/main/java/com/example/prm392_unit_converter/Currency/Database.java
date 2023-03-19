package com.example.prm392_unit_converter.Currency;

import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.prm392_unit_converter.Unit;

@androidx.room.Database(entities = {CurrencyUnit.class}, version = 1)
@TypeConverters({TypeConverter.class})
public abstract class Database extends RoomDatabase {
    public abstract CurrencyDAO currencyDAO();
}
