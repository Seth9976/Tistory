package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class p extends AnimatorListenerAdapter {
    public final ViewHolder a;
    public final View b;
    public final ViewPropertyAnimator c;
    public final DefaultItemAnimator d;

    public p(View view0, ViewPropertyAnimator viewPropertyAnimator0, DefaultItemAnimator defaultItemAnimator0, ViewHolder recyclerView$ViewHolder0) {
        this.d = defaultItemAnimator0;
        this.a = recyclerView$ViewHolder0;
        this.b = view0;
        this.c = viewPropertyAnimator0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationCancel(Animator animator0) {
        this.b.setAlpha(1.0f);
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.c.setListener(null);
        this.d.dispatchAddFinished(this.a);
        this.d.o.remove(this.a);
        this.d.c();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
    }
}

