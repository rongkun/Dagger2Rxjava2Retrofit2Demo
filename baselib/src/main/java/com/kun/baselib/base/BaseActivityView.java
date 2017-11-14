package com.kun.baselib.base;


import android.content.Context;

import com.trello.rxlifecycle2.LifecycleProvider;
import com.trello.rxlifecycle2.android.ActivityEvent;

/**
 * Created by lirongkun on 2017/3/8
 */

public interface BaseActivityView{
    Context getContext();
    LifecycleProvider<ActivityEvent> getLifecycleProvider();
}
