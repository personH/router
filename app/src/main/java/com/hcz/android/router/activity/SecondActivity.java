package com.hcz.android.router.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.hcz.android.router.R;

/**
 * Created by shawn on 2018/5/27.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.tv_content);
        textView.setText("second activty");
    }
}
