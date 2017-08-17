package com.kun.baselib.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kun.baselib.utils.ToastUtil;
import com.trello.rxlifecycle2.components.support.RxFragment;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Fragment 基类，抽取重复代码，继承了 RxFragment，便于管理 RxJava 生命周期
 * <p>
 */
public abstract class BaseFragment extends RxFragment {
    protected Context mContext;
    protected Activity mActivity;
    private Unbinder unbinder;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = getActivity();
        mContext = getActivity();
    }

    public void startActivity(Class ActivityClass) {
        Intent intent = new Intent(mActivity, ActivityClass);
        mActivity.startActivity(intent);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = createView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    /**
     * 抽象方法，用于 onCreateView() 期间创建View
     *
     * @param inflater           填充器
     * @param container          父控件
     * @param savedInstanceState 异常退出时保存的状态
     * @return 要创建的View
     */
    public abstract View createView(LayoutInflater inflater,
                                    @Nullable ViewGroup container,
                                    @Nullable Bundle savedInstanceState);

    public void showToast(@StringRes int resId) {
        ToastUtil.toastShort(getContext(), resId);
    }
}
