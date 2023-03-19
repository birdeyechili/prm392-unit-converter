package com.example.prm392_unit_converter.Currency;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.prm392_unit_converter.ConverterActivity;
import com.example.prm392_unit_converter.R;
import com.example.prm392_unit_converter.Unit;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class CurrencyConverter extends ConverterActivity {

    Database db;


    @Override
    public void setContentView() {
        setContentView(R.layout.activity_converter);
    }

    @Override
    public String getLayoutTitle() {
        return "Currency";
    }

    @Override
    public int getLayoutIcon() {
        return R.drawable.currency;
    }

    @Override
    public List<Unit> getUnitList() {
        db = Room.databaseBuilder(getApplicationContext(), Database.class, "currency").allowMainThreadQueries().build();
        CurrencyDAO dbDAO = db.currencyDAO();
        List<Unit> unitList = new ArrayList<>();
        unitList = dbDAO.getAll();
        if (unitList.size() == 0) {
            Log.e("ABC", "Empty unitList");
            return null;
        }
        return unitList;
    }
}