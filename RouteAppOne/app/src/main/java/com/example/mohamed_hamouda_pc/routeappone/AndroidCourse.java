package com.example.mohamed_hamouda_pc.routeappone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class AndroidCourse extends AppCompatActivity {


    protected Button androidpic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_android_course);


    }

    private void initView() {
        androidpic = (ImageView) findViewById(R.id.androidpic);
    }
}
