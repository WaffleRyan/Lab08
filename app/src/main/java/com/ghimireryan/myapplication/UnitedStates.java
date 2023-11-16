package com.ghimireryan.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;

import com.devs.vectorchildfinder.VectorChildFinder;

public class UnitedStates extends View {
    private VectorDrawableCompat unitedStates;
    private Canvas canv;
    public UnitedStates(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        unitedStates = VectorDrawableCompat.create(getResources(), R.drawable.us, null);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        canv = canvas;
        unitedStates.setBounds(-115, 0, (int) (unitedStates.getIntrinsicWidth()*0.395), (int)(unitedStates.getIntrinsicHeight()*0.45));
        unitedStates.draw(canvas);
        canvas.save();
        canvas.restore();
    }

    protected static void changeColor(Path state, int distance){
        int are = -148;
        int gee = 0;
        int bee = 0;
        int deltaAre = 72;
        int deltaGee = 221;
        Paint painto = new Paint();
        painto.setColor(Color.rgb((are + deltaAre), gee + deltaGee, bee));
        painto.setStyle(Paint.Style.FILL);
        canv.drawPath(state,painto);



    }
}
