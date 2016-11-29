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

public class Fragment1 extends android.support.v4.app.Fragment{

    private String str = "lll";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getActivity(), R.layout.fragment,null);
        Log.e("HJJ", "ArrayListFragment **** onCreateView...");
        Bundle bundle=getArguments();
        String str=bundle.getString("sb");
        Log.e("sb",str);

        return view;
    }
    @Override
    public void onAttach(Activity activity) {
        // TODO Auto-generated method stub
        Log.e("HJJ", "ArrayListFragment **** onAttach...");
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        Log.e("HJJ", "ArrayListFragment **** onCreate...");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        Log.e("HJJ", "ArrayListFragment **** onActivityCreated...");
    }

    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        Log.e("HJJ", "ArrayListFragment **** onStart...");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e("HJJ", "ArrayListFragment **** onResume...");
        // TODO Auto-generated method stub
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e("HJJ", "ArrayListFragment **** onPause...");
        // TODO Auto-generated method stub
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e("HJJ", "ArrayListFragment **** onStop...");
        // TODO Auto-generated method stub
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.e("HJJ", "ArrayListFragment **** onDestroyView...");
        // TODO Auto-generated method stub
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
    // TODO Auto-generated method stub
    Log.e("HJJ", "ArrayListFragment **** onDestroy...");
    super.onDestroy();
}

    @Override
    public void onDetach() {
        Log.e("HJJ", "ArrayListFragment **** onDetach...");
        // TODO Auto-generated method stub
        super.onDetach();
    }


}
