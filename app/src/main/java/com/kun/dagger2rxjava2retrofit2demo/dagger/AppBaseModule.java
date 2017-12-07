package com.kun.dagger2rxjava2retrofit2demo.dagger;

import com.kun.baselib.dagger.PerActivity;
import com.kun.dagger2rxjava2retrofit2demo.net.AppNetApi;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class AppBaseModule {
    @PerActivity
    @Provides
    AppNetApi providesNetApi(Retrofit retrofit) {
        return retrofit.create(AppNetApi.class);
    }

}
