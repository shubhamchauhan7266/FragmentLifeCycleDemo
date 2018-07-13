package com.ownwork.fragmentlifecycledemo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FirstFragment extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("First", "onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("First", "onCreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("First", "onActivityCreated");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e("First", "onCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("First", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("First", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("First", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("First", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("First", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("First", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("First", "onDetach");
    }
}
