package com.example.androiddemojava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
        void initView(){
            Button b_detail=findViewById(R.id.b_detail);
            b_detail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openDetailActivity();
                }
            });
        }
        void openDetailActivity(){
            Intent intent=new Intent(this,DetailActivity.class);
            startActivity(intent);
        }
}