package com.zhx.houseapp.ui.activity;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.zhx.houseapp.R;
import com.zhx.houseapp.base.BaseActivity;
import com.zhx.houseapp.ui.fragment.LoginFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UserActivity extends BaseActivity {
    @BindView(R.id.fl_content)
    FrameLayout flContent;

    @Override
    public int getId() {
        return R.layout.activity_user;
    }

    @Override
    public void initData() {
        loadRootFragment(R.id.fl_content, LoginFragment.newInstance());
    }
}