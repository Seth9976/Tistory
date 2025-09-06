package androidx.recyclerview.widget;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.ValueAnimator;

public abstract class n0 implements Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final ViewHolder e;
    public final int f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k;
    public boolean l;
    public float m;

    public n0(ViewHolder recyclerView$ViewHolder0, int v, float f, float f1, float f2, float f3) {
        this.k = false;
        this.l = false;
        this.f = v;
        this.e = recyclerView$ViewHolder0;
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.g = valueAnimator0;
        valueAnimator0.addUpdateListener(new m0(this));
        valueAnimator0.setTarget(recyclerView$ViewHolder0.itemView);
        valueAnimator0.addListener(this);
        this.m = 0.0f;
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationCancel(Animator animator0) {
        this.m = 1.0f;
    }

    @Override  // android.animation.Animator$AnimatorListener
    public void onAnimationEnd(Animator animator0) {
        if(!this.l) {
            this.e.setIsRecyclable(true);
        }
        this.l = true;
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationRepeat(Animator animator0) {
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationStart(Animator animator0) {
    }
}

