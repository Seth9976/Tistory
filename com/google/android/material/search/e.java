package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;

public final class e extends AnimatorListenerAdapter {
    public final h a;

    public e(h h0) {
        this.a = h0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        Iterator iterator0 = this.a.a.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
        }
    }
}

