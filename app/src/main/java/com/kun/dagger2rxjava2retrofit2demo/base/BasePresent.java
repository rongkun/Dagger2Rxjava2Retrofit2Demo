package com.kun.dagger2rxjava2retrofit2demo.base;
import com.kun.baselib.base.BaseDataCache;
import com.kun.baselib.base.BaseView;
import com.kun.dagger2rxjava2retrofit2demo.net.AppNetApi;
import com.trello.rxlifecycle2.LifecycleProvider;

/**
 * Created by lirongkun on 16/10/18
 */
public class BasePresent<T extends BaseView,E> {
    protected T mView;
    protected LifecycleProvider<E> lifecycleProvider;
    protected AppNetApi mApi;
    protected BaseDataCache mDataCache;
    public BasePresent(T view, LifecycleProvider<E> lifecycleProvider, AppNetApi api, BaseDataCache mDataCache){
        this.mView = view;
        this.lifecycleProvider = lifecycleProvider;
        this.mApi = api;
        this.mDataCache = mDataCache;
    }
}
