package com.kun.dagger2rxjava2retrofit2demo.activities.main;

import com.kun.baselib.base.BaseModule;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.trello.rxlifecycle2.android.ActivityEvent;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kun on 2017/8/14.
 */
@Module
class MainModule extends BaseModule<MainContract.View,ActivityEvent> {
    MainModule(MainContract.View view, LifecycleProvider<ActivityEvent> lifecycleProvider) {
        super(view, lifecycleProvider);
    }
    @Provides
    MainContract.View providesView() {
        return view;
    }
    @Provides
    LifecycleProvider<ActivityEvent> providerLifecycleProvider(){
        return lifecycleProvider;
    }
}
