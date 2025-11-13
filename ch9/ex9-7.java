package com.example.a11week;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    final static int LINE = 1, CIRCLE = 2;
    static int curShape = LINE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyGraphicView(this));
        setTitle("C089038오현준");
    }
    private static class MyGraphicView extends View {
        public MyGraphicView(Context context){
            super(context);
        }
        @Override
        protected void onDraw(Canvas canvas){
            super.onDraw(canvas);
            Bitmap picture = BitmapFactory.decodeResource(getResources(),
                    R.drawable.download);
            int cenX = this.getWidth() / 2;
            int cenY = this.getHeight() / 2;
            int picX = (this.getWidth() - picture.getWidth()) /2;
            int picY = (this.getHeight() - picture.getHeight()) /2;
            /*
            canvas.rotate(45, cenX, cenY);
            canvas.drawBitmap(picture, picX, picY, null);

            canvas.translate(-150, 200);
            canvas.drawBitmap(picture, picX, picY, null);

            canvas.scale(2, 2, cenX, cenY);
            canvas.drawBitmap(picture, picX, picY, null);
            */
            canvas.skew(0.3f, 0.3f);
            canvas.drawBitmap(picture, picX, picY, null);

            picture.recycle();
        }
    }

}