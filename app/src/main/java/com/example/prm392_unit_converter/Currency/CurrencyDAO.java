package com.example.prm392_unit_converter.Currency;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.prm392_unit_converter.Unit;

import java.util.List;

@Dao
public interface CurrencyDAO {
    @Query("SELECT * FROM currency")
    List<Unit> getAll();

    @Insert
    void insert(Unit unit);

    @Query("DELETE FROM currency")
    void delete();
}
