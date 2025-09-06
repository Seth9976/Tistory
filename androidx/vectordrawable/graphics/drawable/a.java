package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2.AnimationCallback;
import android.graphics.drawable.Drawable;

public final class a extends Animatable2.AnimationCallback {
    public final AnimationCallback a;

    public a(AnimationCallback animatable2Compat$AnimationCallback0) {
        this.a = animatable2Compat$AnimationCallback0;
        super();
    }

    @Override  // android.graphics.drawable.Animatable2$AnimationCallback
    public final void onAnimationEnd(Drawable drawable0) {
        this.a.onAnimationEnd(drawable0);
    }

    @Override  // android.graphics.drawable.Animatable2$AnimationCallback
    public final void onAnimationStart(Drawable drawable0) {
        this.a.onAnimationStart(drawable0);
    }
}

