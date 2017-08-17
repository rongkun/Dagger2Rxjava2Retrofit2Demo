package com.kun.dagger2rxjava2retrofit2demo.activities.main;

import com.kun.baselib.dagger.AppComponent;
import com.kun.baselib.dagger.PerActivity;
import com.kun.dagger2rxjava2retrofit2demo.base.AppBaseModule;

import dagger.Component;

/**
 * Created by kun on 2017/8/14
 */
@PerActivity
@Component(dependencies = AppComponent.class,modules = {AppBaseModule.class,MainModule.class})
interface MainComponent {
    void inject(MainActivity mainActivity);
}
