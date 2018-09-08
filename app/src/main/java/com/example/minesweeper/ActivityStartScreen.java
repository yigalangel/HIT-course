package com.example.minesweeper;


import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ActivityStartScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        final ImageView soundBtn = findViewById(R.id.sound);
        final ImageView startImg = ActivityStartScreen.this.findViewById(R.id.image_start);
        soundBtn.setTag(R.drawable.voicon);
        soundBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (Integer.parseInt(soundBtn.getTag().toString()) == R.drawable.voicoff) {
                    soundBtn.setBackgroundResource(R.drawable.voicon);
                    soundBtn.setScaleType(ImageView.ScaleType.FIT_END);
                    soundBtn.setTag(R.drawable.voicon);
                } else if (Integer.parseInt(soundBtn.getTag().toString()) == R.drawable.voicon) {
                    soundBtn.setBackgroundResource(R.drawable.voicoff);
                    soundBtn.setScaleType(ImageView.ScaleType.FIT_END);
                    soundBtn.setTag(R.drawable.voicoff);
                }
            }
        });
        ObjectAnimator anim1 = ObjectAnimator.ofFloat(startImg, "translationY", -200f, -10f);
        anim1.setDuration(4000);//1sec
        anim1.setInterpolator(new BounceInterpolator());
        anim1.setRepeatCount(0);//infinite
        ObjectAnimator anim2 = ObjectAnimator.ofFloat(startImg, "rotation", 360);
        anim2.setDuration(3000).setRepeatMode(ValueAnimator.REVERSE);//1sec
        anim2.setRepeatCount(-1);//infinite
        AnimatorSet setStart = new AnimatorSet();
        setStart.play(anim1).before(anim2);
        setStart.start();
        final BoardButton startbtn = findViewById(R.id.start);
        startbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent mapPage=new Intent(ActivityStartScreen.this,MapLevel.class);
                startActivity(mapPage);
            }
        });
    }
}
