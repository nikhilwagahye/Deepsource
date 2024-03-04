 package com.cos.fasampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cos.falib.bridge.FABridge;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FABridge.logEvents(MainActivity.this, "MainActivity", "Screen Created ", "Yes");
    }
}