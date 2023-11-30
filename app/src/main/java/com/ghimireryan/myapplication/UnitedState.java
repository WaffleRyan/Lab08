package com.ghimireryan.myapplication;

import static android.graphics.Color.blue;
import static android.graphics.Color.rgb;

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
    private int[] colores;
    private Map<String, VectorDrawableCompat> stateMap;
    public UnitedState(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        colores = new int[]{rgb(9, 255, 38),
                rgb(57, 251, 9),
                rgb(79, 246, 0),
                rgb(95, 242, 0),
                rgb(108, 237, 0),
                rgb(119, 233, 0),
                rgb(129, 228, 0),
                rgb(138, 223, 0),
                rgb(146, 219, 0),
                rgb(154, 214, 0),
                rgb(160, 209, 0),
                rgb(167, 204, 0),
                rgb(173, 199, 0),
                rgb(178, 194, 0),
                rgb(184, 189, 0),
                rgb(188, 184, 0),
                rgb(193, 179, 0),
                rgb(197, 174, 0),
                rgb(201, 169, 0),
                rgb(205, 163, 0),
                rgb(209, 158, 0),
                rgb(212, 152, 0),
                rgb(215, 147, 0),
                rgb(218, 141, 0),
                rgb(220, 135, 0),
                rgb(223, 129, 0),
                rgb(225, 123, 0),
                rgb(227, 117, 0),
                rgb(228, 111, 0),
                rgb(230, 105, 0),
                rgb(231, 98, 0),
                rgb(232, 92, 0),
                rgb(232, 85, 0),
                rgb(233, 77, 0),
                rgb(233, 70, 0),
                rgb(233, 62, 0),
                rgb(232, 53, 0),
                rgb(232, 44, 0),
                rgb(231, 32, 6),
                rgb(230, 16, 16)};

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

        al.setTint(Color.rgb(247, 247, 233));
        ak.setTint(Color.rgb(247, 247, 233));
        az.setTint(Color.rgb(247, 247, 233));
        ar.setTint(Color.rgb(247, 247, 233));
        ca.setTint(Color.rgb(247, 247, 233));
        co.setTint(Color.rgb(247, 247, 233));
        ct.setTint(Color.rgb(247, 247, 233));
        de.setTint(Color.rgb(247, 247, 233));
        dc.setTint(Color.rgb(247, 247, 233));
        fl.setTint(Color.rgb(247, 247, 233));
        ga.setTint(Color.rgb(247, 247, 233));
        hi.setTint(Color.rgb(247, 247, 233));
        id.setTint(Color.rgb(247, 247, 233));
        il.setTint(Color.rgb(247, 247, 233));
        in.setTint(Color.rgb(247, 247, 233));
        ia.setTint(Color.rgb(247, 247, 233));
        ks.setTint(Color.rgb(247, 247, 233));
        ky.setTint(Color.rgb(247, 247, 233));
        la.setTint(Color.rgb(247, 247, 233));
        me.setTint(Color.rgb(247, 247, 233));
        mt.setTint(Color.rgb(247, 247, 233));
        ne.setTint(Color.rgb(247, 247, 233));
        nv.setTint(Color.rgb(247, 247, 233));
        nh.setTint(Color.rgb(247, 247, 233));
        nj.setTint(Color.rgb(247, 247, 233));
        nm.setTint(Color.rgb(247, 247, 233));
        ny.setTint(Color.rgb(247, 247, 233));
        nc.setTint(Color.rgb(247, 247, 233));
        nd.setTint(Color.rgb(247, 247, 233));
        oh.setTint(Color.rgb(247, 247, 233));
        ok.setTint(Color.rgb(247, 247, 233));
        or.setTint(Color.rgb(247, 247, 233));
        md.setTint(Color.rgb(247, 247, 233));
        ma.setTint(Color.rgb(247, 247, 233));
        mi.setTint(Color.rgb(247, 247, 233));
        mn.setTint(Color.rgb(247, 247, 233));
        ms.setTint(Color.rgb(247, 247, 233));
        mo.setTint(Color.rgb(247, 247, 233));
        pa.setTint(Color.rgb(247, 247, 233));
        ri.setTint(Color.rgb(247, 247, 233));
        sc.setTint(Color.rgb(247, 247, 233));
        sd.setTint(Color.rgb(247, 247, 233));
        tn.setTint(Color.rgb(247, 247, 233));
        tx.setTint(Color.rgb(247, 247, 233));
        ut.setTint(Color.rgb(247, 247, 233));
        vt.setTint(Color.rgb(247, 247, 233));
        va.setTint(Color.rgb(247, 247, 233));
        wa.setTint(Color.rgb(247, 247, 233));
        wv.setTint(Color.rgb(247, 247, 233));
        wi.setTint(Color.rgb(247, 247, 233));
        wy.setTint(Color.rgb(247, 247, 233));

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
        stateMap.put("WY", wy);

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

        unitedStates.draw(canvas);
    }
VectorDrawableCompat stateo;
    public void changeColor(String state, int distance){
        int disto = (int) (distance * 0.008125 *2.5);
        if(disto>39){
            disto = 39;
        }
        if (stateMap.containsKey(state)) {
            stateo = stateMap.get(state);
            if(distance==0){
                stateo.setTint(Color.rgb(9, 94, 222));
            }
            else {
                stateo.setTint(colores[(int) (disto)]);
            }
            invalidate();
        }
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

        invalidate();
    }


}
