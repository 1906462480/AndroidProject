package com.example.androidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private ImageView etCourse, etTool;
    private TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        welcome = findViewById(R.id.t_welcome);
        welcome.setText(intent.getStringExtra("name"));

        initView();
    }

    private void initView() {
        etCourse = findViewById(R.id.course);
        etTool = findViewById(R.id.tool);

        etCourse.setOnClickListener(this);
        etTool.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.course:
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);
                break;
            case R.id.tool:
                finish();
                break;
        }
    }
}
