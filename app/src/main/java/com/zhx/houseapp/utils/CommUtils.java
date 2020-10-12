package com.zhx.houseapp.utils;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class CommUtils {
    public static void isEtNull(Button button, EditText... editText){
        editText[0].addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length()!=0){
                    if (editText.length==2){
                        if (editText[1].getText().toString().length()!=0){
                            button.setEnabled(true);
                        }else {
                            button.setEnabled(false);
                        }
                    }
                    if (editText.length==3){
                        if (editText[1].getText().toString().length()!=0&&editText[2].getText().toString().length()!=0){
                            button.setEnabled(true);
                        }else {
                            button.setEnabled(false);
                        }
                    }
                }else {
                    button.setEnabled(false);
                }
            }
        });
    }

}
