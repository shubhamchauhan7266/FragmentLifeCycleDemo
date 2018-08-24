package com.ownwork.fragmentlifecycledemo;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("Second", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
        fragmentTransaction1.replace(R.id.content_view, new FirstFragment(), "First");
        fragmentTransaction1.addToBackStack(null);
        fragmentTransaction1.commit();

        findViewById(R.id.bt_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                startActivity(new Intent(MainActivity.this, SecondActivity.class));
                FragmentTransaction fragmentTransaction2 = fragmentManager.beginTransaction();
                fragmentTransaction2.replace(R.id.content_view, new SecondFragment(), "Second");
                fragmentTransaction2.addToBackStack(null);
                fragmentTransaction2.commit();

            }
        });
    }

    @Override
    protected void onResume() {
        Log.e("Second", "onResume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.e("Second", "onStart");
        super.onStart();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override
    public void onPause() {
        Log.e("Second", "onPause");
        super.onPause();

    }

    @Override
    public void onStop() {
        Log.e("Second", "onStop");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.e("Second", "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.e("Second", "onRestart");

        super.onRestart();
    }
}
