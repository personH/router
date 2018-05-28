package com.hcz.android.router.router;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shawn on 2018/5/27.
 */

public class RouterGo {
    private static RouterGo sInstance;
    private List<IRouter> sRouterList = new ArrayList<>();

    private RouterGo() {
    }

    public static RouterGo getInstance() {
        if (sInstance == null) {
            sInstance = new RouterGo();
        }
        return sInstance;
    }

    public void register(IRouter router) {
        if (router == null || sRouterList.contains(router)) {
            return;
        }
        sRouterList.add(router);
    }

    public void go(Context context, String url) {
        for (IRouter router : sRouterList) {
            if (router == null) {
                continue;
            }

            if (router.route(context, url)) {
                return;
            }
        }

    }

}
