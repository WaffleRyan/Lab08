package com.ghimireryan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class Layout5 extends AppCompatActivity {
    View lay;
    int are, gee, bee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout5);
        lay = findViewById(R.id.Layout5);
        SharedPreferences rgb = getSharedPreferences("RGB", MODE_PRIVATE);
        are = (int)(2.55*(rgb.getInt("red", 0)));
        gee = (int)(2.55*(rgb.getInt("green", 0)));
        bee= (int)(2.55*(rgb.getInt("blue", 0)));
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