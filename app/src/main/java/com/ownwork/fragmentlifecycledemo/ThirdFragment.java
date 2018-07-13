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



public class ThirdFragment extends Fragment {


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("Third", "onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Third", "onCreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("Third", "onActivityCreated");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e("Third", "onCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("Third", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Third", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Third", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("Third", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("Third", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Third", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("Third", "onDetach");
    }

}
