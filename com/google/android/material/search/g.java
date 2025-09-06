package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class g extends AnimatorListenerAdapter {
    public final int a;
    public final SearchBar b;
    public final h c;

    public g(h h0, SearchBar searchBar0, int v) {
        this.a = v;
        this.c = h0;
        this.b = searchBar0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        if(this.a != 0) {
            this.b.setVisibility(0);
            this.c.g = false;
            return;
        }
        this.c.f = false;
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
        if(this.a != 0) {
            this.b.stopOnLoadAnimation();
            return;
        }
        this.b.setVisibility(4);
    }
}

