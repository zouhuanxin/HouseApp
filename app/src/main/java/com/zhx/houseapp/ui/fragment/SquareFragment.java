package com.zhx.houseapp.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhx.houseapp.R;
import com.zhx.houseapp.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SquareFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SquareFragment extends BaseFragment {
    public static SquareFragment newInstance() {
        SquareFragment fragment = new SquareFragment();

        return fragment;
    }


    @Override
    public View getLayoutId(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_square, container, false);
    }

    @Override
    public void initData() {

    }
}