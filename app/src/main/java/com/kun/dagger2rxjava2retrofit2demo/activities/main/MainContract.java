package com.kun.dagger2rxjava2retrofit2demo.activities.main;

import com.kun.baselib.base.BaseView;
import com.kun.dagger2rxjava2retrofit2demo.bean.WeatherResponse;

/**
 * Created by kun on 2017/8/14.
 */

public class MainContract {
    public interface View extends BaseView<MainPresenter> {
        void getWeatherSuccess(WeatherResponse response);
    }
    public interface Present{
        void getWeather(String city);
    }
}
