package com.example.mohamed_hamouda_pc.routeappone;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

         Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

               Intent intent= Intent(SplashScreen.class,MainActivity.this);
               startActivity(x);
                finish();
            }
        },2500);
    }
}
