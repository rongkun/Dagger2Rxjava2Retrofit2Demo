package com.kun.dagger2rxjava2retrofit2demo.activities.main;

import com.kun.baselib.base.BasePresenter;
import com.kun.baselib.base.BaseResponse;
import com.kun.baselib.net.HttpSubscriber;
import com.kun.baselib.utils.RxHelper;
import com.kun.dagger2rxjava2retrofit2demo.bean.WeatherResponse;
import com.kun.dagger2rxjava2retrofit2demo.net.AppNetApi;

import javax.inject.Inject;

/**
 * @author kun
 * @date 2017/10/24
 */

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Present{
    @Inject
    MainPresenter() {
    }
    @Inject
    AppNetApi mApi;
    @Override
    public void getWeather(String city) {
        mApi.getWeather(city)
                .compose(mView.getLifecycleProvider().<BaseResponse<WeatherResponse>>bindToLifecycle())
                .compose(RxHelper.<BaseResponse<WeatherResponse>>io_main())
                .subscribe(new HttpSubscriber<BaseResponse<WeatherResponse>>() {
                    @Override
                    public void onSuccess(BaseResponse<WeatherResponse> weatherResponseBaseResponse) {
                        if (mView != null) {
                            mView.getWeatherSuccess(weatherResponseBaseResponse.getData());
                        }
                    }
                });
    }
}
