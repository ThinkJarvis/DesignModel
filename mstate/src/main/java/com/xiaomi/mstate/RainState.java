package com.xiaomi.mstate;

import android.util.Log;

/**
 * Created by admin on 2018/2/12.
 */

public class RainState extends State{
    @Override
    public void handle() {
        Log.e("wjq","雨天收衣服");
    }
}
