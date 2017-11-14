package com.kun.baselib.base;

/**
 * Created by kun on 2017/3/11
 */
public abstract class BaseModule<T> {
    protected T view;
    public BaseModule(T view){
        this.view = view;
    }
}