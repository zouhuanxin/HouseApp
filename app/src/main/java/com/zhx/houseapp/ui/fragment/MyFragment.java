package com.zhx.houseapp.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.zhx.houseapp.R;
import com.zhx.houseapp.base.BaseFragment;
import com.zhx.houseapp.ui.adapter.AdapterMyGrid;

import butterknife.BindView;
import me.yokeyword.fragmentation.anim.FragmentAnimator;

public class MyFragment extends BaseFragment {

    @BindView(R.id.iv_user_icon)
    ImageView ivUserIcon;
    @BindView(R.id.tv_collection_count)
    TextView tvCollectionCount;
    @BindView(R.id.tv_collection_title)
    TextView tvCollectionTitle;
    @BindView(R.id.tv_history_count)
    TextView tvHistoryCount;
    @BindView(R.id.tv_history_title)
    TextView tvHistoryTitle;
    @BindView(R.id.rl_my_head)
    RelativeLayout rlMyHead;
    @BindView(R.id.tv_content_title)
    TextView tvContentTitle;
    @BindView(R.id.gv_my)
    GridView gvMy;
    private AdapterMyGrid adapterMyGrid;
    private String titles[] = {"我的订阅","个人资料设置","版本检测","开发者信息"};
    private int[] imgs = {R.mipmap.icon_subscribe,R.mipmap.icon_user,R.mipmap.icon_version,R.mipmap.icon_developer};

    public static MyFragment newInstance() {
        MyFragment fragment = new MyFragment();
        return fragment;
    }

    @Override
    public View getLayoutId(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my, container, false);
    }

    @Override
    public void initData() {
        setFragmentAnimator(new FragmentAnimator(R.anim.pop_in,R.anim.pop_out));
        RequestOptions options = new RequestOptions().error(R.mipmap.ic_launcher).bitmapTransform(new RoundedCorners(30));
        Glide.with(getContext()).load(R.mipmap.icon_test).apply(options).into(ivUserIcon);
        adapterMyGrid = new AdapterMyGrid(titles,imgs,getContext());
        gvMy.setAdapter(adapterMyGrid);
    }
}