package com.google.android.material.behavior;

import android.view.View;
import androidx.core.view.ViewCompat;

public final class c implements Runnable {
    public final View a;
    public final boolean b;
    public final SwipeDismissBehavior c;

    public c(SwipeDismissBehavior swipeDismissBehavior0, View view0, boolean z) {
        this.c = swipeDismissBehavior0;
        this.a = view0;
        this.b = z;
    }

    @Override
    public final void run() {
        SwipeDismissBehavior swipeDismissBehavior0 = this.c;
        View view0 = this.a;
        if(swipeDismissBehavior0.o != null && swipeDismissBehavior0.o.continueSettling(true)) {
            ViewCompat.postOnAnimation(view0, this);
            return;
        }
        if(this.b) {
            OnDismissListener swipeDismissBehavior$OnDismissListener0 = swipeDismissBehavior0.p;
            if(swipeDismissBehavior$OnDismissListener0 != null) {
                swipeDismissBehavior$OnDismissListener0.onDismiss(view0);
            }
        }
    }
}

