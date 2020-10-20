package com.zhx.houseapp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.zhx.houseapp.R;
import com.zhx.houseapp.base.BaseActivity;
import com.zhx.houseapp.ui.fragment.PersonalDataFragment;
import com.zhx.houseapp.utils.CommUtils;

public class MyActivity extends BaseActivity {


    @Override
    public int getId() {
        return R.layout.activity_my;
    }

    @Override
    public void initData() {
        Intent intent = getIntent();
        switch (intent.getStringExtra(CommUtils.MY_ACTIVITY_CODE)){
            case CommUtils.MY_ACTIVITY_VERSION:
                //版本检测

                break;
            case CommUtils.MY_ACTIVITY_PERSONAL_SETTINGS:
                loadRootFragment(R.id.fl_my_content, PersonalDataFragment.newInstance());
                break;
            default:
                break;
        }
    }
}