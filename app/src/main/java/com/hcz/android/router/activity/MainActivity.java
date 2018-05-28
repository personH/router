package com.hcz.android.router.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hcz.android.router.R;
import com.hcz.android.router.router.RouteImpl;
import com.hcz.android.router.router.RouterConfigImpl;
import com.hcz.android.router.router.RouterConstant;
import com.hcz.android.router.router.RouterGo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RouterGo.getInstance().register(new RouteImpl());
        RouterGo.getInstance().register(new RouterConfigImpl());

        findViewById(R.id.tv_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RouterGo.getInstance().go(MainActivity.this, RouterConstant.SECOND_ACTIVITY);
            }
        });

        findViewById(R.id.tv_third).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RouterGo.getInstance().go(MainActivity.this, RouterConstant.THIRD_ACTIVITY);
            }
        });

        findViewById(R.id.tv_forth).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RouterGo.getInstance().go(MainActivity.this, RouterConstant.THIRD_ACTIVITY);
            }
        });
    }
}
