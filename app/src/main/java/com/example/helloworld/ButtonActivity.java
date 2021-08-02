package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private Button mBtn3;  // 声明button3
    private TextView mTv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mBtn3 = findViewById(R.id.btn_3);
        mBtn3.setOnClickListener(new View.OnClickListener() {  // 给button3设置点击事件
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonActivity.this,"btn3被点击了",Toast.LENGTH_SHORT).show(); // 在界面上弹出提示信息

            }
        });

        mTv1 = findViewById(R.id.tv_1);
        mTv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonActivity.this,"tv1被点击了",Toast.LENGTH_SHORT).show(); // 在界面上弹出提示信息
            }
        });
    }

    public void showToast(View view){  //  定义showToast方法
        Toast.makeText(this,"bnt4被点击了",Toast.LENGTH_SHORT).show(); // 在界面上弹出提示信息
    }
}