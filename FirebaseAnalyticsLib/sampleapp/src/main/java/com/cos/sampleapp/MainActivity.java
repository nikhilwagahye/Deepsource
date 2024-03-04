package com.cos.sampleapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import com.cos.falib.bridge.FABridge;
import com.cos.sampleapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FABridge.logEvents(MainActivity.this, "MainActivity Sample App", "Screen Created ", "Yes");
    }
}