package com.example.prm392_unit_converter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.example.prm392_unit_converter.Area.AreaConverterActivity;
import com.example.prm392_unit_converter.Acceleration.AccelerationConverterActivity;
import com.example.prm392_unit_converter.Angle.AngleConverterActivity;
import com.example.prm392_unit_converter.Calculator.SimpleCalculator;
import com.example.prm392_unit_converter.Currency.CurrencyConverter;
import com.example.prm392_unit_converter.Data.DataConverterActivity;
import com.example.prm392_unit_converter.Force.ForceConverterActivity;
import com.example.prm392_unit_converter.Illumination.IlluminationConverterActivity;
import com.example.prm392_unit_converter.Length.LengthConverterActivity;
import com.example.prm392_unit_converter.Luminance.LuminanceConverterActivity;
import com.example.prm392_unit_converter.Power.PowerConverterActivity;
import com.example.prm392_unit_converter.Pressure.PressureConverterActivity;
import com.example.prm392_unit_converter.Speed.SpeedConverterActivity;
import com.example.prm392_unit_converter.Time.TimeConverterActivity;
import com.example.prm392_unit_converter.Volume.VolumeConverterActivity;
import com.example.prm392_unit_converter.Weight.WeightConverterActivity;


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

    CardView cv_luminance;

    CardView cv_calculator;



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
        cv_luminance = findViewById(R.id.cv_luminance);
        cv_calculator = findViewById(R.id.cv_calculator);

        cv_length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, LengthConverterActivity.class));
            }
        });
        cv_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, WeightConverterActivity.class));
            }
        });
        cv_area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, AreaConverterActivity.class));
            }
        });
        cv_volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, VolumeConverterActivity.class));
            }
        });
        cv_speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, SpeedConverterActivity.class));
            }
        });
        cv_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, TimeConverterActivity.class));
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
                startActivity(new Intent(MenuActivity.this, DataConverterActivity.class));
            }
        });
        cv_currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, CurrencyConverter.class));
            }
        });
        cv_acceleration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, AccelerationConverterActivity.class));
            }
        });
        cv_angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, AngleConverterActivity.class));
            }
        });
        cv_illuminance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, IlluminationConverterActivity.class));
            }
        });
        cv_pressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, PressureConverterActivity.class));
            }
        });

        cv_luminance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, LuminanceConverterActivity.class));
            }
        });

        cv_calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, SimpleCalculator.class));
            }
        });


    }
}