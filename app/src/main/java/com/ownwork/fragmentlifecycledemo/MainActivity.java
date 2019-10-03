package com.ownwork.fragmentlifecycledemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("Activity", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final FragmentManager fragmentManager = getFragmentManager();

        android.app.FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
        fragmentTransaction1.add(R.id.content_view, new FirstFragment(), "First");
//        fragmentTransaction1.addToBackStack(null);
        fragmentTransaction1.commit();

        findViewById(R.id.bt_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                startActivity(new Intent(MainActivity.this, SecondActivity.class));
                FragmentTransaction fragmentTransaction2 = fragmentManager.beginTransaction();
                fragmentTransaction2.add(R.id.content_view, new SecondFragment(), "Second");
//                fragmentTransaction2.addToBackStack(null);
                fragmentTransaction2.commit();

            }
        });
    }

    @Override
    protected void onResume() {
        Log.e("Activity", "onResume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.e("Activity", "onStart");
        super.onStart();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override
    public void onPause() {
        Log.e("Activity", "onPause");
        super.onPause();

    }

    @Override
    public void onStop() {
        Log.e("Activity", "onStop");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.e("Activity", "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.e("Activity", "onRestart");

        super.onRestart();
    }
}
