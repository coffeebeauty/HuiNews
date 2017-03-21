package com.example.h_kang.huinews;

import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.h_kang.huinews.Util.AndroidBasicUtil;

public class MainActivity extends FragmentActivity implements View.OnClickListener{
    String TAG = "YokiMainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        Button newsButton = (Button) findViewById(R.id.btn_news);
        newsButton.setOnClickListener(this);
        Log.d(TAG, "onCreate: " + getClass().getSimpleName());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: " + getClass().getSimpleName());
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: " + getClass().getSimpleName());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: " + getClass().getSimpleName());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: " + getClass().getSimpleName());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: " + getClass().getSimpleName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: " + getClass().getSimpleName());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_news:
                Intent i = new Intent(this, NewsActivity.class);
                startActivity(i);
                break;
        }
    }
}
