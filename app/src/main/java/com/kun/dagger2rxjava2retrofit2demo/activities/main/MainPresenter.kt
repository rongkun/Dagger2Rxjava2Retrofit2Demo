package com.kun.dagger2rxjava2retrofit2demo.activities.main

import com.kun.baselib.base.BaseDataCache
import com.kun.baselib.base.BaseResponse
import com.kun.baselib.net.RxSubscriber
import com.kun.baselib.utils.RxHelper
import com.kun.dagger2rxjava2retrofit2demo.base.BasePresent
import com.kun.dagger2rxjava2retrofit2demo.bean.WeatherResponse
import com.kun.dagger2rxjava2retrofit2demo.net.AppNetApi
import com.trello.rxlifecycle2.LifecycleProvider
import com.trello.rxlifecycle2.android.ActivityEvent

import javax.inject.Inject

/**
 * Created by kun on 2017/8/14.
 */

class MainPresenter @Inject
internal constructor(view: MainContract.View, lifecycleProvider: LifecycleProvider<ActivityEvent>, api: AppNetApi, mDataCache: BaseDataCache) : BasePresent<MainContract.View, ActivityEvent>(view, lifecycleProvider, api, mDataCache), MainContract.Present {
    @Inject
    internal fun setupListener() {
        mView.setPresenter(this)
    }

    override fun getWeather(city: String) {
        mApi.getWeather(city).compose(lifecycleProvider.bindToLifecycle())
                .compose(RxHelper.io_main())
                .subscribe(object : RxSubscriber<BaseResponse<WeatherResponse>>() {
                    override fun onSuccess(weatherResponseBaseResponse: BaseResponse<WeatherResponse>) {
                        mView.getWeatherSuccess(weatherResponseBaseResponse.data)
                    }
                })
    }
}
