package com.example.administrator.calculator;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity{
    double num[]=new double[5];
    char ch[]=new char[5];
    int stringbegin=0;
    int chengchu=0;
    int stringend=0;
    int numendlong=0;int charenlong=0;
    int number=0;int charch=0;
    boolean jia=true;
    boolean jian=true;
    boolean cheng=true;
    boolean chu=true;
    boolean point=true;

    boolean sin=false;
    boolean cos=false;
    boolean tan=false;
    boolean kaifang=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /**
         * 对每个按钮进行对应操作
         */
        final EditText editText=(EditText)findViewById(R.id.editText_input);

        Button btn_0=(Button)findViewById(R.id.btn_0);
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString()+"0");
                jia=true;jian=true;cheng=true;chu=true;
            }
        });

        Button btn_1=(Button)findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString()+"1");
                jia=true;jian=true;cheng=true;chu=true;
            }
        });
        Button btn_2=(Button)findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString()+"2");
                jia=true;jian=true;cheng=true;chu=true;
            }
        });
        Button btn_3=(Button)findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString()+"3");
                jia=true;jian=true;cheng=true;chu=true;
            }
        });
        Button btn_4=(Button)findViewById(R.id.btn_4);
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString()+"4");
                jia=true;jian=true;cheng=true;chu=true;
            }
        });
        Button btn_5=(Button)findViewById(R.id.btn_5);
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString()+"5");
                jia=true;jian=true;cheng=true;chu=true;
            }
        });
        Button btn_6=(Button)findViewById(R.id.btn_6);
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString()+"6");
                jia=true;jian=true;cheng=true;chu=true;
            }
        });
        Button btn_7=(Button)findViewById(R.id.btn_7);
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString()+"7");
                jia=true;jian=true;cheng=true;chu=true;
            }
        });
        Button btn_8=(Button)findViewById(R.id.btn_8);
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString()+"8");
                jia=true;jian=true;cheng=true;chu=true;
            }
        });
        Button btn_9=(Button)findViewById(R.id.btn_9);
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString()+"9");
                jia=true;jian=true;cheng=true;chu=true;
            }
        });

        Button btn_point=(Button)findViewById(R.id.btn_point);
        btn_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(point==true)
                {
                    editText.setText(editText.getText().toString()+".");
                    point=false;
                    jia=true;jian=true;cheng=true;chu=true;
                }
                else
                {
                    Toast.makeText(MainActivity.this,"只能同时写入一个.",Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button btn_jia=(Button)findViewById(R.id.btn_jia);
        btn_jia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jia==true)
                {
                    point=true;
                    stringend=editText.getText().length();
                    String string=editText.getText().toString();
                    string=string.substring(stringbegin,stringend);
                    Double aDouble=Double.parseDouble(string);
                    num[number]=aDouble;
                    editText.setText(editText.getText().toString()+"+");
                    ch[charch]='+';
                    charch++;number++;
                    stringbegin=editText.getText().length();
                    jia=false;
                }
            }
        });
        Button btn_jian=(Button)findViewById(R.id.btn_jian);
        btn_jian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jian==true)
                {
                    point=true;
                    stringend=editText.getText().length();
                    String string=editText.getText().toString();

                    string=string.substring(stringbegin,stringend);
                    num[number]=Double.parseDouble(string);
                    editText.setText(editText.getText().toString()+"-");
                    ch[charch]='-';
                    charch++;number++;
                    stringbegin=editText.getText().length();
                    jian=false;
                    numendlong++;charenlong++;
                }
            }
        });
        Button btn_cheng=(Button)findViewById(R.id.btn_cheng);
        btn_cheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cheng==true)
                {
                    point=true;
                    stringend=editText.getText().length();
                    String string=editText.getText().toString();
                    string=string.substring(stringbegin,stringend);
                    num[number]=Double.parseDouble(string);
                    editText.setText(editText.getText().toString()+"*");
                    ch[charch]='*';
                    charch++;number++;
                    stringbegin=editText.getText().length();
                    cheng=false;
                    chengchu++;
                    numendlong++;charenlong++;
                }
            }
        });
        Button btn_chu=(Button)findViewById(R.id.btn_chu);
        btn_chu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jian==chu)
                {
                    point=true;
                    stringend=editText.getText().length();
                    String string=editText.getText().toString();
                    string=string.substring(stringbegin,stringend);
                    num[number]=Double.parseDouble(string);
                    editText.setText(editText.getText().toString()+"/");
                    ch[charch]='/';
                    charch++;number++;
                    chengchu++;
                    stringbegin=editText.getText().length();
                    chu=false;
                    numendlong++;charenlong++;
                }
            }
        });
   //     TextView textView=(TextView)findViewById(R.id.textView1);
   //     Huilv huilv=new Huilv();
    //    huilv.canshu(textView);
        Button btn_clear=(Button)findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");point=true;
            }
        });
        Button btn_delete=(Button)findViewById(R.id.btn_delete);//有问题
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString().substring(0,editText.getText().length()-1));
            }
        });

        Button btn_result=(Button)findViewById(R.id.btn_result);
        btn_result.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(sin==true||cos==true||tan==true||kaifang==true)
                 {
                if(sin==true)
                {
                    point=true;
                    String string=editText.getText().toString().substring(3,editText.getText().length());
                    Sinclass sinclass=new Sinclass();
                    double stringdouble=sinclass.sinhanshu(Double.parseDouble(string));
                    editText.setText(Double.toString(stringdouble));
                    sin=false;
                }
                else if(cos==true)
                {point=true;
                    Cosclass cosclass=new Cosclass();
                    String string=editText.getText().toString().substring(3,editText.length());
                    double stringdouble=cosclass.coshanshu(Double.parseDouble(string));
                    editText.setText(Double.toString(stringdouble));
                    cos=false;
                }
                else if(tan==true)
                {point=true;
                    Tanclass tanclass=new Tanclass();
                    String string=editText.getText().toString().substring(2,editText.length());
                    double stringdouble=tanclass.tanhanshu(Double.parseDouble(string));
                    editText.setText(Double.toString(stringdouble));
                    tan=false;
                }
                else if(kaifang==true)
                {point=true;
                    Kaifangclass kaifangclass=new Kaifangclass();
                    String string=editText.getText().toString().substring(2,editText.length());
                    double stringdouble=kaifangclass.kaifanghanshu(Double.parseDouble(string));
                    editText.setText(Double.toString(stringdouble));
                    kaifang=false;
                }
            }
                else
                {point=true;
                stringend=editText.getText().length();
                String string=editText.getText().toString();
                string=string.substring(stringbegin,stringend);
                num[number]=Double.parseDouble(string);
                Resultclass resultclass=new Resultclass();
                resultclass.Result(num,ch,number,chengchu);
                editText.setText(String.valueOf(num[0]));
                jia=true;jian=true;cheng=true;chu=true;
                stringbegin=0;
                chengchu=0;
                number=0;charch=0;numendlong=0;}

            }
        });

        Button btn_sin=(Button)findViewById(R.id.btn_sin);
        btn_sin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText("sin");
                Toast.makeText(MainActivity.this,"注意这里使用的是弧度",Toast.LENGTH_SHORT).show();
                sin=true;cos=false;tan=false;kaifang=false;
            }
        });
        Button btn_cos=(Button)findViewById(R.id.btn_cos);
        btn_cos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText("cos");
                Toast.makeText(MainActivity.this,"注意这里使用的是弧度",Toast.LENGTH_SHORT).show();
                sin=false;cos=true;tan=false;kaifang=false;
            }
        });
        Button btn_tan=(Button)findViewById(R.id.btn_tan);
        btn_tan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText("tan");
                Toast.makeText(MainActivity.this,"注意这里使用的是弧度",Toast.LENGTH_SHORT).show();
                sin=false;cos=false;tan=true;kaifang=false;
            }
        });
        Button btn_kaifang=(Button)findViewById(R.id.btn_kaifang);
        btn_kaifang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText("/~");
                sin=false;cos=false;tan=false;kaifang=true;
            }
        });
        Button button=(Button)findViewById(R.id.btn_kaifang);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });







        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override//横屏竖屏处理问题
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {

            Intent intent = new Intent(MainActivity.this, Activity.class);
            startActivity(intent);
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();

        }
        else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
 /*   @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        //newConfig.orientation获得当前屏幕状态是横向或者竖向
        //Configuration.ORIENTATION_PORTRAIT 表示竖向
        //Configuration.ORIENTATION_LANDSCAPE 表示横屏
        if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(MainActivity.this, "现在是竖屏", Toast.LENGTH_SHORT).show();
        }
        if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
            Toast.makeText(MainActivity.this, "现在是横屏", Toast.LENGTH_SHORT).show();
        }
    }*/
}
