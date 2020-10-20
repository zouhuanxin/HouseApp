package com.zhx.houseapp.ui.fragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.core.content.FileProvider;

import com.qmuiteam.qmui.skin.QMUISkinManager;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;
import com.zhx.houseapp.R;
import com.zhx.houseapp.base.BaseFragment;
import com.zhx.houseapp.ui.custom.PersonalLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 个人资料
 */
public class PersonalDataFragment extends BaseFragment {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.iv_my_head)
    ImageView ivMyHead;
    @BindView(R.id.iv_my_next)
    ImageView ivMyNext;
    @BindView(R.id.rl_iv_head)
    RelativeLayout rlIvHead;
    @BindView(R.id.pl_nick_name)
    PersonalLayout plNickName;
    @BindView(R.id.pl_user)
    PersonalLayout plUser;
    @BindView(R.id.pl_sex)
    PersonalLayout plSex;
    @BindView(R.id.pl_address)
    PersonalLayout plAddress;
    @BindView(R.id.pl_introduction)
    PersonalLayout plIntroduction;
    @BindView(R.id.btn_out)
    Button btnOut;
    private AlertDialog dialog;
    public static PersonalDataFragment newInstance() {
        PersonalDataFragment fragment = new PersonalDataFragment();
        return fragment;
    }

    @Override
    public View getLayoutId(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_personal_data, container, false);
    }

    @Override
    public void initData() {

    }

    @OnClick({R.id.rl_iv_head,R.id.iv_back})
    public void OnClick(View view) {
        switch (view.getId()) {
            case R.id.rl_iv_head:
                ivDialog();
                break;
            case R.id.iv_back:
                getActivity().finish();
                break;
            default:
                break;
        }
    }

    public void ivDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getContext());
        View view = LayoutInflater.from(getContext()).inflate(R.layout.dialog_per,null);
        TextView tvAlbum = view.findViewById(R.id.tv_dialog_album);
        TextView tvSee = view.findViewById(R.id.tv_dialog_see);
        dialog = builder.setView(view).create();
        dialog.show();
        tvAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startCam();
                dialog.dismiss();
            }
        });
    }

    private void startCam() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        startActivityForResult(intent, 1);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (data != null) {
                try {
                    Bitmap bitmap = BitmapFactory.decodeStream
                            (getActivity().getContentResolver().openInputStream(data.getData()));
                    ivMyHead.setImageBitmap(bitmap);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}