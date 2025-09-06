package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class e extends AnimatorListenerAdapter {
    public final int a;
    public final View b;
    public final float c;

    public e(int v, float f, View view0) {
        this.a = v;
        this.b = view0;
        this.c = f;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        switch(this.a) {
            case 0: {
                this.b.setAlpha(this.c);
                return;
            }
            case 1: {
                this.b.setAlpha(this.c);
                return;
            }
            case 2: {
                this.b.setTranslationX(this.c);
                return;
            }
            case 3: {
                this.b.setTranslationY(this.c);
                return;
            }
            case 4: {
                this.b.setAlpha(this.c);
                return;
            }
            case 5: {
                this.b.setAlpha(this.c);
                return;
            }
            case 6: {
                this.b.setTranslationX(this.c);
                return;
            }
            default: {
                this.b.setTranslationY(this.c);
            }
        }
    }
}

