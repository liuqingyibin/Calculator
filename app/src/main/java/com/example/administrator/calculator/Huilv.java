package com.example.administrator.calculator;

import android.widget.TextView;

/**
 * Created by Administrator on 2016/10/25.
 */
public class Huilv {
    public void jisuan(TextView textView1,TextView textView2,TextView textView3,TextView textView4)
    {
        double num1=Double.parseDouble(textView1.getText().toString());
        textView1.setText(textView1.getText().toString()+"人民币");
        textView2.setText(Double.toString(num1/6.8)+"美元");
        textView3.setText(Double.toString(num1*100)+"日元");
        textView4.setText(Double.toString(num1/10)+"英镑");
    }
}
