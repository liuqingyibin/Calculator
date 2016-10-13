package com.example.administrator.calculator;

import android.widget.TextView;

/**
 * Created by Administrator on 2016/10/25.
 */
public class Changdu {
    public double jisuan(TextView textView1,TextView textView2,TextView textView3,TextView textView4)
    {
        double num1=Double.parseDouble(textView1.getText().toString());
        textView1.setText(textView1.getText().toString()+"米");
        textView2.setText(Double.toString(num1*10)+"分米");
        textView3.setText(Double.toString(num1*100)+"厘米");
        textView4.setText(Double.toString(num1*1000)+"毫米");
        return 0;
    }
}
