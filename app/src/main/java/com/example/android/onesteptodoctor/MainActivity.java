package com.example.android.onesteptodoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void register(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,page2.class);
        startActivity(intent);
    }
    public void Q1(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,q1.class);
        startActivity(intent);
    }
}
