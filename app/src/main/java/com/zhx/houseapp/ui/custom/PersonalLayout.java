package com.zhx.houseapp.ui.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.zhx.houseapp.R;

public class PersonalLayout extends RelativeLayout {
    private String title_text = "";
    private String content_text = "";
    private boolean t_v = false;
    private boolean i_v = false;
    private EditText tvContent;
    private TextView tvTitle;
    private ImageView ivNext;
    public PersonalLayout(@NonNull Context context) {
        this(context,null);
    }

    public PersonalLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public PersonalLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_my_custom,this);
        TypedArray array = context.obtainStyledAttributes(attrs,R.styleable.PersonalLayout);
        title_text = array.getString(R.styleable.PersonalLayout_title_text);
        content_text = array.getString(R.styleable.PersonalLayout_content_text);
        t_v = array.getBoolean(R.styleable.PersonalLayout_tv_visibility,t_v);
        i_v = array.getBoolean(R.styleable.PersonalLayout_iv_visibility,i_v);
        tvTitle = view .findViewById(R.id.tv_custom_title);
        tvContent = view.findViewById(R.id.tv_custom_content);
        ivNext = view.findViewById(R.id.iv_custom_next);
        tvTitle.setText(title_text);
        tvContent.setText(content_text);
        if (t_v){
            tvContent.setVisibility(GONE);
        }else {
            tvContent.setVisibility(VISIBLE);
        }
        if (i_v){
            ivNext.setVisibility(GONE);
        }else {
            ivNext.setVisibility(VISIBLE);
        }
        array.recycle();
    }

    public void init(Context context){

    }
    public void setTvContent_Visibility(boolean type){
        if (type){
            tvContent.setVisibility(GONE);
        }else {
            tvContent.setVisibility(VISIBLE);
        }
    }
}
