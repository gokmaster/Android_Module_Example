package com.paigger.moduleexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mywebsite.exampleapp.AddActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Intent addIntent = new Intent((this), AddActivity.class);
        startActivity(addIntent);
    }
}
