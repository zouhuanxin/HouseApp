package com.zhx.houseapp.ui.fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.blankj.utilcode.util.ToastUtils;
import com.zhx.houseapp.R;
import com.zhx.houseapp.base.BaseFragment;
import com.zhx.houseapp.utils.CommUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginFragment extends BaseFragment {

    @BindView(R.id.tv_login_title)
    TextView tvLoginTitle;
    @BindView(R.id.et_login_name)
    EditText etLoginName;
    @BindView(R.id.et_login_pwd)
    EditText etLoginPwd;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.tv_login_register)
    TextView tvLoginRegister;
    @BindView(R.id.tv_login_forget_pwd)
    TextView tvLoginForgetPwd;
    private boolean is_null = false;
    public static LoginFragment newInstance() {
        LoginFragment fragment = new LoginFragment();

        return fragment;
    }


    @Override
    public View getLayoutId(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);
    }


    @Override
    public void initData() {
        is_null(etLoginName,etLoginPwd);
    }
    @OnClick({R.id.tv_login_register,R.id.tv_login_forget_pwd})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.tv_login_register:
                ToastUtils.showLong("不会吧不会吧，你竟然用我们的软件啊");
//                start(RegisterFragment.getInstance());
                break;
            case R.id.tv_login_forget_pwd:
                ToastUtils.showLong("哎呀，这谁啊，密码都能忘记");
//                start(ResetFragment.newInstance());
                break;
            default:
                break;
        }
    }

    public void is_null(EditText... text){
        text[0].addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length()!=0){
                    if (text[1].getText().toString().length()!=0){
                        btnLogin.setEnabled(true);
                    }
                }else {
                    btnLogin.setEnabled(false);
                }
            }
        });
        text[1].addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length()!=0){
                    if (text[0].getText().toString().length()!=0){
                        btnLogin.setEnabled(true);
                    }
                }else {
                    btnLogin.setEnabled(false);
                }

            }
        });
    }
}