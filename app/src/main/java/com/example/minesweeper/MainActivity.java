package com.example.minesweeper;

import android.app.Activity;
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
        soundBtn.setTag(R.drawable.sound);
        soundBtn.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            if (Integer.parseInt(soundBtn.getTag().toString()) == R.drawable.mute) {
                soundBtn.setBackgroundResource(R.drawable.sound);
                soundBtn.setScaleType(ImageView.ScaleType.FIT_END);
                soundBtn.setTag(R.drawable.sound);
            }
            else if (Integer.parseInt(soundBtn.getTag().toString()) == R.drawable.sound)
            {
                soundBtn.setBackgroundResource(R.drawable.mute);
                soundBtn.setScaleType(ImageView.ScaleType.FIT_END);
                soundBtn.setTag(R.drawable.mute);
            }
        }
    });
    }
}
