package com.example.inspiwriter;

import android.app.Application;
import android.content.Context;

/**
 * Created by hcao on 11/4/2017.
 */

public class InspiWriter extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}