package com.example.jason.svndemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * 1.0版本稳定版--上线
 */
public class MainActivity extends AppCompatActivity {

    private String TAG = "Jason";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG,"刚开始开发");
        Log.e(TAG,"1.0版本之前的一系列开发");
        Log.e(TAG,"1.0稳定版");
        Log.e(TAG,"1.0稳定版本下来后立即开发2.0版本");
        Log.e(TAG,"2.1版本");
    }
}
