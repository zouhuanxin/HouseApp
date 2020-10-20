package com.zhx.houseapp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.zhx.houseapp.R;
import com.zhx.houseapp.base.BaseActivity;
import com.zhx.houseapp.utils.CommUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.yokeyword.fragmentation.anim.FragmentAnimator;

public class RootActivity extends BaseActivity {
    @BindView(R.id.et_search)
    EditText etSearch;
    @BindView(R.id.btn_search)
    Button btnSearch;
    @BindView(R.id.iv_my)
    ImageView ivMy;

    @Override
    public int getId() {
        return R.layout.activity_root;
    }

    @Override
    public void initData() {
        ivMy.setOnClickListener(view -> {
            boolean is_login = false;
            if (is_login){
                Intent intent = new Intent(RootActivity.this,UserActivity.class);
                intent.putExtra(CommUtils.MAIN_ACTIVITY_CODE,CommUtils.LOGIN_TYPE);
                startActivity(intent);
            }else {
                Intent intent = new Intent(RootActivity.this,UserActivity.class);
                intent.putExtra(CommUtils.MAIN_ACTIVITY_CODE,CommUtils.MY_TYPE);
                startActivity(intent);
            }

        });
    }


}