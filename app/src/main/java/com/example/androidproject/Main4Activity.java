package com.example.androidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    private TextView introduce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        introduce = findViewById(R.id.t_introduce);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String name = bundle.getString("class");
        introduce.setText(name);
    }
}
