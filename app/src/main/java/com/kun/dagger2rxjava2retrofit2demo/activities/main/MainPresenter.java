package com.kun.dagger2rxjava2retrofit2demo.activities.main;

import com.kun.baselib.base.BaseDataCache;
import com.kun.baselib.base.BaseResponse;
import com.kun.baselib.net.RxSubscriber;
import com.kun.baselib.utils.RxHelper;
import com.kun.dagger2rxjava2retrofit2demo.base.BasePresent;
import com.kun.dagger2rxjava2retrofit2demo.bean.WeatherResponse;
import com.kun.dagger2rxjava2retrofit2demo.net.AppNetApi;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.trello.rxlifecycle2.android.ActivityEvent;
import javax.inject.Inject;

/**
 * @author kun
 * @date 2017/10/24
 */

public class MainPresenter extends BasePresent<MainContract.View,ActivityEvent> implements MainContract.Present{
    @Inject
    public MainPresenter(MainContract.View view, LifecycleProvider<ActivityEvent> lifecycleProvider, AppNetApi api, BaseDataCache mDataCache) {
        super(view, lifecycleProvider, api, mDataCache);
    }
    @Inject
    void setPresenter(){
        mView.setPresenter(this);
    }
    @Override
    public void getWeather(String city) {
        mApi.getWeather(city)
                .compose(lifecycleProvider.<BaseResponse<WeatherResponse>>bindToLifecycle())
                .compose(RxHelper.<BaseResponse<WeatherResponse>>io_main())
                .subscribe(new RxSubscriber<BaseResponse<WeatherResponse>>() {
                    @Override
                    public void onSuccess(BaseResponse<WeatherResponse> weatherResponseBaseResponse) {
                        mView.getWeatherSuccess(weatherResponseBaseResponse.getData());
                    }
                });
    }
}
