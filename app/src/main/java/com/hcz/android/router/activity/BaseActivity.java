package com.hcz.android.router.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;
import com.hcz.android.router.CommonConstant;

/**
 * Created by shawn on 2018/5/28.
 */

public class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    protected <T> T getParamObject(Class<T> tClass) {

        if (getIntent() != null && getIntent().hasExtra(CommonConstant.INTENT_PARAMS)) {
            Gson gson = new Gson();
            try {
                return gson.fromJson(getIntent().getStringExtra(CommonConstant.INTENT_PARAMS), tClass);
            } catch (RuntimeException e) {
                return null;
            }
        }
        return null;
    }
}
