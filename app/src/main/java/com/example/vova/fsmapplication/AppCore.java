package com.example.vova.fsmapplication;

import android.app.Application;
import android.content.Context;

/**
 * Created by vova on 04.06.17.
 */

public class AppCore extends Application {
    public static final String TAG = AppCore.class.getSimpleName();

    private static Context sContext = null;

    @Override
    public void onCreate() {
        super.onCreate();

        AppCore.sContext = getApplicationContext();
    }

    /**
     * Return instance of AppCore.
     */
    public static AppCore getInstance() {
        return (AppCore) AppCore.sContext;
    }
}
