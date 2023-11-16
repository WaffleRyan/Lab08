package com.ghimireryan.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Layout1 extends AppCompatActivity {
    View lay;
    int are, gee, bee;
    AppCompatButton b11, b12, b13, b14;
    TextView t11;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout1);
        lay = findViewById(R.id.Layout1);
        b11=findViewById(R.id.b11);
        b12=findViewById(R.id.b12);
        b13=findViewById(R.id.b13);
        b14=findViewById(R.id.b14);
        t11=findViewById(R.id.t11);

        SharedPreferences rgb = getSharedPreferences("RGB", MODE_PRIVATE);
        are = (int)(2.55*(rgb.getInt("red", 0)));
        gee = (int)(2.55*(rgb.getInt("green", 0)));
        bee= (int)(2.55*(rgb.getInt("blue", 0)));

        b11.setTextColor(Color.rgb(255-are, 255-gee, 255-bee));
        b11.setBackgroundColor(Color.rgb(are, gee, bee));
        b14.setTextColor(Color.rgb(255-are, 255-gee, 255-bee));
        b14.setBackgroundColor(Color.rgb(are, gee, bee));
        b12.setTextColor(Color.rgb(are, gee, bee));
        b12.setBackgroundColor(Color.rgb(255-are, 255-gee, 255-bee));
        b13.setTextColor(Color.rgb(are, gee, bee));
        b13.setBackgroundColor(Color.rgb(255-are, 255-gee, 255-bee));

        t11.setTextColor(Color.rgb(are, gee, bee));

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