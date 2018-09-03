package com.example.minesweeper;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView soundBtn = findViewById(R.id.sound);

        ImageView image_start=findViewById(R.id.image_start);
        AnimationDrawable animationDrawable=(AnimationDrawable)image_start.getDrawable();
        animationDrawable.start();

        soundBtn.setTag(R.drawable.voicon);
        soundBtn.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            if (Integer.parseInt(soundBtn.getTag().toString()) == R.drawable.voicoff) {
                soundBtn.setBackgroundResource(R.drawable.voicon);
                soundBtn.setScaleType(ImageView.ScaleType.FIT_END);
                soundBtn.setTag(R.drawable.voicon);
            }
            else if (Integer.parseInt(soundBtn.getTag().toString()) == R.drawable.voicon)
            {
                soundBtn.setBackgroundResource(R.drawable.voicoff);
                soundBtn.setScaleType(ImageView.ScaleType.FIT_END);
                soundBtn.setTag(R.drawable.voicoff);
            }
        }
    });
    }
}
