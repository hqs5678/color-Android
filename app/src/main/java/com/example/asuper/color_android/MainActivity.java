package com.example.asuper.color_android;

import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Shader;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.hqs.utils.ColorUtil;
import com.hqs.utils.Log;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tv = (TextView) findViewById(R.id.tv1);
        tv.setBackground(ColorUtil.linearGradient(new Point(0, 0), new Point(200, 200),
                new int[]{Color.argb(98, 255, 0, 0), Color.BLUE}, new float[]{0, 1}));


        tv = (TextView) findViewById(R.id.tv2);
        tv.setBackground(ColorUtil.linearGradientHorizontal(Color.argb(98, 255, 0, 0), Color.GREEN));


        tv = (TextView) findViewById(R.id.tv3);
        tv.setBackground(ColorUtil.linearGradientVertical(Color.argb(98, 255, 0, 0), Color.GREEN));


        tv = (TextView) findViewById(R.id.tv4);
        tv.setBackground(ColorUtil.linearGradientHorizontal(new int[]{Color.argb(98, 255, 0, 0),
                Color.BLUE, Color.GREEN}, new float[]{0, 0.2f, 1}));


        tv = (TextView) findViewById(R.id.tv5);
        tv.setBackground(ColorUtil.linearGradientVertical(new int[]{Color.argb(98, 255, 0, 0),
                Color.BLUE, Color.GREEN}, new float[]{0, 0.2f, 1}));


        tv = (TextView) findViewById(R.id.tv6);
        tv.setBackground(ColorUtil.radialGradient(new Point(200, 200), 300,
                new int[]{Color.argb(98, 255, 0, 0), Color.BLUE, Color.GREEN},
                new float[]{0, 0.2f, 1}));


        tv = (TextView) findViewById(R.id.tv7);
        tv.setBackground(ColorUtil.radialGradient(new Point(200, 200), 600,
                new int[]{Color.argb(98, 255, 0, 0), Color.BLUE, Color.GREEN, Color.TRANSPARENT},
                new float[]{0, 0.2f, 0.9f, 1},
                Shader.TileMode.CLAMP));


        tv = (TextView) findViewById(R.id.tv8);
        tv.setBackground(ColorUtil.radialGradient(new Point(200, 200), 600,
                new int[]{Color.TRANSPARENT, Color.GREEN, Color.TRANSPARENT},
                new float[]{0.3f, 0.6f, 1},
                Shader.TileMode.CLAMP));


        tv = (TextView) findViewById(R.id.tv9);
        tv.setBackground(ColorUtil.sweepGradient(new Point(200, 200),
                new int[]{Color.BLUE, Color.GREEN, Color.RED},
                new float[]{0.0f, 0.6f, 1}));

        tv = (TextView) findViewById(R.id.tv10);
        tv.setBackground(ColorUtil.sweepGradient(new Point(200, 200),
                new int[]{Color.BLUE, Color.GREEN, Color.BLUE},
                new float[]{0.0f, 0.6f, 1}));

        tv = (TextView) findViewById(R.id.tv11);
        tv.setBackground(ColorUtil.sweepGradient(new Point(200, 200),
                new int[]{Color.argb(98, 255, 0, 0), Color.GREEN, Color.argb(98, 255, 0, 0)},
                new float[]{0.0f, 0.6f, 1}));

    }
}
