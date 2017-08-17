package com.kun.baselib.dagger;

import android.app.Activity;

import dagger.Component;

/**
 * Created by kun on 2017/1/17
 * Explain:
 */
@PerActivity
@Component(dependencies = AppComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {
    Activity activity();
}
