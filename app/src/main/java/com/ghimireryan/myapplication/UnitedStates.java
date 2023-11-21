package com.ghimireryan.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
//import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.devs.vectorchildfinder.VectorDrawableCompat;
import com.devs.vectorchildfinder.VectorChildFinder;

public class UnitedStates extends View {
    private VectorDrawableCompat unitedStates;
    private Canvas canv;
    private ImageView imgView;
    private int are = 148;
    private int gee = 0;
    private int bee = 0;
    private int deltaGee = 221;
    public UnitedStates(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        //unitedStates = ContextCompat.getDrawable(this.getContext(), R.drawable.us);
        //unitedStates = VectorDrawableCompat.create(getResources(), R.drawable.us, null);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        canv = canvas;
        imgView = new ImageView(this.getContext());
        imgView.setImageDrawable(AppCompatResources.getDrawable(this.getContext(), R.drawable.us));
//        VectorChildFinder vector = new VectorChildFinder(this.getContext(), R.drawable.us, imgView);
        imgView.invalidate();
        unitedStates = (VectorDrawableCompat) imgView.getDrawable();
        Drawable drawo = (Drawable) unitedStates;
        drawo.setBounds(-115, 0, 500, 500);
        drawo.draw(canv);
//        VectorDrawableCompat.VFullPath path1 = vector.findPathByName(state);
//        path1.setFillColor(Color.RED);




        canv.save();
        canv.restore();
    }

    protected void changeColor(String state, int distance){

        //imgView.setImageDrawable(unitedStates);
        VectorChildFinder vector = new VectorChildFinder(this.getContext(), R.drawable.us, imgView);
        VectorDrawableCompat.VFullPath path = vector.findPathByName("AZ");
        path.setFillColor(Color.RED);
        imgView.invalidate();

        unitedStates = (VectorDrawableCompat) imgView.getDrawable();
        Drawable drawo = (Drawable) unitedStates;
        drawo.setBounds(-115, 0, 500, 500);
        drawo.draw(canv);

        canv.save();
        canv.restore();



    }
}
