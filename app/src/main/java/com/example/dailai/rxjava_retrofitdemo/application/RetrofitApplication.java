package com.example.dailai.rxjava_retrofitdemo.application;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by dailai on 2017/7/20.
 */

public class RetrofitApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
