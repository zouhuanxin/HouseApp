package com.zhx.houseapp.ui.activity;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.zhx.houseapp.R;
import com.zhx.houseapp.base.BaseActivity;
import com.zhx.houseapp.ui.fragment.LoginFragment;
import com.zhx.houseapp.ui.fragment.MyFragment;
import com.zhx.houseapp.utils.CommUtils;

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
        int type = getIntent().getIntExtra(CommUtils.MAIN_ACTIVITY_CODE, 0);
        switch (type) {
            case CommUtils.MAIN_TYPE:
                loadRootFragment(R.id.fl_content, LoginFragment.newInstance());
                break;
            case CommUtils.SUB_TYPE:
                loadRootFragment(R.id.fl_content, LoginFragment.newInstance());
                break;
            case CommUtils.MY_TYPE:
                loadRootFragment(R.id.fl_content, MyFragment.newInstance());
                break;
        }
//        loadRootFragment(R.id.fl_content, LoginFragment.newInstance());
    }
}