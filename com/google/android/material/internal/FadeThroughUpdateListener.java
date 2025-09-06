package com.google.android.material.internal;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import g.b;

@RestrictTo({Scope.LIBRARY_GROUP})
public class FadeThroughUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    public final View a;
    public final View b;
    public final float[] c;

    public FadeThroughUpdateListener(@Nullable View view0, @Nullable View view1) {
        this.a = view0;
        this.b = view1;
        this.c = new float[2];
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator0) {
        float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
        float[] arr_f = this.c;
        b.b(f, arr_f);
        View view0 = this.a;
        if(view0 != null) {
            view0.setAlpha(arr_f[0]);
        }
        View view1 = this.b;
        if(view1 != null) {
            view1.setAlpha(arr_f[1]);
        }
    }
}

