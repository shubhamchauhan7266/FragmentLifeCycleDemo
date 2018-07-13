package com.ownwork.fragmentlifecycledemo;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SecondFragment extends Fragment {


    private FragmentActivity mContext;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("Second", "onAttach");
        mContext = (FragmentActivity)context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Second", "onCreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("Second", "onActivityCreated");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e("Second", "onCreateView");
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        view.findViewById(R.id.bt_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final FragmentManager fragmentManager = mContext.getSupportFragmentManager();

                FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
                fragmentTransaction1.replace(R.id.content_view, new ThirdFragment(), "Third");
                fragmentTransaction1.addToBackStack("Third");
                fragmentTransaction1.commit();
            }
        });
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("Second", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Second", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Second", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("Second", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("Second", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Second", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("Second", "onDetach");
    }
}
