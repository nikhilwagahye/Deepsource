package com.cos.fasampleapp;

import android.app.Application;

import com.cos.falib.bridge.FABridge;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FABridge.initLib(this);
    }
}
