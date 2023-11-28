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

import java.util.HashMap;
import java.util.Map;

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
    private VectorDrawableCompat wy;
    private ImageView imgView;
    private int are = 148;
    private int gee = 0;
    private int bee = 0;
    private int deltaGee = 221;
    private int deltaAre = -72;
    private Map<String, VectorDrawableCompat> stateMap;
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
        va = VectorDrawableCompat.create(getResources(), R.drawable.va, null);
        wa = VectorDrawableCompat.create(getResources(), R.drawable.wa, null);
        wv = VectorDrawableCompat.create(getResources(), R.drawable.wv, null);
        wi = VectorDrawableCompat.create(getResources(), R.drawable.wi, null);
        wy = VectorDrawableCompat.create(getResources(), R.drawable.wy, null);

        al.setBounds(50, 130, 950, 600);
        ak.setBounds(50, 130, 950, 600);
        az.setBounds(50, 130, 950, 600);
        ar.setBounds(50, 130, 950, 600);
        ca.setBounds(50, 130, 950, 600);
        co.setBounds(50, 130, 950, 600);
        ct.setBounds(50, 130, 950, 600);
        de.setBounds(50, 130, 950, 600);
        dc.setBounds(50, 130, 950, 600);
        fl.setBounds(50, 130, 950, 600);
        ga.setBounds(50, 130, 950, 600);
        hi.setBounds(50, 130, 950, 600);
        id.setBounds(50, 130, 950, 600);
        il.setBounds(50, 130, 950, 600);
        in.setBounds(50, 130, 950, 600);
        ia.setBounds(50, 130, 950, 600);
        ks.setBounds(50, 130, 950, 600);
        ky.setBounds(50, 130, 950, 600);
        la.setBounds(50, 130, 950, 600);
        me.setBounds(50, 130, 950, 600);
        mt.setBounds(50, 130, 950, 600);
        ne.setBounds(50, 130, 950, 600);
        nv.setBounds(50, 130, 950, 600);
        nh.setBounds(50, 130, 950, 600);
        nj.setBounds(50, 130, 950, 600);
        nm.setBounds(50, 130, 950, 600);
        ny.setBounds(50, 130, 950, 600);
        nc.setBounds(50, 130, 950, 600);
        nd.setBounds(50, 130, 950, 600);
        oh.setBounds(50, 130, 950, 600);
        ok.setBounds(50, 130, 950, 600);
        or.setBounds(50, 130, 950, 600);
        md.setBounds(50, 130, 950, 600);
        ma.setBounds(50, 130, 950, 600);
        mi.setBounds(50, 130, 950, 600);
        mn.setBounds(50, 130, 950, 600);
        ms.setBounds(50, 130, 950, 600);
        mo.setBounds(50, 130, 950, 600);
        pa.setBounds(50, 130, 950, 600);
        ri.setBounds(50, 130, 950, 600);
        sc.setBounds(50, 130, 950, 600);
        sd.setBounds(50, 130, 950, 600);
        tn.setBounds(50, 130, 950, 600);
        tx.setBounds(50, 130, 950, 600);
        ut.setBounds(50, 130, 950, 600);
        vt.setBounds(50, 130, 950, 600);
        va.setBounds(50, 130, 950, 600);
        wa.setBounds(50, 130, 950, 600);
        wv.setBounds(50, 130, 950, 600);
        wi.setBounds(50, 130, 950, 600);
        wy.setBounds(50, 130, 950, 600);
        unitedStates.setBounds(50, 130, 950, 600);

        stateMap = new HashMap<>();
        stateMap.put("AL", al);
        stateMap.put("AK", ak);
        stateMap.put("AZ", az);
        stateMap.put("AR", ar);
        stateMap.put("CA", ca);
        stateMap.put("CO", co);
        stateMap.put("CT", ct);
        stateMap.put("DE", de);
        stateMap.put("DC", dc);
        stateMap.put("FL", fl);
        stateMap.put("GA", ga);
        stateMap.put("HI", hi);
        stateMap.put("ID", id);
        stateMap.put("IL", il);
        stateMap.put("IN", in);
        stateMap.put("IA", ia);
        stateMap.put("KS", ks);
        stateMap.put("KY", ky);
        stateMap.put("LA", la);
        stateMap.put("ME", me);
        stateMap.put("MT", mt);
        stateMap.put("NE", ne);
        stateMap.put("NV", nv);
        stateMap.put("NH", nh);
        stateMap.put("NJ", nj);
        stateMap.put("NM", nm);
        stateMap.put("NY", ny);
        stateMap.put("NC", nc);
        stateMap.put("ND", nd);
        stateMap.put("OH", oh);
        stateMap.put("OK", ok);
        stateMap.put("OR", or);
        stateMap.put("MD", md);
        stateMap.put("MA", ma);
        stateMap.put("MI", mi);
        stateMap.put("MN", mn);
        stateMap.put("MS", ms);
        stateMap.put("MO", mo);
        stateMap.put("PA", pa);
        stateMap.put("RI", ri);
        stateMap.put("SC", sc);
        stateMap.put("SD", sd);
        stateMap.put("TN", tn);
        stateMap.put("TX", tx);
        stateMap.put("UT", ut);
        stateMap.put("VT", vt);
        stateMap.put("VA", va);
        stateMap.put("WA", wa);
        stateMap.put("WV", wv);
        stateMap.put("WI", wi);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for(VectorDrawableCompat v : stateMap.values()) {
            v.draw(canvas);
        }
        if((stateo!=null)){
            stateo.draw(canvas);
        }
    }
