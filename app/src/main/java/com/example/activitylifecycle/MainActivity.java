package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity Lifecycle","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity Lifecycle","onStart");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("Activity Lifecycle","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity Lifecycle","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity Lifecycle","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity Lifecycle","onDestroy");
    }
}
