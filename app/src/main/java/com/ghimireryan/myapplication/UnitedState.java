package com.ghimireryan.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;

public class UnitedState extends View {

    private VectorDrawableCompat unitedStates;
    private VectorDrawableCompat al;
    private VectorDrawableCompat ak;
    private VectorDrawableCompat az;
    private VectorDrawableCompat ar;
    private VectorDrawableCompat ca;
    private VectorDrawableCompat co;
    private VectorDrawableCompat ct;
    private VectorDrawableCompat de;
    private VectorDrawableCompat dc;
    private VectorDrawableCompat fl;
    private VectorDrawableCompat ga;
    private VectorDrawableCompat hi;
    private VectorDrawableCompat id;
    private VectorDrawableCompat il;
    private VectorDrawableCompat in;
    private VectorDrawableCompat ia;
    private VectorDrawableCompat ks;
    private VectorDrawableCompat ky;
    private VectorDrawableCompat la;
    private VectorDrawableCompat me;
    private VectorDrawableCompat mt;
    private VectorDrawableCompat ne;
    private VectorDrawableCompat nv;
    private VectorDrawableCompat nh;
    private VectorDrawableCompat nj;
    private VectorDrawableCompat nm;
    private VectorDrawableCompat ny;
    private VectorDrawableCompat nc;
    private VectorDrawableCompat nd;
    private VectorDrawableCompat oh;
    private VectorDrawableCompat ok;
    private VectorDrawableCompat or;
    private VectorDrawableCompat md;
    private VectorDrawableCompat ma;
    private VectorDrawableCompat mi;
    private VectorDrawableCompat mn;
    private VectorDrawableCompat ms;
    private VectorDrawableCompat mo;
    private VectorDrawableCompat pa;
    private VectorDrawableCompat ri;
    private VectorDrawableCompat sc;
    private VectorDrawableCompat sd;
    private VectorDrawableCompat tn;
    private VectorDrawableCompat tx;
    private VectorDrawableCompat ut;
    private VectorDrawableCompat vt;
    private VectorDrawableCompat va;
    private VectorDrawableCompat wa;
    private VectorDrawableCompat wv;
    private VectorDrawableCompat wi;
    private Canvas canv;
    private ImageView imgView;
    private int are = 148;
    private int gee = 0;
    private int bee = 0;
    private int deltaGee = 221;
    private int deltaAre = -72;
    public UnitedState(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        unitedStates = VectorDrawableCompat.create(getResources(), R.drawable.us, null);
        al = VectorDrawableCompat.create(getResources(), R.drawable.al, null);
        ak = VectorDrawableCompat.create(getResources(), R.drawable.ak, null);
        az = VectorDrawableCompat.create(getResources(), R.drawable.az, null);
        ar = VectorDrawableCompat.create(getResources(), R.drawable.ar, null);
        ca = VectorDrawableCompat.create(getResources(), R.drawable.ca, null);
        co = VectorDrawableCompat.create(getResources(), R.drawable.co, null);
        ct = VectorDrawableCompat.create(getResources(), R.drawable.ct, null);
        de = VectorDrawableCompat.create(getResources(), R.drawable.de, null);
        dc = VectorDrawableCompat.create(getResources(), R.drawable.dc, null);
        fl = VectorDrawableCompat.create(getResources(), R.drawable.fl, null);
        ga = VectorDrawableCompat.create(getResources(), R.drawable.ga, null);
        hi = VectorDrawableCompat.create(getResources(), R.drawable.hi, null);
        id = VectorDrawableCompat.create(getResources(), R.drawable.id, null);
        il = VectorDrawableCompat.create(getResources(), R.drawable.il, null);
        in = VectorDrawableCompat.create(getResources(), R.drawable.in, null);
        ia = VectorDrawableCompat.create(getResources(), R.drawable.ia, null);
        ks = VectorDrawableCompat.create(getResources(), R.drawable.ks, null);
        ky = VectorDrawableCompat.create(getResources(), R.drawable.ky, null);
        la = VectorDrawableCompat.create(getResources(), R.drawable.la, null);
        me = VectorDrawableCompat.create(getResources(), R.drawable.me, null);
        mt = VectorDrawableCompat.create(getResources(), R.drawable.mt, null);
        ne = VectorDrawableCompat.create(getResources(), R.drawable.ne, null);
        nv = VectorDrawableCompat.create(getResources(), R.drawable.nv, null);
        nh = VectorDrawableCompat.create(getResources(), R.drawable.nh, null);
        nj = VectorDrawableCompat.create(getResources(), R.drawable.nj, null);
        nm = VectorDrawableCompat.create(getResources(), R.drawable.nm, null);
        ny = VectorDrawableCompat.create(getResources(), R.drawable.ny, null);
        nc = VectorDrawableCompat.create(getResources(), R.drawable.nc, null);
        nd = VectorDrawableCompat.create(getResources(), R.drawable.nd, null);
        oh = VectorDrawableCompat.create(getResources(), R.drawable.oh, null);
        ok = VectorDrawableCompat.create(getResources(), R.drawable.ok, null);
        or = VectorDrawableCompat.create(getResources(), R.drawable.or, null);
        md = VectorDrawableCompat.create(getResources(), R.drawable.md, null);
        ma = VectorDrawableCompat.create(getResources(), R.drawable.ma, null);
        mi = VectorDrawableCompat.create(getResources(), R.drawable.mi, null);
        mn = VectorDrawableCompat.create(getResources(), R.drawable.mn, null);
        ms = VectorDrawableCompat.create(getResources(), R.drawable.ms, null);
        mo = VectorDrawableCompat.create(getResources(), R.drawable.mo, null);
        pa = VectorDrawableCompat.create(getResources(), R.drawable.pa, null);
        ri = VectorDrawableCompat.create(getResources(), R.drawable.ri, null);
        sc = VectorDrawableCompat.create(getResources(), R.drawable.sc, null);
        sd = VectorDrawableCompat.create(getResources(), R.drawable.sd, null);
        tn = VectorDrawableCompat.create(getResources(), R.drawable.tn, null);
        tx = VectorDrawableCompat.create(getResources(), R.drawable.tx, null);
        ut = VectorDrawableCompat.create(getResources(), R.drawable.ut, null);
        vt = VectorDrawableCompat.create(getResources(), R.drawable.vt, null);
        va = VectorDrawableCompat.create(getResources(), R.drawable.ca, null);
        wa = VectorDrawableCompat.create(getResources(), R.drawable.wa, null);
        wv = VectorDrawableCompat.create(getResources(), R.drawable.wv, null);
        wi = VectorDrawableCompat.create(getResources(), R.drawable.wi, null);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canv = canvas;
        unitedStates.setBounds(50, 430, 350, 600);
        unitedStates.draw(canv);
        canv.save();
        canv.restore();
    }