VectorDrawableCompat stateo;
    public void changeColor(String state, int distance){
        int color = Color.rgb(are+deltaAre*150/distance, gee+deltaGee*150/distance, bee);

        if (stateMap.containsKey(state)) {
            stateo = stateMap.get(state);
            stateo.setTint(color);
            //stateo.setColorFilter(color, PorterDuff.Mode.DST_ATOP);
            invalidate();
        }
//        if(state.equals("AL")){al.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("AK")){ak.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("AZ")){az.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("AR")){ar.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("CA")){ca.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("CO")){co.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("CT")){ct.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("DE")){de.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("DC")){dc.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("FL")){fl.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("GA")){ga.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("HI")){hi.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("ID")){id.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("IL")){il.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("IN")){in.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("IA")){ia.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("KS")){ks.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("KY")){ky.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("LA")){la.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("ME")){me.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("MT")){mt.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("NE")){ne.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("NV")){nv.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("NH")){nh.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("NJ")){nj.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("NM")){nm.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("NY")){ny.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("NC")){nc.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("ND")){nd.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("OH")){oh.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("OK")){ok.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("OR")){or.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("MD")){md.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("MA")){ma.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("MI")){mi.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("MN")){mn.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("MS")){ms.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("MO")){mo.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("PA")){pa.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("RI")){ri.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("SC")){sc.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("SD")){sd.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("TN")){tn.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("TX")){tx.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("UT")){ut.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("VT")){vt.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("VA")){va.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("WA")){wa.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("WV")){wv.setColorFilter(color, PorterDuff.Mode.ADD);}
//        if(state.equals("WI")){wi.setColorFilter(color, PorterDuff.Mode.ADD);}
//
//        if(state.equals("AL")){al.draw(canv);}
//        if(state.equals("AK")){ak.draw(canv);}
//        if(state.equals("AZ")){az.draw(canv);}
//        if(state.equals("AR")){ar.draw(canv);}
//        if(state.equals("CA")){ca.draw(canv);}
//        if(state.equals("CO")){co.draw(canv);}
//        if(state.equals("CT")){ct.draw(canv);}
//        if(state.equals("DE")){de.draw(canv);}
//        if(state.equals("DC")){dc.draw(canv);}
//        if(state.equals("FL")){fl.draw(canv);}
//        if(state.equals("GA")){ga.draw(canv);}
//        if(state.equals("HI")){hi.draw(canv);}
//        if(state.equals("ID")){id.draw(canv);}
//        if(state.equals("IL")){il.draw(canv);}
//        if(state.equals("IN")){in.draw(canv);}
//        if(state.equals("IA")){ia.draw(canv);}
//        if(state.equals("KS")){ks.draw(canv);}
//        if(state.equals("KY")){ky.draw(canv);}
//        if(state.equals("LA")){la.draw(canv);}
//        if(state.equals("ME")){me.draw(canv);}
//        if(state.equals("MT")){mt.draw(canv);}
//        if(state.equals("NE")){ne.draw(canv);}
//        if(state.equals("NV")){nv.draw(canv);}
//        if(state.equals("NH")){nh.draw(canv);}
//        if(state.equals("NJ")){nj.draw(canv);}
//        if(state.equals("NM")){nm.draw(canv);}
//        if(state.equals("NY")){ny.draw(canv);}
//        if(state.equals("NC")){nc.draw(canv);}
//        if(state.equals("ND")){nd.draw(canv);}
//        if(state.equals("OH")){oh.draw(canv);}
//        if(state.equals("OK")){ok.draw(canv);}
//        if(state.equals("OR")){or.draw(canv);}
//        if(state.equals("MD")){md.draw(canv);}
//        if(state.equals("MA")){ma.draw(canv);}
//        if(state.equals("MI")){mi.draw(canv);}
//        if(state.equals("MN")){mn.draw(canv);}
//        if(state.equals("MS")){ms.draw(canv);}
//        if(state.equals("MO")){mo.draw(canv);}
//        if(state.equals("PA")){pa.draw(canv);}
//        if(state.equals("RI")){ri.draw(canv);}
//        if(state.equals("SC")){sc.draw(canv);}
//        if(state.equals("SD")){sd.draw(canv);}
//        if(state.equals("TN")){tn.draw(canv);}
//        if(state.equals("TX")){tx.draw(canv);}
//        if(state.equals("UT")){ut.draw(canv);}
//        if(state.equals("VT")){vt.draw(canv);}
//        if(state.equals("VA")){va.draw(canv);}
//        if(state.equals("WA")){wa.draw(canv);}
//        if(state.equals("WV")){wv.draw(canv);}
//        if(state.equals("WI")){wi.draw(canv);}
        //canv.save();
        //canv.restore();
    }

    public void resetMap(){
        
        al.setTintList(null);
        ak.setTintList(null);
        az.setTintList(null);
        ar.setTintList(null);
        ca.setTintList(null);
        co.setTintList(null);
        ct.setTintList(null);
        de.setTintList(null);
        dc.setTintList(null);
        fl.setTintList(null);
        ga.setTintList(null);
        hi.setTintList(null);
        id.setTintList(null);
        il.setTintList(null);
        in.setTintList(null);
        ia.setTintList(null);
        ks.setTintList(null);
        ky.setTintList(null);
        la.setTintList(null);
        me.setTintList(null);
        mt.setTintList(null);
        ne.setTintList(null);
        nv.setTintList(null);
        nh.setTintList(null);
        nj.setTintList(null);
        nm.setTintList(null);
        ny.setTintList(null);
        nc.setTintList(null);
        nd.setTintList(null);
        oh.setTintList(null);
        ok.setTintList(null);
        or.setTintList(null);
        md.setTintList(null);
        ma.setTintList(null);
        mi.setTintList(null);
        mn.setTintList(null);
        ms.setTintList(null);
        mo.setTintList(null);
        pa.setTintList(null);
        ri.setTintList(null);
        sc.setTintList(null);
        sd.setTintList(null);
        tn.setTintList(null);
        tx.setTintList(null);
        ut.setTintList(null);
        vt.setTintList(null);
        va.setTintList(null);
        wa.setTintList(null);
        wv.setTintList(null);
        wi.setTintList(null);
        wy.setTintList(null);
    }


}
