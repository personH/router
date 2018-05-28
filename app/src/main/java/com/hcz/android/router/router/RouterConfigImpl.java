package com.hcz.android.router.router;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

import com.hcz.android.router.CommonConstant;
import com.hcz.android.router.activity.FourthActivity;
import com.hcz.android.router.activity.ThirdActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shawn on 2018/5/27.
 */
public class RouterConfigImpl implements IRouter {

    private List<RouterConfig> sRouterConfigs;

    public RouterConfigImpl() {
        sRouterConfigs = new ArrayList<>();

        RouterConfig config = new RouterConfig();
        config.uri = RouterConstant.THIRD_ACTIVITY;
        config.className = ThirdActivity.class.getName();
        config.h5Url = "";

        RouterConfig config1 = new RouterConfig();
        config1.uri = RouterConstant.FOURTH_ACTIVITY;
        config1.className = FourthActivity.class.getName();
        config1.h5Url = "https://www.baidu.com";

        sRouterConfigs.add(config);
        sRouterConfigs.add(config1);
    }

    @Override
    public boolean route(Context context, String uri) {

        if (sRouterConfigs == null || sRouterConfigs.isEmpty() || TextUtils.isEmpty(uri)) {
            return false;
        }

        Uri jumpUri = Uri.parse(uri);

        String jsonStr = jumpUri.getQueryParameter("params");

        for (RouterConfig config : sRouterConfigs) {

            if (config == null) {
                continue;
            }

            if (config.uri.equals(uri)) {
                Intent intent = new Intent();
                intent.setClassName(context, config.className);
                if (!TextUtils.isEmpty(jsonStr)) {
                    intent.putExtra(CommonConstant.INTENT_PARAMS, jsonStr);
                }
                context.startActivity(intent);
                return true;
            }
        }

        return false;
    }

    public void setsRouterConfigs(List<RouterConfig> sRouterConfigs) {
        this.sRouterConfigs = sRouterConfigs;
    }

    public List<RouterConfig> getsRouterConfigs() {
        return sRouterConfigs;
    }
}
