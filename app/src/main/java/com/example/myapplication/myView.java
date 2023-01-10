package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import java.lang.reflect.Method;

public class myView extends View {

    public myView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        Objects.drawBackGround(this, canvas, paint);
        Objects.drawHouse(this, canvas, paint);

    }
}
