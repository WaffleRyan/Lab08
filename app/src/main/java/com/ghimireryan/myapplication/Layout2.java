package com.ghimireryan.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class Layout2 extends AppCompatActivity {
    View lay;
    AppCompatButton b21, b22, b23;
    TextView t21;
    int are, gee, bee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);
        lay = findViewById(R.id.Layout2);
        b21 = findViewById(R.id.b21);
        b22 = findViewById(R.id.b22);
        b23 = findViewById(R.id.b23);
        t21 = findViewById(R.id.t21);

        SharedPreferences rgb = getSharedPreferences("RGB", MODE_PRIVATE);
        are = (int)(2.55*(rgb.getInt("red", 0)));
        gee = (int)(2.55*(rgb.getInt("green", 0)));
        bee= (int)(2.55*(rgb.getInt("blue", 0)));

        b21.setTextColor(Color.rgb(are, gee, bee));
        b21.setBackgroundColor(Color.rgb(255-are, 255-gee, 255-bee));
        b22.setTextColor(Color.rgb(255-are, 255-gee, 255-bee));
        b22.setBackgroundColor(Color.rgb(are, gee, bee));
        b23.setTextColor(Color.rgb(255-are, 255-gee, 255-bee));
        b23.setBackgroundColor(Color.rgb(are, gee, bee));
        t21.setTextColor(Color.rgb(255-are, 255-gee, 255-bee));

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