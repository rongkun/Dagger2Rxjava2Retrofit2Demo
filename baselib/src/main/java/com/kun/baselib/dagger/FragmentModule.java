package com.kun.baselib.dagger;


import android.support.v4.app.Fragment;
import dagger.Module;
import dagger.Provides;

/**
 * Created by kun on 2017/1/17
 * Explain:
 */
@Module
public class FragmentModule {
    private Fragment fragment;
    public FragmentModule(Fragment fragment){
        this.fragment = fragment;
    }
    @Provides
    @PerActivity
    Fragment fragment(){
        return fragment;
    }
}
