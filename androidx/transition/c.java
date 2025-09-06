package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import androidx.core.view.ViewCompat;

public final class c extends AnimatorListenerAdapter {
    public boolean a;
    public final View b;
    public final Rect c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public c(View view0, Rect rect0, int v, int v1, int v2, int v3) {
        this.b = view0;
        this.c = rect0;
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.g = v3;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationCancel(Animator animator0) {
        this.a = true;
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        if(!this.a) {
            ViewCompat.setClipBounds(this.b, this.c);
            r0.a(this.b, this.d, this.e, this.f, this.g);
        }
    }
}

