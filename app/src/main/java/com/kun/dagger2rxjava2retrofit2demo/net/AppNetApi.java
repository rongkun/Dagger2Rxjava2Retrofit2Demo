package com.kun.dagger2rxjava2retrofit2demo.net;

import com.kun.baselib.base.BaseResponse;
import com.kun.dagger2rxjava2retrofit2demo.bean.WeatherResponse;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by kun on 2017/8/14.
 */

public interface AppNetApi {
    @GET("open/api/weather/json.shtml?")
    Flowable<BaseResponse<WeatherResponse>> getWeather(@Query("city") String city);
}
