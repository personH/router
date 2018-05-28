package com.hcz.android.router.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;
import com.hcz.android.router.CommonConstant;
import com.hcz.android.router.R;
import com.hcz.android.router.model.FourthAction;

/**
 * Created by shawn on 2018/5/27.
 */

public class FourthActivity extends AppCompatActivity {

    Gson gson=new Gson();
    private FourthAction mAction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fourth);

        TextView textView = findViewById(R.id.tv_content);
        textView.setText("fourth activty");

        Intent intent = getIntent();

        if (intent != null && intent.hasExtra(CommonConstant.INTENT_PARAMS)) {

            mAction= gson.fromJson(intent.getStringExtra(CommonConstant.INTENT_PARAMS), FourthAction.class);

        }
    }


}
