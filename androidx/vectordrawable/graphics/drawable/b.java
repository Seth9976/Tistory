package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

public final class b extends AnimatorListenerAdapter {
    public final AnimatedVectorDrawableCompat a;

    public b(AnimatedVectorDrawableCompat animatedVectorDrawableCompat0) {
        this.a = animatedVectorDrawableCompat0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat0 = this.a;
        ArrayList arrayList0 = new ArrayList(animatedVectorDrawableCompat0.e);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((AnimationCallback)arrayList0.get(v1)).onAnimationEnd(animatedVectorDrawableCompat0);
        }
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat0 = this.a;
        ArrayList arrayList0 = new ArrayList(animatedVectorDrawableCompat0.e);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((AnimationCallback)arrayList0.get(v1)).onAnimationStart(animatedVectorDrawableCompat0);
        }
    }
}

