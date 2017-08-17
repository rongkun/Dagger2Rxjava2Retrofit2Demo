package com.kun.dagger2rxjava2retrofit2demo.base;

import com.kun.baselib.base.BaseDataCache;
import com.kun.baselib.dagger.PerActivity;
import com.kun.baselib.utils.RxHelper;
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
    @PerActivity
    @Provides
    RxHelper provideRxUtils(){
        return new RxHelper();
    }


    @PerActivity
    @Provides
    BaseDataCache provideDataCache(){return BaseDataCache.getInstance();}
}
