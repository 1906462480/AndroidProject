package com.example.androidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        initData();
        adapter();
    }

    private void adapter() {
        listView = findViewById(R.id.t_list);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                datas
        );
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String data = (String) parent.getItemAtPosition(position);
                if ("Android应用程序开发".equals(data)){
                    Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("class","Android一词的本义指“机器人”，同时也是Google于2007年11月5日宣布的基于Linux平台的开源移动终端操作系统的名称，该平台由操作系统、中间件、用户界面和应用软件组成，是首个为移动终端打造的真正开放和完整的移动软件。" );
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else if ("移动应用程序测试".equals(data)){
                    Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("class","移动应用程序测试");
                    intent.putExtras(bundle);
                    startActivity(intent);

                }else if ("高等数学".equals(data)){
                    Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("class","高等数学");
                    intent.putExtras(bundle);
                    startActivity(intent);

                }else if ("高职英语".equals(data)){
                    Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("class","高职英语");
                    intent.putExtras(bundle);
                    startActivity(intent);

                }else if ("Java程序设计语言".equals(data)){
                    Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("class","Java程序设计语言");
                    intent.putExtras(bundle);
                    startActivity(intent);

                }else if ("Android游戏开发".equals(data)){
                    Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("class","Android游戏开发");
                    intent.putExtras(bundle);
                    startActivity(intent);

                }else if ("心理健康".equals(data)){
                    Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("class","心理健康");
                    intent.putExtras(bundle);
                    startActivity(intent);

                }else if ("体育".equals(data)){
                    Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("class","体育");
                    intent.putExtras(bundle);
                    startActivity(intent);

                }
            }
        });
    }
    private List<String> datas;
    private void initData() {
        datas = new ArrayList<>();
        datas.add("Android应用程序开发");
        datas.add("移动应用程序测试");
        datas.add("高等数学");
        datas.add("高职英语");
        datas.add("Java程序设计语言");
        datas.add("Android游戏开发");
        datas.add("心理健康");
        datas.add("体育");

    }
}
