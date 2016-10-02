package com.example.android.onesteptodoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class q1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
    }

    public void next1(View v){
        Intent intent = new Intent();
        intent.setClass(q1.this,q2.class);
        startActivity(intent);
    }
}
