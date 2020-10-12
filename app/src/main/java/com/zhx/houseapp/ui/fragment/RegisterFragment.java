package com.zhx.houseapp.ui.fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.zhx.houseapp.R;
import com.zhx.houseapp.base.BaseFragment;

import butterknife.BindView;

public class RegisterFragment extends BaseFragment {
    @BindView(R.id.tv_register_title)
    TextView tvRegisterTitle;
    @BindView(R.id.et_register_name)
    EditText etRegisterName;
    @BindView(R.id.et_register_pwd)
    EditText etRegisterPwd;
    @BindView(R.id.et_register_repwd)
    EditText etRegisterRepwd;
    @BindView(R.id.btn_register)
    Button btnRegister;

    public static RegisterFragment getInstance() {
        return new RegisterFragment();
    }

    @Override
    public View getLayoutId(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_register, container, false);
    }

    @Override
    public void initData() {
        is_null(etRegisterName,etRegisterPwd,etRegisterRepwd);
    }

    public void is_null(EditText... text) {
        text[0].addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() != 0) {
                    if (text[1].getText().toString().length() != 0 && text[2].getText().toString().length() != 0) {
                        btnRegister.setEnabled(true);
                    }
                } else {
                    btnRegister.setEnabled(false);
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
                if (editable.toString().length() != 0) {
                    if (text[0].getText().toString().length() != 0 && text[2].getText().toString().length() != 0) {
                        btnRegister.setEnabled(true);
                    }
                } else {
                    btnRegister.setEnabled(false);
                }

            }
        });
        text[2].addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() != 0) {
                    if (text[0].getText().toString().length() != 0 && text[1].getText().toString().length() != 0) {
                        btnRegister.setEnabled(true);
                    }
                } else {
                    btnRegister.setEnabled(false);
                }

            }
        });
    }
}