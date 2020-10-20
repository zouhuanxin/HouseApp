package com.zhx.houseapp.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.zhx.houseapp.R;
import com.zhx.houseapp.ui.activity.MyActivity;
import com.zhx.houseapp.utils.CommUtils;

public class AdapterMyGrid extends BaseAdapter {
    private String titles[];
    private int[] imgs;
    private Context context;
    public AdapterMyGrid(String[] titles, int[] imgs,Context context) {
        this.titles = titles;
        this.imgs = imgs;
        this.context = context;
    }

    @Override
    public int getCount() {
        return titles != null ? titles.length : 0;
    }

    @Override
    public Object getItem(int i) {
        return titles != null ? titles[i] : null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHold viewHold;
        if (view == null){
            viewHold = new ViewHold();
            view = LayoutInflater.from(context).inflate(R.layout.item_my_grid,null);
            viewHold.textView = view.findViewById(R.id.tv_item_title);
            viewHold.imageView = view.findViewById(R.id.ivv_item);
            viewHold.rlItem = view.findViewById(R.id.rl_item);
            view.setTag(viewHold);
        }else {
            viewHold = (ViewHold) view.getTag();
        }
        viewHold.imageView.setImageResource(imgs[i]);
        viewHold.textView.setText(titles[i]);
        viewHold.rlItem.setOnClickListener(view1 -> {
            switch (i){
                case 0:

                    break;
                case 1:
                    Intent intent = new Intent(context, MyActivity.class);
                    intent.putExtra(CommUtils.MY_ACTIVITY_CODE,CommUtils.MY_ACTIVITY_PERSONAL_SETTINGS);
                    context.startActivity(intent);
                    break;
                case 2:
                    ToastUtils.showLong(AppUtils.getAppName()+"的版本号是："+AppUtils.getAppVersionName());
                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    break;
            }
        });
        return view;
    }

    class ViewHold{
        TextView textView;
        ImageView imageView;
        RelativeLayout rlItem;
    }
    public onClick onClick;
    public void setOnclick(onClick onclick){

    }
    public interface onClick{
        void setOnclick(int i);
    }
}
