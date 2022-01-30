package com.example.androiddemojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.androiddemojava.model.User;

public class DetailActivity extends AppCompatActivity {
    static final String TAG=DetailActivity.class.toString();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initView();
    }
    void  initView(){
        TextView tv_detail=findViewById(R.id.tv_detail);
 //       TextView tv_detail2=findViewById(R.id.tv_detail2);

        User user=(User) getIntent().getSerializableExtra("user");

        Log.d(TAG,user.toString());

        tv_detail.setText(user.toString());

    }
}