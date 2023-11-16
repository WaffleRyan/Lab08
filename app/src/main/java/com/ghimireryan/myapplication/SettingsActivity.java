package com.ghimireryan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class SettingsActivity extends AppCompatActivity {

    Button xButton, randomButton;
    SeekBar redSeekBar, blueSeekBar, greenSeekBar;

    String s = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        xButton= findViewById(R.id.xButton);
        randomButton = findViewById(R.id.randomButton);
        redSeekBar=findViewById(R.id.redSeekBar);
        blueSeekBar= findViewById(R.id.blueSeekBar);
        greenSeekBar= findViewById(R.id.greenSeekBar);
        randomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rando = (int) (Math.random()*7);
                if(rando == 0){
                    Intent intent = new Intent(getApplicationContext(), Layout1.class);
                    startActivity(intent);
                }
                else if(rando == 1){
                    Intent intent = new Intent(getApplicationContext(), Layout2.class);
                    startActivity(intent);
                }
                else if(rando == 2){
                    Intent intent = new Intent(getApplicationContext(), Layout3.class);
                    startActivity(intent);
                }
                else if(rando == 3){
                    Intent intent = new Intent(getApplicationContext(), Layout4.class);
                    startActivity(intent);
                }
                else if(rando == 4){
                    Intent intent = new Intent(getApplicationContext(), Layout5.class);
                    startActivity(intent);
                }
                else if(rando == 5){
                    Intent intent = new Intent(getApplicationContext(), Layout6.class);
                    startActivity(intent);
                }
                else if(rando == 6){
                    Intent intent = new Intent(getApplicationContext(), Layout7.class);
                    startActivity(intent);
                }

            }
        });
        xButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences rgb = getSharedPreferences("RGB", MODE_PRIVATE);
                SharedPreferences.Editor rgbEditor = rgb.edit();
                rgbEditor.putInt("red", redSeekBar.getProgress());
                rgbEditor.putInt("green", greenSeekBar.getProgress());
                rgbEditor.putInt("blue", blueSeekBar.getProgress());
                rgbEditor.apply();
                s = (""+redSeekBar.getProgress()+" "+greenSeekBar.getProgress()+" "+blueSeekBar.getProgress());

                Intent returnIntent = new Intent();
                returnIntent.putExtra("com.ghimireryan.myapplication.extra.REPLY", s);//insert message
                setResult(RESULT_OK, returnIntent);//indicate response was successful
                finishAndRemoveTask();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();

        SharedPreferences rgb = getSharedPreferences("RGB", MODE_PRIVATE);
        SharedPreferences.Editor rgbEditor = rgb.edit();
        rgbEditor.putInt("red", redSeekBar.getProgress());
        rgbEditor.putInt("green", greenSeekBar.getProgress());
        rgbEditor.putInt("blue", blueSeekBar.getProgress());
        rgbEditor.apply();
    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences rgb = getSharedPreferences("RGB", MODE_PRIVATE);
        redSeekBar.setProgress(rgb.getInt("red", 0));
        greenSeekBar.setProgress(rgb.getInt("green", 0));
        blueSeekBar.setProgress(rgb.getInt("blue", 0));
    }
}