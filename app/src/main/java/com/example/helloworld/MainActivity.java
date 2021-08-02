package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButtion;   //    声明控件

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = findViewById(R.id.btn_textview);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 跳转到TextView演示界面
                Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
                startActivity(intent);

            }
        });

        mBtnButtion = findViewById(R.id.btn_button);  // 找到控件
        mBtnButtion.setOnClickListener(new View.OnClickListener() {  //  设置点击事件
            @Override
            public void onClick(View v) {
                // 跳转到Button演示界面
                Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
                startActivity(intent);
            }
        });


    }
}