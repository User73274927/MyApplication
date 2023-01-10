package com.example.myapplication;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class Objects {
    final static int dotX = 20;
    final static int dotY = 40;

    static void drawBackGround(View view, Canvas canvas, Paint paint) {
        paint.setStrokeWidth(10);
        paint.setColor(Color.GREEN);
        canvas.drawRect(0, view.getHeight(), view.getWidth(), view.getHeight() - view.getHeight()/4, paint);

        paint.setColor(Color.YELLOW);
        canvas.drawCircle(0, 0, 300, paint);
    }

    static void drawHouse(View view, Canvas canvas, Paint paint) {
        int size = view.getWidth() / 3;
        int x = view.getWidth() / dotX * 3;
        int y = view.getHeight() / dotY * 25;
        paint.setColor(Color.parseColor("#AF1635"));
        canvas.drawRect(x, y, x + size, y + size, paint);
        Path path = new Path();
        path.moveTo(x - 20, y);
        path.lineTo(x, y - 30);
        path.lineTo(x);

    }
}
