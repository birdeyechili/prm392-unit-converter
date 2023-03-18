package com.example.prm392_unit_converter.Calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.prm392_unit_converter.R;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class KeyPadListener extends AppCompatActivity {

    MaterialButton btn_c, btn_brk_o, btn_brk_c;
    MaterialButton btn_divide, btn_multiply, btn_plus, btn_minus, btn_equal;
    MaterialButton btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;
    MaterialButton btn_del, btn_dot;

//    HashMap<MaterialButton, Integer> buttonMap = new HashMap<>();
//    public HashMap<MaterialButton, Integer> buttonMapping () {
//        HashMap<MaterialButton, Integer> buttonMap = new HashMap<>();
//        buttonMap.put(btn_c,R.id.btn_c);
//        buttonMap.put(btn_brk_o,R.id.btn_brk_o);
//        buttonMap.put(btn_brk_c,R.id.btn_brk_c);
//        buttonMap.put(btn_divide,R.id.btn_divide);
//        buttonMap.put(btn_multiply,R.id.btn_multiply);
//        buttonMap.put(btn_plus,R.id.btn_plus);
//        buttonMap.put(btn_minus,R.id.btn_minus);
//        buttonMap.put(btn_equal,R.id.btn_equal);
//        buttonMap.put(btn_0,R.id.btn_0);
//        buttonMap.put(btn_1,R.id.btn_1);
//        buttonMap.put(btn_2,R.id.btn_2);
//        buttonMap.put(btn_3,R.id.btn_3);
//        buttonMap.put(btn_4,R.id.btn_4);
//        buttonMap.put(btn_5,R.id.btn_5);
//        buttonMap.put(btn_6,R.id.btn_6);
//        buttonMap.put(btn_7,R.id.btn_7);
//        buttonMap.put(btn_8,R.id.btn_8);
//        buttonMap.put(btn_9,R.id.btn_9);
//        buttonMap.put(btn_del,R.id.btn_del);
//        buttonMap.put(btn_dot,R.id.btn_dot);
//
//        return buttonMap;
//
////        assignId(btn_c,R.id.btn_c);
////        assignId(btn_brk_o,R.id.btn_brk_o);
////        assignId(btn_brk_c,R.id.btn_brk_c);
////        assignId(btn_divide,R.id.btn_divide);
////        assignId(btn_multiply,R.id.btn_multiply);
////        assignId(btn_plus,R.id.btn_plus);
////        assignId(btn_minus,R.id.btn_minus);
////        assignId(btn_equal,R.id.btn_equal);
////        assignId(btn_0,R.id.btn_0);
////        assignId(btn_1,R.id.btn_1);
////        assignId(btn_2,R.id.btn_2);
////        assignId(btn_3,R.id.btn_3);
////        assignId(btn_4,R.id.btn_4);
////        assignId(btn_5,R.id.btn_5);
////        assignId(btn_6,R.id.btn_6);
////        assignId(btn_7,R.id.btn_7);
////        assignId(btn_8,R.id.btn_8);
////        assignId(btn_9,R.id.btn_9);
////        assignId(btn_del,R.id.btn_del);
////        assignId(btn_dot,R.id.btn_dot);
//    }
//
////    MaterialButton onKeypadListener(int buttonId) {
////        MaterialButton button = null;
////        for (Map.Entry<MaterialButton, Integer> k : buttonMap.entrySet()) {
////            if (k.getValue() == buttonId) {
////                button = k.getKey();
////            }
////        }
////        return button;
////    }
//
//    String getButtonText(int buttonId) {
//        String text = "";
//        for (Map.Entry<MaterialButton, Integer> k : buttonMap.entrySet()) {
//            if (k.getValue() == buttonId) {
//                text = k.getKey().getText().toString();
//            }
//        }
//        return text;
//    }

}