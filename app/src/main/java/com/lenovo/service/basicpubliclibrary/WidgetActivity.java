package com.lenovo.service.basicpubliclibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.lenovo.service.basicpubliclibrary.AppStartGuide.AppStartGuide;
import com.lenovo.service.basicpubliclibrary.smilepraiseview.SmilePraiseActivity;

public class WidgetActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mText1;
    private TextView smileview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget);
        init_view();
        init_listener();
    }



    private void init_view() {
        mText1 = (TextView) findViewById(R.id.text1);
        smileview=(TextView) findViewById(R.id.smileview);
    }

    private void init_listener() {
        mText1.setOnClickListener(this);
        smileview.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.text1:
                Intent intent=new Intent();
                intent.setClass(WidgetActivity.this,
                        AppStartGuide.class);
                startActivity(intent);
                break;

            case R.id.smileview:
                Intent intent2=new Intent();
                intent2.setClass(WidgetActivity.this,
                        SmilePraiseActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
