package com.example.liyan.lian;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.liyan.fragment.Fragment1;
import com.example.liyan.fragment.Fragment2;

/**
 * autour: 李延
 * date: 2016/11/28 19:34
 * update: 2016/11/28
 * <p>
 * 主要是用来测试四种启动模式的生命周期
 */

public class MainActivity extends FragmentActivity {

    TextView te, t2, t3;
    Fragment1 fragment = new Fragment1();
    Fragment2 fragment2=new Fragment2();
    FragmentManager manager;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t2 = (TextView) findViewById(R.id.t2);
        te = (TextView) findViewById(R.id.te);
        manager = getSupportFragmentManager();
        Log.e("TAG",(new Fragment1().getStr()));
        transaction = manager.beginTransaction();
        transaction.add(R.id.fragment1, fragment, "tab1").commit();

        te.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment1, fragment, "tab2").commit();
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment1, fragment2, "tab2").commit();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putString("sb", "东东");
        fragment.setArguments(bundle);


        Log.i("TAG", "AonCreate called.");
//        te=(TextView)findViewById(R.id.te);
//        te.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
//                startActivity(intent);
//            }
//        });
//        t2=(TextView)findViewById(R.id.t2);
//        t2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(MainActivity.this,Main3Activity.class);
//                startActivity(intent);
//            }
//        });
//        t3=(TextView)findViewById(R.id.t3);
//        t3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(MainActivity.this,Main4Activity.class);
//                startActivity(intent);
//            }
//        });
    }


    //Activity创建或者从后台重新回到前台时被调用
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG", "AonStart called.");
    }

    //Activity从后台重新回到前台时被调用
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TAG", "AonRestart called.");
    }

    //Activity创建或者从被覆盖、后台重新回到前台时被调用
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG", "AonResume called.");
    }


    //Activity被覆盖到下面或者锁屏时被调用
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG", "AonPause called.");
        //有可能在执行完onPause或onStop后,系统资源紧张将Activity杀死,所以有必要在此保存持久数据
    }

    //退出当前Activity或者跳转到新Activity时被调用
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG", "AonStop called.");
    }

    //退出当前Activity时被调用,调用之后Activity就结束了
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG", "AonDestory called.");
    }

}

