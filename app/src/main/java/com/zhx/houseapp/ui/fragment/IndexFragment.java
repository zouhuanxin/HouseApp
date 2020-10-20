package com.zhx.houseapp.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhx.houseapp.R;
import com.zhx.houseapp.base.BaseFragment;

import me.yokeyword.fragmentation.anim.FragmentAnimator;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link IndexFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class IndexFragment extends BaseFragment {


    public static IndexFragment newInstance() {
        IndexFragment fragment = new IndexFragment();
        return fragment;
    }

    @Override
    public View getLayoutId(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_index, container, false);
    }

    @Override
    public void initData() {
        setFragmentAnimator(new FragmentAnimator(R.anim.pop_in,R.anim.pop_out));
    }
}