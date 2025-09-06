package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import com.google.android.material.R.attr;
import com.google.android.material.R.integer;

public abstract class k {
    public static final int[] a;

    static {
        k.a = new int[]{0x1010448};
    }

    public static void a(AppBarLayout appBarLayout0, float f) {
        int v = appBarLayout0.getResources().getInteger(integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator0 = new StateListAnimator();
        stateListAnimator0.addState(new int[]{0x101009E, attr.state_liftable, -attr.state_lifted}, ObjectAnimator.ofFloat(appBarLayout0, "elevation", new float[]{0.0f}).setDuration(((long)v)));
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(appBarLayout0, "elevation", new float[]{f}).setDuration(((long)v));
        stateListAnimator0.addState(new int[]{0x101009E}, objectAnimator0);
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(appBarLayout0, "elevation", new float[]{0.0f}).setDuration(0L);
        stateListAnimator0.addState(new int[0], objectAnimator1);
        appBarLayout0.setStateListAnimator(stateListAnimator0);
    }
}

