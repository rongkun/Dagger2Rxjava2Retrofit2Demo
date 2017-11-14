package com.kun.baselib.base;

import android.content.Context;

import com.trello.rxlifecycle2.LifecycleProvider;
import com.trello.rxlifecycle2.android.FragmentEvent;

/**
 * Created by lirongkun on 2017/3/8
 */

public interface BaseFragmentView{
    Context getContext();
    LifecycleProvider<FragmentEvent> getLifecycleProvider();
}
