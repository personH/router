package com.hcz.android.router.router;

import android.content.Context;
import android.content.Intent;

import com.hcz.android.router.activity.SecondActivity;

/**
 * Created by shawn on 2018/5/27.
 */

public class RouteImpl implements IRouter {

    @Override
    public boolean route(Context context, String uri) {
        if (uri.equals(RouterConstant.SECOND_ACTIVITY)) {
            Intent intent = new Intent(context, SecondActivity.class);
            context.startActivity(intent);
        }
        return false;
    }
}
