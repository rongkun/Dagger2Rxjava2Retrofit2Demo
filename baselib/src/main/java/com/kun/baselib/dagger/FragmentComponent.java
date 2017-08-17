package com.kun.baselib.dagger;


import android.support.v4.app.Fragment;

import dagger.Component;

/**
 * Created by kun on 2017/1/17
 * Explain:
 */
@PerActivity
@Component(dependencies = AppComponent.class,modules = FragmentModule.class)
public interface FragmentComponent {
    Fragment fragment();
}
