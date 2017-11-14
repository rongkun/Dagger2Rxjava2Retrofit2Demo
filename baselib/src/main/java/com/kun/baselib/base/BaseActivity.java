package com.kun.baselib.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.util.Log;

import com.kun.baselib.dagger.AppComponent;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.trello.rxlifecycle2.android.ActivityEvent;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by kun on 2017/4/10
 */

public abstract class BaseActivity extends RxAppCompatActivity implements BaseActivityView{

    protected Activity mActivity;
    protected Context mContext;
    protected String Tag = "Activity";

    protected abstract void daggerInit();
    protected abstract void viewInit();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(Tag, "CurrentActivity: " + getClass().getSimpleName());
        mContext = this;
        mActivity = this;
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        //绑定view
        ButterKnife.bind(this);
        daggerInit();
        viewInit();
    }

    /**
     * 延时退出
     */
    protected void finishDelay(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        }, 500);
    }

    @Override
    public LifecycleProvider<ActivityEvent> getLifecycleProvider() {
        return this;
    }

    /**
     * 页面跳转
     * @param activityClass 跳转的Activity
     */
    public void startActivity(Class activityClass) {
        Intent intent = new Intent(this, activityClass);
        mContext.startActivity(intent);
    }

    protected AppComponent getAppComponent(){
        return BaseApplication.getAppComponent();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    @Override
    public Context getContext() {
        return mContext;
    }
}
