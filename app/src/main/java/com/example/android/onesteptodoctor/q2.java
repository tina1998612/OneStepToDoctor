package com.example.android.onesteptodoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class q2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
    }
    public void next2(View v){
        Intent intent = new Intent();
        intent.setClass(q2.this,q3.class);
        startActivity(intent);
    }
}
