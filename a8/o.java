package a8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class o extends AnimatorListenerAdapter {
    public final p a;

    public o(p p0) {
        this.a = p0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        super.onAnimationEnd(animator0);
        p p0 = this.a;
        p0.a();
        b b0 = p0.k;
        if(b0 != null) {
            b0.onAnimationEnd(p0.a);
        }
    }
}

