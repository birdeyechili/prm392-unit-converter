package com.example.prm392_unit_converter.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.prm392_unit_converter.Luminance.LuminanceConverterActivity;
import com.example.prm392_unit_converter.MenuActivity;
import com.example.prm392_unit_converter.R;


public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
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