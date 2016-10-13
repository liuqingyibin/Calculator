package com.example.administrator.calculator;

import android.widget.TextView;

/**
 * Created by Administrator on 2016/10/25.
 */
public class Zhiliang {
    public double jisuan(TextView textView1,TextView textView2,TextView textView3,TextView textView4)
    {
        double num1=Double.parseDouble(textView1.getText().toString());
        textView1.setText(textView1.getText().toString()+"千克");
        textView2.setText(Double.toString(num1*2)+"斤");
        textView3.setText(Double.toString(num1*20)+"两");
        textView4.setText(Double.toString(num1*1000)+"克");
        return 0;
    }
}
