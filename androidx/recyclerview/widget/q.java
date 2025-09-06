package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class q extends AnimatorListenerAdapter {
    public final ViewHolder a;
    public final int b;
    public final View c;
    public final int d;
    public final ViewPropertyAnimator e;
    public final DefaultItemAnimator f;

    public q(DefaultItemAnimator defaultItemAnimator0, ViewHolder recyclerView$ViewHolder0, int v, View view0, int v1, ViewPropertyAnimator viewPropertyAnimator0) {
        this.f = defaultItemAnimator0;
        this.a = recyclerView$ViewHolder0;
        this.b = v;
        this.c = view0;
        this.d = v1;
        this.e = viewPropertyAnimator0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationCancel(Animator animator0) {
        View view0 = this.c;
        if(this.b != 0) {
            view0.setTranslationX(0.0f);
        }
        if(this.d != 0) {
            view0.setTranslationY(0.0f);
        }
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.e.setListener(null);
        this.f.dispatchMoveFinished(this.a);
        this.f.p.remove(this.a);
        this.f.c();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
    }
}

