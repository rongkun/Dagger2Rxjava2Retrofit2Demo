package com.kun.dagger2rxjava2retrofit2demo.activities.main;

import com.kun.baselib.base.BaseModule;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kun on 2017/8/14
 */
@Module
class MainModule extends BaseModule<MainContract.View> {
    MainModule(MainContract.View view) {
        super(view);
    }
    @Provides
    MainContract.View providesView() {
        return view;
    }

    @Provides
    MainContract.Present mainPresent(MainPresenter presenter){
        return presenter;
    }
}
