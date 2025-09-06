package androidx.swiperefreshlayout.widget;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;

public final class c implements Animator.AnimatorListener {
    public final d a;
    public final CircularProgressDrawable b;

    public c(CircularProgressDrawable circularProgressDrawable0, d d0) {
        this.b = circularProgressDrawable0;
        this.a = d0;
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationCancel(Animator animator0) {
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationEnd(Animator animator0) {
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationRepeat(Animator animator0) {
        CircularProgressDrawable circularProgressDrawable0 = this.b;
        d d0 = this.a;
        circularProgressDrawable0.a(1.0f, d0, true);
        d0.k = d0.e;
        d0.l = d0.f;
        d0.m = d0.g;
        d0.a((d0.j + 1) % d0.i.length);
        if(circularProgressDrawable0.f) {
            circularProgressDrawable0.f = false;
            animator0.cancel();
            animator0.setDuration(0x534L);
            animator0.start();
            if(d0.n) {
                d0.n = false;
            }
        }
        else {
            ++circularProgressDrawable0.e;
        }
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationStart(Animator animator0) {
        this.b.e = 0.0f;
    }
}

