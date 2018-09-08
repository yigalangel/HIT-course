package com.example.minesweeper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.Image;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class BoardButton extends Button {
    public BoardButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
     @SuppressLint("ResourceAsColor")
     @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    protected  void onDraw(Canvas canvas)
    {
        this.setBackgroundResource(R.drawable.bord);
        this.setTextSize(26);
        this.setTextColor(R.color.colorTextLite);
        super.onDraw(canvas);

    }


}
