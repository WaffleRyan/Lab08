package com.ghimireryan.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class Layout3 extends AppCompatActivity {
    View lay;
    int are, gee, bee;
    TextView t31, t32, t33;
    AppCompatButton b31;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout3);
        lay = findViewById(R.id.Layout3);
        t31 = findViewById(R.id.t31);
        t32 = findViewById(R.id.t32);
        t33 = findViewById(R.id.t33);
        b31 = findViewById(R.id.b31);
        SharedPreferences rgb = getSharedPreferences("RGB", MODE_PRIVATE);
        are = (int)(2.55*(rgb.getInt("red", 0)));
        gee = (int)(2.55*(rgb.getInt("green", 0)));
        bee= (int)(2.55*(rgb.getInt("blue", 0)));
        t31.setTextColor(Color.rgb(255-are, 255-gee, 255-bee));
        t31.setBackgroundColor(Color.rgb(are, gee, bee));
        b31.setTextColor(Color.rgb(are, gee, bee));
        b31.setBackgroundColor(Color.rgb(255-are, 255-gee, 255-bee));
        t32.setTextColor(Color.rgb(255-are, 255-gee, 255-bee));
        t32.setBackgroundColor(Color.rgb(are, gee, bee));
        t33.setTextColor(Color.rgb(are, gee, bee));
        t33.setBackgroundColor(Color.rgb(255-are, 255-gee, 255-bee));

        lay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()== MotionEvent.ACTION_UP){
            finish();
            return true;
        }
        else{
            return false;
        }
    }

    public void onClick(View view){
        finish();
    }
}