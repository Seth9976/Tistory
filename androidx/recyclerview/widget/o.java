package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class o extends AnimatorListenerAdapter {
    public final ViewHolder a;
    public final ViewPropertyAnimator b;
    public final View c;
    public final DefaultItemAnimator d;

    public o(View view0, ViewPropertyAnimator viewPropertyAnimator0, DefaultItemAnimator defaultItemAnimator0, ViewHolder recyclerView$ViewHolder0) {
        this.d = defaultItemAnimator0;
        this.a = recyclerView$ViewHolder0;
        this.b = viewPropertyAnimator0;
        this.c = view0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.d.dispatchRemoveFinished(this.a);
        this.d.q.remove(this.a);
        this.d.c();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
    }
}

