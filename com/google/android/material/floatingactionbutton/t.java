package com.google.android.material.floatingactionbutton;

import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class t implements ViewTreeObserver.OnPreDrawListener {
    public final int a;
    public final Object b;

    public t(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public final boolean onPreDraw() {
        if(this.a != 0) {
            ((CoordinatorLayout)this.b).g(0);
            return true;
        }
        x x0 = (x)this.b;
        float f = x0.v.getRotation();
        if(x0.o != f) {
            x0.o = f;
            x0.p();
        }
        return true;
    }
}

