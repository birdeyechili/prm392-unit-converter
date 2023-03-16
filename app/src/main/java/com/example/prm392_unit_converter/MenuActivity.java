package com.example.prm392_unit_converter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.prm392_unit_converter.Force.ForceConverterActivity;
import com.example.prm392_unit_converter.Luminance.LuminanceConverterActivity;
import com.example.prm392_unit_converter.Power.PowerConverterActivity;
import com.example.prm392_unit_converter.Pressure.PressureConverterActivity;


public class MenuActivity extends AppCompatActivity {

    CardView cv_length;
    CardView cv_weight;
    CardView cv_area;
    CardView cv_volume;
    CardView cv_speed;
    CardView cv_time;
    CardView  cv_force;
    CardView cv_power;
    CardView cv_data;
    CardView cv_currency;
    CardView cv_acceleration;
    CardView cv_angle;
    CardView cv_illuminance;
    CardView cv_pressure;
    CardView cv_base;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        cv_length = findViewById(R.id.cv_length);
        cv_weight = findViewById(R.id.cv_weight);
        cv_area = findViewById(R.id.cv_area);
        cv_volume = findViewById(R.id.cv_Volume);
        cv_speed = findViewById(R.id.cv_speed);
        cv_time = findViewById(R.id.cv_time);
        cv_force = findViewById(R.id.cv_force);
        cv_power = findViewById(R.id.cv_power);
        cv_data = findViewById(R.id.cv_data);
        cv_currency = findViewById(R.id.cv_currency);
        cv_acceleration = findViewById(R.id.cv_acceleration);
        cv_angle = findViewById(R.id.cv_angle);
        cv_illuminance = findViewById(R.id.cv_illuminance);
        cv_pressure = findViewById(R.id.cv_pressure);
        cv_base = findViewById(R.id.cv_base);

        cv_length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });
        cv_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });
        cv_area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });
        cv_volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });
        cv_speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });
        cv_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });
        cv_force.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, ForceConverterActivity.class));
            }
        });
        cv_power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, PowerConverterActivity.class));
            }
        });
        cv_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });
        cv_currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });
        cv_acceleration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });
        cv_angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });
        cv_illuminance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, LuminanceConverterActivity.class));
            }
        });
        cv_pressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, PressureConverterActivity.class));
            }
        });
        cv_base.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });


    }
}