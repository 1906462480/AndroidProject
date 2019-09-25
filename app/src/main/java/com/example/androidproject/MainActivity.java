package com.example.androidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etUsername;
    private EditText etPassword;
    private Button etLogin;
    private Button etExit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        etUsername = findViewById(R.id.username);
        etPassword = findViewById(R.id.password);
        etLogin = findViewById(R.id.login);
        etExit = findViewById(R.id.exit);
        etLogin.setOnClickListener(this);
        etExit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.login:
                login();
                break;
            case R.id.exit:
                finish();
                break;


        }

    }

    private void login() {
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();
        if (username.equals("")&&password.equals("")){
            Toast.makeText(MainActivity.this,"请输入用户名和密码",Toast.LENGTH_LONG).show();
            etUsername.setText("");
            etPassword.setText("");

        }
        else {
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","欢迎"+username+"来到您的空间");
            startActivity(intent);
        }
    }
}
