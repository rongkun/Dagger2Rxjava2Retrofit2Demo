package com.kun.dagger2rxjava2retrofit2demo.dagger;

import com.kun.baselib.dagger.AppComponent;
import com.kun.baselib.dagger.PerActivity;
import com.kun.dagger2rxjava2retrofit2demo.activities.main.MainActivity;

import dagger.Component;

/**
 * @author 坤
 * @date 2017/12/7
 */

@PerActivity
@Component(dependencies = AppComponent.class,modules = {AppBaseModule.class})
public interface AppBaseComponent {
    void inject(MainActivity mainActivity);
}
