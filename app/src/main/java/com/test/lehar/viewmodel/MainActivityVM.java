package com.test.lehar.viewmodel;

import android.databinding.BaseObservable;

import com.test.lehar.activity.MainActivity;

public class MainActivityVM extends BaseObservable implements BaseVMInterface {

    private MainActivity activity;

    public MainActivityVM(MainActivity activity) {
        this.activity = activity;
        onCreate();
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void initView() {

    }

    @Override
    public void refresh() {

    }
}
