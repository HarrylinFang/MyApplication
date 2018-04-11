package com.howjia.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("用户您好，竭诚为您服务！");
    }
    //这里加上一行注释，也作为是一个修改



    @Override
    protected void onResume() {
        super.onResume();
    }

    //我这里再加上一行注释，测试多次stash

}
