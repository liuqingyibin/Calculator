package com.example.administrator.calculator;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/10/26.
 */
public class Activity extends AppCompatActivity{

    boolean chang=false;
    boolean zhong=false;
    boolean hui=false;
    boolean point2=true;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landceshi);



        Button btn_lan_0=(Button)findViewById(R.id.btn_lan_0);
        Button btn_lan_1=(Button)findViewById(R.id.btn_lan_1);
        Button btn_lan_2=(Button)findViewById(R.id.btn_lan_2);
        Button btn_lan_3=(Button)findViewById(R.id.btn_lan_3);
        Button btn_lan_4=(Button)findViewById(R.id.btn_lan_4);
        Button btn_lan_5=(Button)findViewById(R.id.btn_lan_5);
        Button btn_lan_6=(Button)findViewById(R.id.btn_lan_6);
        Button btn_lan_7=(Button)findViewById(R.id.btn_lan_7);
        Button btn_lan_8=(Button)findViewById(R.id.btn_lan_8);
        Button btn_lan_9=(Button)findViewById(R.id.btn_lan_9);
        Button btn_lan_point=(Button)findViewById(R.id.btn_lan_point);
        Button btn_lan_ce=(Button)findViewById(R.id.btn_lan_clear);
        Button btn_lan_result=(Button)findViewById(R.id.btn_land_result);
        Button btn_lan_zhiliang=(Button)findViewById(R.id.btn_zhiliang);
        Button btn_lan_changdu=(Button)findViewById(R.id.btn_changdu);
        Button btn_lan_huilv=(Button)findViewById(R.id.btn_huilv);
        final TextView textView1=(TextView)findViewById(R.id.textView1);
        final TextView textView2=(TextView)findViewById(R.id.textView2);
        final TextView textView3=(TextView)findViewById(R.id.textView3);
        final TextView textView4=(TextView)findViewById(R.id.textView4);
        btn_lan_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"0");
            }
        });btn_lan_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"1");
            }
        });btn_lan_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"2");
            }
        });btn_lan_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"3");
            }
        });btn_lan_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"4");
            }
        });btn_lan_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"5");
            }
        });btn_lan_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"6");
            }
        });btn_lan_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"7");
            }
        });btn_lan_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"8");
            }
        });btn_lan_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"9");
           //     Changdu changdu=new Changdu();
           //     changdu.jisuan(textView1,textView2,textView3,textView4);
            }
        });btn_lan_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(point2==true)
                {
                    textView1.setText(textView1.getText()+".");
                    point2=false;
                }
            }
        });btn_lan_ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("");point2=true;
                textView2.setText("0");
                textView3.setText("0");
                textView4.setText("0");
            }
        });btn_lan_zhiliang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zhong=true;chang=false;hui=false;
            }
        });btn_lan_changdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zhong=false;chang=true;hui=false;
            }
        });btn_lan_huilv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zhong=false;chang=false;hui=true;
            }
        });//result结果判断相应的换算关系然后一次调用class，最后再把判断改变回去
        btn_lan_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chang==true)
                {
                    Changdu changdu1=new Changdu();
                    changdu1.jisuan(textView1,textView2,textView3,textView4);
                }
                else if(zhong==true)
                {
                    Zhiliang zhiliang1=new Zhiliang();
                    zhiliang1.jisuan(textView1,textView2,textView3,textView4);
                }
                else if(hui==true)
                {
                    Huilv huilv1=new Huilv();
                    huilv1.jisuan(textView1,textView2,textView3,textView4);
                }
                zhong=false;hui=false;chang=false;point2=true;
            }
        });



    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        //newConfig.orientation获得当前屏幕状态是横向或者竖向
        //Configuration.ORIENTATION_PORTRAIT 表示竖向
        //Configuration.ORIENTATION_LANDSCAPE 表示横屏
        if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(Activity.this, "现在是竖屏", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Activity.this,MainActivity.class);
            startActivity(intent);
        }
        if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
            Toast.makeText(Activity.this, "现在是横屏", Toast.LENGTH_SHORT).show();
        }
    }


}
