package com.ghimireryan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class SettingsActivity extends AppCompatActivity {

    Button xButton, randomButton, USAbutton;
    SeekBar redSeekBar, blueSeekBar, greenSeekBar;
    int rP, bP, gP;
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
        USAbutton=findViewById(R.id.USA_Button);
        SharedPreferences rgb = getSharedPreferences("RGB", MODE_PRIVATE);
        int are  = (rgb.getInt("red", 0));
        int gee  = (rgb.getInt("green", 0));
        int bee  = (rgb.getInt("blue", 0));
        int are2 = (rgb.getInt("red2", 0));
        int gee2 = (rgb.getInt("green2", 0));
        int bee2 = (rgb.getInt("blue2", 0));
        int are3 = (rgb.getInt("red3", 0));
        int gee3 = (rgb.getInt("green3", 0));
        int bee3 = (rgb.getInt("blue3", 0));
        if(are != 196){s="";}
        if(gee != 15){s="";}
        if(bee != 21){s="";}
        if(are2!= 46){s="";}
        if(gee2!= 89){s="";}
        if(bee2!= 143){s="";}
        if(are3!= 235){s="";}
        if(gee3!= 234){s="";}
        if(bee3!= 217){s="";}
        USAbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences rgb = getSharedPreferences("RGB", MODE_PRIVATE);
                SharedPreferences.Editor rgbEditor = rgb.edit();
                rgbEditor.putInt("red", 196);
                rgbEditor.putInt("green", 15);
                rgbEditor.putInt("blue",21);
                rgbEditor.putInt("red2", 46);
                rgbEditor.putInt("green2", 89);
                rgbEditor.putInt("blue2", 143);
                rgbEditor.putInt("red3", 235);
                rgbEditor.putInt("green3", 234);
                rgbEditor.putInt("blue3",217);
                rgbEditor.putInt("r", redSeekBar.getProgress());
                rgbEditor.putInt("g", greenSeekBar.getProgress());
                rgbEditor.putInt("b", blueSeekBar.getProgress());
                rgbEditor.putBoolean("isUSA", true);
                rgbEditor.apply();
                s = "USA";
            }
        });
        blueSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                return;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                s = "";
                return;
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                return;
            }
        });
        redSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                return;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                s = "";
                return;
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                return;
            }
        });
        greenSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                return;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                s = "";
                return;
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                return;
            }
        });
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
                if(s.equals("")) {
                    SharedPreferences rgb = getSharedPreferences("RGB", MODE_PRIVATE);
                    SharedPreferences.Editor rgbEditor = rgb.edit();
                    rgbEditor.putInt("red", redSeekBar.getProgress());
                    rgbEditor.putInt("green", greenSeekBar.getProgress());
                    rgbEditor.putInt("blue", blueSeekBar.getProgress());
                    rgbEditor.putInt("r", redSeekBar.getProgress());
                    rgbEditor.putInt("g", greenSeekBar.getProgress());
                    rgbEditor.putInt("b", blueSeekBar.getProgress());
                    rgbEditor.putInt("red2", 255 - (int) (redSeekBar.getProgress() * 2.55));
                    rgbEditor.putInt("green2", 255 - (int) (greenSeekBar.getProgress() * 2.55));
                    rgbEditor.putInt("blue2", 255 - (int) (blueSeekBar.getProgress() * 2.55));
                    rgbEditor.putInt("red3", (int) (redSeekBar.getProgress() * 2.55));
                    rgbEditor.putInt("green3", (int) (greenSeekBar.getProgress() * 2.55));
                    rgbEditor.putInt("blue3", (int) (blueSeekBar.getProgress() * 2.55));
                    rgbEditor.putBoolean("isUSA", false);
                    rgbEditor.apply();
                }

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
        rP = redSeekBar.getProgress();
        gP = greenSeekBar.getProgress();
        bP = blueSeekBar.getProgress();
        if(s.equals("")) {
            SharedPreferences rgb = getSharedPreferences("RGB", MODE_PRIVATE);
            SharedPreferences.Editor rgbEditor = rgb.edit();
            rgbEditor.putInt("red", redSeekBar.getProgress());
            rgbEditor.putInt("green", greenSeekBar.getProgress());
            rgbEditor.putInt("blue", blueSeekBar.getProgress());
            rgbEditor.putInt("r", redSeekBar.getProgress());
            rgbEditor.putInt("g", greenSeekBar.getProgress());
            rgbEditor.putInt("b", blueSeekBar.getProgress());
            rgbEditor.putInt("red2", 255 - (int) (redSeekBar.getProgress() * 2.55));
            rgbEditor.putInt("green2", 255 - (int) (greenSeekBar.getProgress() * 2.55));
            rgbEditor.putInt("blue2", 255 - (int) (blueSeekBar.getProgress() * 2.55));
            rgbEditor.putInt("red3", (int) (redSeekBar.getProgress() * 2.55));
            rgbEditor.putInt("green3", (int) (greenSeekBar.getProgress() * 2.55));
            rgbEditor.putInt("blue3", (int) (blueSeekBar.getProgress() * 2.55));
            rgbEditor.putBoolean("isUSA", true);
            rgbEditor.apply();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences rgb = getSharedPreferences("RGB", MODE_PRIVATE);
        redSeekBar.setProgress(rgb.getInt("r", 0));
        greenSeekBar.setProgress(rgb.getInt("g", 0));
        blueSeekBar.setProgress(rgb.getInt("b", 0));
    }
}