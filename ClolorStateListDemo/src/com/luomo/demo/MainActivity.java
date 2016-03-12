package com.luomo.demo;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initViews();
    }

    private void initViews() {
        TextView tvTxt = (TextView) findViewById(R.id.tv_txt);
        //实现方式
        ColorStateList colorStateList1 = getResources().getColorStateList(R.color.text_selector);
        if (colorStateList1 != null) {
            tvTxt.setTextColor(colorStateList1);
        }
    }
}
