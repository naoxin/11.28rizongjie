package com.example.liyan.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.liyan.lian.R;

/**
 * 1.作用
 * 2.作者：李延
 * 3.时间：2016、11、24
 */

public class Fragment2 extends android.support.v4.app.Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getActivity(), R.layout.fragment22,null);
        Log.i("TAG",(new Fragment1().getStr()));
        Log.e("HJJ", "ArrayListFragment **** on2Attach...");
        return view;
    }
    @Override
    public void onAttach(Activity activity) {
        // TODO Auto-generated method stub
        Log.e("HJJ", "ArrayListFragment **** on2Attach...");
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        Log.e("HJJ", "ArrayListFragment **** on2Create...");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        Log.e("HJJ", "ArrayListFragment **** on2ActivityCreated...");
    }

    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        Log.e("HJJ", "ArrayListFragment **** on2Start...");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e("HJJ", "ArrayListFragment **** on2Resume...");
        // TODO Auto-generated method stub
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e("HJJ", "ArrayListFragment **** on2Pause...");
        // TODO Auto-generated method stub
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e("HJJ", "ArrayListFragment **** on2Stop...");
        // TODO Auto-generated method stub
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.e("HJJ", "ArrayListFragment **** on2DestroyView...");
        // TODO Auto-generated method stub
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        Log.e("HJJ", "ArrayListFragment **** on2Destroy...");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.e("HJJ", "ArrayListFragment **** on2etach...");
        // TODO Auto-generated method stub
        super.onDetach();
    }
}