    public void changeColor(String state, int distance){
        int color = Color.rgb(are+deltaAre*150/distance, gee+deltaGee*150/distance, bee);
        if(state.equals("AL")){al.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("AK")){ak.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("AZ")){az.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("AR")){ar.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("CA")){ca.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("CO")){co.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("CT")){ct.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("DE")){de.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("DC")){dc.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("FL")){fl.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("GA")){ga.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("HI")){hi.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("ID")){id.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("IL")){il.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("IN")){in.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("IA")){ia.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("KS")){ks.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("KY")){ky.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("LA")){la.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("ME")){me.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("MT")){mt.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("NE")){ne.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("NV")){nv.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("NH")){nh.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("NJ")){nj.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("NM")){nm.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("NY")){ny.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("NC")){nc.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("ND")){nd.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("OH")){oh.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("OK")){ok.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("OR")){or.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("MD")){md.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("MA")){ma.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("MI")){mi.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("MN")){mn.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("MS")){ms.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("MO")){mo.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("PA")){pa.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("RI")){ri.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("SC")){sc.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("SD")){sd.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("TN")){tn.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("TX")){tx.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("UT")){ut.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("VT")){vt.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("VA")){va.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("WA")){wa.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("WV")){wv.setColorFilter(color, PorterDuff.Mode.ADD);}
        if(state.equals("WI")){wi.setColorFilter(color, PorterDuff.Mode.ADD);}

        if(state.equals("AL")){al.draw(canv);}
        if(state.equals("AK")){ak.draw(canv);}
        if(state.equals("AZ")){az.draw(canv);}
        if(state.equals("AR")){ar.draw(canv);}
        if(state.equals("CA")){ca.draw(canv);}
        if(state.equals("CO")){co.draw(canv);}
        if(state.equals("CT")){ct.draw(canv);}
        if(state.equals("DE")){de.draw(canv);}
        if(state.equals("DC")){dc.draw(canv);}
        if(state.equals("FL")){fl.draw(canv);}
        if(state.equals("GA")){ga.draw(canv);}
        if(state.equals("HI")){hi.draw(canv);}
        if(state.equals("ID")){id.draw(canv);}
        if(state.equals("IL")){il.draw(canv);}
        if(state.equals("IN")){in.draw(canv);}
        if(state.equals("IA")){ia.draw(canv);}
        if(state.equals("KS")){ks.draw(canv);}
        if(state.equals("KY")){ky.draw(canv);}
        if(state.equals("LA")){la.draw(canv);}
        if(state.equals("ME")){me.draw(canv);}
        if(state.equals("MT")){mt.draw(canv);}
        if(state.equals("NE")){ne.draw(canv);}
        if(state.equals("NV")){nv.draw(canv);}
        if(state.equals("NH")){nh.draw(canv);}
        if(state.equals("NJ")){nj.draw(canv);}
        if(state.equals("NM")){nm.draw(canv);}
        if(state.equals("NY")){ny.draw(canv);}
        if(state.equals("NC")){nc.draw(canv);}
        if(state.equals("ND")){nd.draw(canv);}
        if(state.equals("OH")){oh.draw(canv);}
        if(state.equals("OK")){ok.draw(canv);}
        if(state.equals("OR")){or.draw(canv);}
        if(state.equals("MD")){md.draw(canv);}
        if(state.equals("MA")){ma.draw(canv);}
        if(state.equals("MI")){mi.draw(canv);}
        if(state.equals("MN")){mn.draw(canv);}
        if(state.equals("MS")){ms.draw(canv);}
        if(state.equals("MO")){mo.draw(canv);}
        if(state.equals("PA")){pa.draw(canv);}
        if(state.equals("RI")){ri.draw(canv);}
        if(state.equals("SC")){sc.draw(canv);}
        if(state.equals("SD")){sd.draw(canv);}
        if(state.equals("TN")){tn.draw(canv);}
        if(state.equals("TX")){tx.draw(canv);}
        if(state.equals("UT")){ut.draw(canv);}
        if(state.equals("VT")){vt.draw(canv);}
        if(state.equals("VA")){va.draw(canv);}
        if(state.equals("WA")){wa.draw(canv);}
        if(state.equals("WV")){wv.draw(canv);}
        if(state.equals("WI")){wi.draw(canv);}

        canv.save();
        canv.restore();
    }
}
