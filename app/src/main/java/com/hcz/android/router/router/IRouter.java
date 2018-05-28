package com.hcz.android.router.router;

import android.content.Context;

/**
 * Created by shawn on 2018/5/27.
 */

public interface IRouter {

    /**
     * 路由处理
     *
     * @param context
     * @param uri
     * @return
     */
    boolean route(Context context, String uri);

}
