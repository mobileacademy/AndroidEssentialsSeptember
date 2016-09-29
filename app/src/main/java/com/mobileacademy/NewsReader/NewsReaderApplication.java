package com.mobileacademy.NewsReader;

import android.app.Application;
import android.util.Log;

import com.mobileacademy.NewsReader.data.CachedData;

/**
 * Created by Valerica Plesu on 4/23/2016.
 */
public class NewsReaderApplication extends Application {

    private static final String TAG = NewsReaderApplication.class.getSimpleName();
    private static NewsReaderApplication sInstance;

    public static NewsReaderApplication getInstance() {
        if(sInstance == null) {
            sInstance = new NewsReaderApplication();
        }

        return  sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate");


    }
}
