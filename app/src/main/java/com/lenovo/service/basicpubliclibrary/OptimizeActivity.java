package com.lenovo.service.basicpubliclibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.lenovo.service.basicpubliclibrary.jobservice.JobServiceActivity;
import com.lenovo.service.basicpubliclibrary.leakcanary.LeakCanaryActivity;
import com.lenovo.service.basicpubliclibrary.networkokhttp.NetokhttpActivity;

public class OptimizeActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView mTv_okhttpEncapsulation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optimize);
        initview();
        initlistener();
    }


    private void initview() {

        mTv_okhttpEncapsulation = (TextView) findViewById(R.id.tv_okhttpEncapsulation);

    }


    private void initlistener() {
        mTv_okhttpEncapsulation.setOnClickListener(this);

    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.job_service:
                Intent intent=new Intent(this, JobServiceActivity.class);
                startActivity(intent);
                break;
            case R.id.leak_canary:
                intent=new Intent(this, LeakCanaryActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_okhttpEncapsulation:
                intent=new Intent(this, NetokhttpActivity.class);
                startActivity(intent);
                break;
        }
    }


}
