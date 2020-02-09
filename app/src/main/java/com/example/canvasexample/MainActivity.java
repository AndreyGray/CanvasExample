package com.example.canvasexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private PaintView paintView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        paintView = findViewById(R.id.paintView);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        paintView.init(metrics);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.normal:
                paintView.normal();
                return true;
            case R.id.emboss:
                paintView.emboss();
                return true;
            case R.id.blur:
                paintView.blur();
                return true;
            case R.id.clear:
                paintView.clear();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
//    class DrawView extends View {
//        Paint p;
//        RectF rectf;
//        float[] points;
//        float[] points1;
//
//        public DrawView(Context context) {
//            super(context);
//            p = new Paint();
//            rectf = new RectF(700,100,800,150);
//            points = new float[]{100,50,150,100,150,200,50,200,50,100};
//            points1 = new float[]{300,200,600,200,300,300,600,300,400,100,400,400,500,100,500,400};
//        }
//
//        @Override
//        protected void onDraw(Canvas canvas) {
//            {
//                canvas.drawARGB(80, 102, 204, 255);
//                p.setColor(Color.RED);
//                p.setStrokeWidth(10);
//                canvas.drawPoints(points,p);
//                canvas.drawLines(points1,p);
//                p.setColor(Color.GREEN);
//                canvas.drawRoundRect(rectf, 20, 20, p);
//                rectf.offset(0, 150);
//                canvas.drawOval(rectf, p);
//                rectf.offsetTo(900, 100);
//                rectf.inset(0, -25);
//                canvas.drawArc(rectf, 90, 270, true, p);
//                rectf.offset(0, 150);
//                canvas.drawArc(rectf, 90, 270, false, p);
//
//                p.setStrokeWidth(3);
//                canvas.drawLine(150, 450, 150, 600, p);
//                p.setColor(Color.BLUE);
//                p.setTextSize(30);
//                canvas.drawText("text left", 150, 500, p);
//                p.setTextAlign(Paint.Align.CENTER);
//                canvas.drawText("text center", 150, 525, p);
//                p.setTextAlign(Paint.Align.RIGHT);
//                canvas.drawText("text right", 150, 550, p);
//
//        }}}}
