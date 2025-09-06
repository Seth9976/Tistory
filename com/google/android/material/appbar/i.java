package com.google.android.material.appbar;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;

public final class i implements Runnable {
    public final CoordinatorLayout a;
    public final View b;
    public final HeaderBehavior c;

    public i(HeaderBehavior headerBehavior0, CoordinatorLayout coordinatorLayout0, View view0) {
        this.c = headerBehavior0;
        this.a = coordinatorLayout0;
        this.b = view0;
    }

    @Override
    public final void run() {
        View view0 = this.b;
        if(view0 != null) {
            HeaderBehavior headerBehavior0 = this.c;
            OverScroller overScroller0 = headerBehavior0.s;
            if(overScroller0 != null) {
                boolean z = overScroller0.computeScrollOffset();
                CoordinatorLayout coordinatorLayout0 = this.a;
                if(z) {
                    headerBehavior0.g(coordinatorLayout0, view0, headerBehavior0.s.getCurrY());
                    ViewCompat.postOnAnimation(view0, this);
                    return;
                }
                headerBehavior0.e(coordinatorLayout0, view0);
            }
        }
    }
}

