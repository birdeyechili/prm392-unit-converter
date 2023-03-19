package com.example.prm392_unit_converter.Currency;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.prm392_unit_converter.Unit;

import java.util.List;

@Dao
public interface CurrencyDAO {
    @Query("SELECT * FROM CurrencyUnit")
    List<CurrencyUnit> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(CurrencyUnit currencyUnit);

    @Query("DELETE FROM CurrencyUnit")
    void delete();
}
