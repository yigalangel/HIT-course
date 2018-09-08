package com.example.minesweeper;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


public class MainActivity extends Activity {

    private static int START_TIME=4000;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image_start=findViewById(R.id.image_start);
        AnimationDrawable animationDrawable=(AnimationDrawable)image_start.getDrawable();
        animationDrawable.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homePage=new Intent (MainActivity.this,ActivityStartScreen.class);
                startActivity(homePage);
                finish();
            }
        },START_TIME);
    }
}
