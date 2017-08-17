package com.kun.baselib.dagger;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kun on 2017/1/17
 * Explain:
 */
@Module
public class ActivityModule {
    private Activity activity;
    public ActivityModule(Activity activity){
        this.activity = activity;
    }
    @Provides
    @PerActivity
    Activity activity(){
        return activity;
    }
}
