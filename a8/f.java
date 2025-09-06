package a8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class f extends AnimatorListenerAdapter {
    public final h a;

    public f(h h0) {
        this.a = h0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        super.onAnimationEnd(animator0);
        h h0 = this.a;
        h0.a();
        b b0 = h0.k;
        if(b0 != null) {
            b0.onAnimationEnd(h0.a);
        }
    }
}

