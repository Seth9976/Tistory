package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class a extends AnimatorListenerAdapter {
    public final int a;
    public final BottomAppBar b;

    public a(BottomAppBar bottomAppBar0, int v) {
        this.a = v;
        this.b = bottomAppBar0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public void onAnimationEnd(Animator animator0) {
        BottomAppBar bottomAppBar0 = this.b;
        switch(this.a) {
            case 1: {
                bottomAppBar0.getClass();
                bottomAppBar0.f0 = null;
                return;
            }
            case 2: {
                bottomAppBar0.getClass();
                bottomAppBar0.t0 = false;
                bottomAppBar0.g0 = null;
                return;
            }
            default: {
                super.onAnimationEnd(animator0);
            }
        }
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
        BottomAppBar bottomAppBar0 = this.b;
        switch(this.a) {
            case 0: {
                if(!bottomAppBar0.t0) {
                    bottomAppBar0.A(bottomAppBar0.h0, bottomAppBar0.u0);
                }
                return;
            }
            case 1: {
                bottomAppBar0.getClass();
                return;
            }
            case 2: {
                bottomAppBar0.getClass();
                return;
            }
            default: {
                bottomAppBar0.z0.onAnimationStart(animator0);
                FloatingActionButton floatingActionButton0 = bottomAppBar0.w();
                if(floatingActionButton0 != null) {
                    floatingActionButton0.setTranslationX(bottomAppBar0.getFabTranslationX());
                }
            }
        }
    }
}

