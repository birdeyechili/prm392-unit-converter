package com.example.prm392_unit_converter.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.prm392_unit_converter.Currency.CurrencyDAO;
import com.example.prm392_unit_converter.Currency.Database;
import com.example.prm392_unit_converter.Luminance.LuminanceConverterActivity;
import com.example.prm392_unit_converter.MenuActivity;
import com.example.prm392_unit_converter.R;
import com.example.prm392_unit_converter.Unit;

import org.json.JSONException;
import org.json.JSONObject;

import java.sql.Date;
import java.text.SimpleDateFormat;


public class SplashScreen extends AppCompatActivity {

    Database db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        db = Room.databaseBuilder(getApplicationContext(), Database.class, "currency").allowMainThreadQueries().build();
        CurrencyDAO dbDao = db.currencyDAO();
        RequestQueue queue = Volley.newRequestQueue(SplashScreen.this);
        String url = "https://openexchangerates.org/api/latest.json?app_id=6e93156b0db84a85b0f77a694bd7e7d9";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    String timestamp = response.getString("timestamp");
                    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
                    Date date = new Date(Long.parseLong(timestamp));
                    Log.e("TAG", date.toString());
                    String result = response.getString("rates");
                    result = result.substring(1, result.length() - 1);
                    String[] arr = result.split(",");
                    for (String s : arr) {
                        String key = s.substring(1, 4);
                        String val = s.substring(6);
                        dbDao.insert(new Unit(key, key, val));
                        Log.i("TAG", key + ", " + val);
                    }
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


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}