package com.example.prm392_unit_converter.Currency;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.example.prm392_unit_converter.R;
import com.google.android.material.button.MaterialButton;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class CurrencyConverter extends AppCompatActivity {
    Database db;
    TextView tv_input;
    TextView tv_result;
    TextView tv_fromSymbol;
    TextView tv_toSymbol;
    LinearLayout ll_fromUnit;
    LinearLayout ll_toUnit;
    TextView tv_fromValue;
    TextView tv_toValue;
    private final int MAX_INPUT_LENGTH = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView();
        //Set title and icon
        ((TextView)findViewById(R.id.tv_title)).setText(getLayoutTitle());
        ((ImageView)findViewById(R.id.iv_icon)).setImageResource(getLayoutIcon());

        //Initialize views
        tv_input = findViewById(R.id.tv_input);
        tv_result = findViewById(R.id.tv_result);
        tv_fromSymbol = findViewById(R.id.tv_fromSymbol);
        tv_toSymbol = findViewById(R.id.tv_toSymbol);
        ll_fromUnit = findViewById(R.id.ll_fromUnit);
        ll_toUnit = findViewById(R.id.ll_toUnit);
        tv_fromValue = findViewById(R.id.tv_fromValue);
        tv_toValue = findViewById(R.id.tv_toValue);

        //Set default units
        tv_fromSymbol.setText(getUnitList().get(0).getSymbol());
        tv_toSymbol.setText(getUnitList().get(1).getSymbol());
        tv_fromValue.setText(getUnitList().get(0).getValue().toString());
        tv_toValue.setText(getUnitList().get(1).getValue().toString());

        //Set horizontal scroll for result
        tv_result.setMovementMethod(new ScrollingMovementMethod());
        tv_result.setHorizontallyScrolling(true);

        //Set on click listener
        ll_fromUnit.setOnClickListener(new OnUnitClickListener(this, tv_fromSymbol, tv_fromValue));
        ll_toUnit.setOnClickListener(new OnUnitClickListener(this, tv_toSymbol, tv_toValue));
        assignId(R.id.btn_0);
        assignId(R.id.btn_1);
        assignId(R.id.btn_2);
        assignId(R.id.btn_3);
        assignId(R.id.btn_4);
        assignId(R.id.btn_5);
        assignId(R.id.btn_6);
        assignId(R.id.btn_7);
        assignId(R.id.btn_8);
        assignId(R.id.btn_9);
        assignId(R.id.btn_del);
        assignId(R.id.btn_dot);
    }

    void assignId(int id) {
        findViewById(id).setOnClickListener(v -> {
            String input_raw = tv_input.getText().toString();
            String fromValue_raw = tv_fromValue.getText().toString();
            String toValue_raw = tv_toValue.getText().toString();
            int length = input_raw.length();
            MaterialButton button = (MaterialButton) v;
            String buttonText = button.getText().toString();

            if (buttonText.equals("del")) {
                if(length>1){
                    input_raw = input_raw.substring(0, input_raw.length() - 1);
                }else{
                    input_raw = "0";
                }
            }else if(buttonText.equals(".")){
                if(!input_raw.contains(".")&&length<MAX_INPUT_LENGTH) tv_input.setText(input_raw + buttonText);
                return;
            }else if(length<MAX_INPUT_LENGTH){
                input_raw = input_raw + buttonText;
            }
            BigDecimal input = new BigDecimal(input_raw);
            BigDecimal fromValue = new BigDecimal(fromValue_raw);
            BigDecimal toValue = new BigDecimal(toValue_raw);
            tv_input.setText(input.toString());
            tv_result.setText(convert(input,fromValue,toValue).stripTrailingZeros().toString());
        });
    }

    public void setContentView() {
        setContentView(R.layout.activity_converter);
    }

    public String getLayoutTitle() {
        return "Currency";
    }

    public int getLayoutIcon() {
        return R.drawable.currency;
    }

    public List<CurrencyUnit> getUnitList() {
        db = Room.databaseBuilder(getApplicationContext(), Database.class, "CurrencyDB").allowMainThreadQueries().build();
        CurrencyDAO dbDAO = db.currencyDAO();
        return dbDAO.getAll();
    }

    private BigDecimal convert(BigDecimal fromInput, BigDecimal fromValue, BigDecimal toValue) {
        BigDecimal toBase = fromInput.divide(fromValue, 12, RoundingMode.HALF_EVEN);
        return toBase.multiply(toValue).stripTrailingZeros();
    }

    class OnUnitClickListener implements View.OnClickListener {
        private Context context;
        private TextView tv_symbol;
        private TextView tv_value;

        public OnUnitClickListener(Context context, TextView tv_symbol, TextView tv_value) {
            this.context = context;
            this.tv_symbol = tv_symbol;
            this.tv_value = tv_value;
        }

        @Override
        public void onClick(View v) {
            AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);
            alertBuilder.setTitle("Select Unit");

            List<String> options = new ArrayList<>();
            for(CurrencyUnit unit:getUnitList()){
                options.add(unit.getSymbol());
            }

            alertBuilder.setSingleChoiceItems(
                    options.toArray(new String[0]),        //Items list
                    -1,             //Index of checked item (-1 = no selection)
                    new DialogInterface.OnClickListener() //Item click listener
                    {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            CurrencyUnit unit = getUnitList().get(which);
                            tv_symbol.setText(unit.getSymbol());
                            tv_value.setText(unit.getValue().toString());
                            String input_raw = tv_input.getText().toString();
                            String fromValue_raw = tv_fromValue.getText().toString();
                            String toValue_raw = tv_toValue.getText().toString();
                            BigDecimal input = new BigDecimal(input_raw);
                            BigDecimal fromValue = new BigDecimal(fromValue_raw);
                            BigDecimal toValue = new BigDecimal(toValue_raw);
                            tv_result.setText(convert(input,fromValue,toValue).toString());
                            dialog.dismiss();
                        }
                    }
            );

            AlertDialog dialog = alertBuilder.create();
            //display the alert dialog
            dialog.show();
        }
    }
}