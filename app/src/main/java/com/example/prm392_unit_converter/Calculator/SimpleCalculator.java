package com.example.prm392_unit_converter.Calculator;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.prm392_unit_converter.R;
import com.google.android.material.button.MaterialButton;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class SimpleCalculator extends AppCompatActivity implements View.OnClickListener {

    TextView solutionTv, resultTv;
    MaterialButton btn_c, btn_brk_o, btn_brk_c;
    MaterialButton btn_divide, btn_multiply, btn_plus, btn_minus, btn_equal;
    MaterialButton btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;
    MaterialButton btn_del, btn_dot;

    HorizontalScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);
        solutionTv = (TextView) findViewById(R.id.solution_tv);
        resultTv = (TextView) findViewById(R.id.result_tv);
        scrollView = findViewById(R.id.scrollViewSolution);
        resultTv.setOnLongClickListener(v->{
            ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(android.content.Context.CLIPBOARD_SERVICE);
            cm.setPrimaryClip(ClipData.newPlainText("Calculator result",resultTv.getText()));
            Toast.makeText(getApplicationContext(), "Copied calculator result", Toast.LENGTH_SHORT).show();
            return true;
        });

        //HashMap<MaterialButton, Integer> buttonMap = new HashMap<>();
        assignId(btn_c, R.id.btn_c);
        assignId(btn_brk_o, R.id.btn_brk_o);
        assignId(btn_brk_c, R.id.btn_brk_c);
        assignId(btn_divide, R.id.btn_divide);
        assignId(btn_multiply, R.id.btn_multiply);
        assignId(btn_plus, R.id.btn_plus);
        assignId(btn_minus, R.id.btn_minus);
        assignId(btn_equal, R.id.btn_equal);
        assignId(btn_0, R.id.btn_0);
        assignId(btn_1, R.id.btn_1);
        assignId(btn_2, R.id.btn_2);
        assignId(btn_3, R.id.btn_3);
        assignId(btn_4, R.id.btn_4);
        assignId(btn_5, R.id.btn_5);
        assignId(btn_6, R.id.btn_6);
        assignId(btn_7, R.id.btn_7);
        assignId(btn_8, R.id.btn_8);
        assignId(btn_9, R.id.btn_9);
        assignId(btn_del, R.id.btn_del);
        assignId(btn_dot, R.id.btn_dot);
    }

    void assignId(MaterialButton btn, int id) {
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        MaterialButton button = (MaterialButton) v;
        String buttonText = button.getText().toString();
        String dataToCalculate = solutionTv.getText().toString();

        if (buttonText.equals("C")) {
            solutionTv.setText("");
            resultTv.setText("0");
            return;
        }
        if (buttonText.equals("=")) {
            String result = getResult(dataToCalculate);
            resultTv.setText(result);
            return;
        }
        if (buttonText.equals("del")) {
            if (dataToCalculate.length() > 0) {
                dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 1);
            }
        } else {
            dataToCalculate = dataToCalculate + buttonText;
        }
        solutionTv.setText(dataToCalculate);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                scrollView.fullScroll(View.FOCUS_RIGHT);
            }
        });
    }

    String getResult(String data) {
        try {
            Context context = Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable = context.initStandardObjects();
            String finalResult = context.evaluateString(scriptable, data, "Javascript", 1, null).toString();
            if (finalResult.endsWith(".0")) {
                finalResult = finalResult.replace(".0", "");
            }
            return finalResult;
        } catch (Exception e) {
            return "Syntax Error!";
        }
    }
}