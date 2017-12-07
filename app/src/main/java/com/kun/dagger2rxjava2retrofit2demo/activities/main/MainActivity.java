package com.kun.dagger2rxjava2retrofit2demo.activities.main;

import android.os.Bundle;

import com.kun.baselib.base.BaseActivity;
import com.kun.baselib.base.BaseDataCache;
import com.kun.baselib.utils.ToastUtil;
import com.kun.dagger2rxjava2retrofit2demo.R;
import com.kun.dagger2rxjava2retrofit2demo.bean.WeatherResponse;
import com.kun.dagger2rxjava2retrofit2demo.dagger.DaggerAppBaseComponent;

import javax.inject.Inject;

import butterknife.OnClick;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

    @Override
    protected void daggerInit() {
        //项目第一次打开会报错找不到类，必须点击Build->make project生成文件
        DaggerAppBaseComponent.builder()
                .appComponent(getAppComponent())
                .build()
                .inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter.attachView(this);
    }

    @OnClick(R.id.btn_main_getweather)
    void getWeather(){
        mPresenter.getWeather("广州");
    }

    @Override
    public void getWeatherSuccess(WeatherResponse response) {
        ToastUtil.toastShort(response.getWendu());
    }
}
