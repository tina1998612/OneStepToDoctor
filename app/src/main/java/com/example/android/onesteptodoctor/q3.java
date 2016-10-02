package com.example.android.onesteptodoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class q3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);
    }

    public void next3(View v){
        Intent intent = new Intent();
        intent.setClass(q3.this,q4.class);
        startActivity(intent);
    }
}
