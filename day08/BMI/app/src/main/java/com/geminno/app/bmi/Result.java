package com.geminno.app.bmi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by admin on 2015/7/13.
 */
public class Result extends Activity {
    private TextView text;
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        // 找到指定的布局文件
        setContentView(R.layout.result);
        Intent intent=getIntent();
        text  =(TextView)findViewById(R.id.show);
        String c=intent.getStringExtra("name");
        text.setText(c);
    }
}
