package com.google.android.material.internal;

import a8.e;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class StateListAnimator {
    public final ArrayList a;
    public t b;
    public ValueAnimator c;
    public final e d;

    public StateListAnimator() {
        this.a = new ArrayList();
        this.b = null;
        this.c = null;
        this.d = new e(this, 6);
    }

    public void addState(int[] arr_v, ValueAnimator valueAnimator0) {
        t t0 = new t(arr_v, valueAnimator0);
        valueAnimator0.addListener(this.d);
        this.a.add(t0);
    }

    public void jumpToCurrentState() {
        ValueAnimator valueAnimator0 = this.c;
        if(valueAnimator0 != null) {
            valueAnimator0.end();
            this.c = null;
        }
    }

    public void setState(int[] arr_v) {
        t t0;
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; true; ++v1) {
            t0 = null;
            if(v1 >= v) {
                break;
            }
            t t1 = (t)arrayList0.get(v1);
            if(StateSet.stateSetMatches(t1.a, arr_v)) {
                t0 = t1;
                break;
            }
        }
        t t2 = this.b;
        if(t0 == t2) {
            return;
        }
        if(t2 != null) {
            ValueAnimator valueAnimator0 = this.c;
            if(valueAnimator0 != null) {
                valueAnimator0.cancel();
                this.c = null;
            }
        }
        this.b = t0;
        if(t0 != null) {
            this.c = t0.b;
            t0.b.start();
        }
    }
}

