package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity {

    private Button mBtnLogin;
    private EditText mEtUserName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        mBtnLogin = findViewById(R.id.btn_login);
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast登陆成功
                Toast.makeText(EditTextActivity.this, "登陆成功！", Toast.LENGTH_SHORT).show();
            }
        });

        mEtUserName = findViewById(R.id.et_1);
        mEtUserName.addTextChangedListener(new TextWatcher() {  // 添加监听事件
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {
                // 文字改变前


            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                // 文字改变中
                Log.d("edittext", s.toString());  // 实现CharSequence的一个接口

            }

            @Override
            public void afterTextChanged(Editable s) {
                // 文字改变后

            }
        });
    }
}