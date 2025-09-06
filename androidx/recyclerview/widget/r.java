package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class r extends AnimatorListenerAdapter {
    public final t a;
    public final ViewPropertyAnimator b;
    public final View c;
    public final DefaultItemAnimator d;

    public r(DefaultItemAnimator defaultItemAnimator0, t t0, ViewPropertyAnimator viewPropertyAnimator0, View view0) {
        this.d = defaultItemAnimator0;
        this.a = t0;
        this.b = viewPropertyAnimator0;
        this.c = view0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        this.d.dispatchChangeFinished(this.a.a, true);
        this.d.r.remove(this.a.a);
        this.d.c();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
    }
}

