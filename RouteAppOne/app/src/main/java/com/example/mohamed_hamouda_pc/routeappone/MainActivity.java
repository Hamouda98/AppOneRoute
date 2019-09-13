package com.example.mohamed_hamouda_pc.routeappone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected ImageView android;
    protected TextView IOS;
    protected ImageButton WEB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_ios_course);


    }

    @Override
    public void onClick( view) {
        if (view.getId() == R.android) {

            startActivity( Intent(MainActivity,AndroidCourse.class));
        } else  (view.getId() == R.id.IOS) {
            startActivity( Intent(MainActivity.this,IosCourse.class));
        } else  (view.getId() == R.id.WEB) {
            startActivity( (MainActivity.this,WebCourse));        }
    }

    private void initView() {
        android = (Button) findViewbyId(R.id.);
        android.setOnClickListener(MainActivity.this);
        IOS = (Button) findViewbyId(R.id.);
        IOS.setOnClickListener(MainActivity.this);
        WEB = (Button) findViewById(R.id.WEB);
        WEB.setonClickListener(MainActivity.this);
    }
}
