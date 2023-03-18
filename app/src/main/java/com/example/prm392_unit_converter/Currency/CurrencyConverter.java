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
import com.example.prm392_unit_converter.R;
import com.example.prm392_unit_converter.Unit;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class CurrencyConverter extends AppCompatActivity {

    ArrayList<Unit> list = new ArrayList<>();

    Database db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_currency_converter);
//        TextView textView = (TextView) findViewById(R.id.textView2);
//        Button btn = (Button) findViewById(R.id.button);

        db = db = Room.databaseBuilder(getApplicationContext(), Database.class, "currency").allowMainThreadQueries().build();

        RequestQueue queue = Volley.newRequestQueue(CurrencyConverter.this);
        String url = "https://openexchangerates.org/api/latest.json?app_id=6e93156b0db84a85b0f77a694bd7e7d9";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    String result = response.getString("rates");
                    getCurrencyData(result);
                } catch (JSONException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("TAG", error.toString());
            }
        });
        queue.add(request);
    }

    public void getCurrencyData(String result) {
        db.currencyDAO().delete();

        result = result.substring(1, result.length() - 1);
        String[] arr = result.split(",");
        for (String s : arr) {
            String key = s.substring(1, 4);
            String val = s.substring(6);
            //list.add(new Unit(key, key, val));
            db.currencyDAO().insert(new Unit(key, key, val));
        }
//        for (Unit u : list) {
//            Log.e("Currency: ", u.getSymbol() + ", " + u.getValue());
//        }
    }
}