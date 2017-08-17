package com.kun.baselib.base;

import com.trello.rxlifecycle2.LifecycleProvider;

/**
 * Created by kun on 2017/3/11
 */
public abstract class BaseModule<T,E> {
    protected T view;
    protected LifecycleProvider<E> lifecycleProvider;
    public BaseModule(T view, LifecycleProvider<E> lifecycleProvider){
        this.view = view;
        this.lifecycleProvider = lifecycleProvider;
    }
}