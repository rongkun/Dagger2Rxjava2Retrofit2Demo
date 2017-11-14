package com.kun.dagger2rxjava2retrofit2demo.base;
import android.support.annotation.Nullable;

import com.kun.baselib.base.BaseDataCache;
import com.kun.baselib.base.BaseActivityView;
import com.kun.baselib.base.BasePresent;
import com.kun.dagger2rxjava2retrofit2demo.net.AppNetApi;
import com.trello.rxlifecycle2.LifecycleProvider;

/**
 * Created by lirongkun on 16/10/18
 */
public class AppBasePresent<T extends BaseActivityView> implements BasePresent{
    @Nullable
    protected T mView;
    protected AppNetApi mApi;
    protected BaseDataCache mDataCache;
    public AppBasePresent(T view, AppNetApi api, BaseDataCache mDataCache){
        this.mView = view;
        this.mApi = api;
        this.mDataCache = mDataCache;
    }
    @Override
    public void destroyView(){
        mView = null;
    }
}
