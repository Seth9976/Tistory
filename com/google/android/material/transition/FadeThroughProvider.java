package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class FadeThroughProvider implements VisibilityAnimatorProvider {
    public float a;

    public FadeThroughProvider() {
        this.a = 0.35f;
    }

    @Override  // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup0, @NonNull View view0) {
        float f = Float.compare(view0.getAlpha(), 0.0f) == 0 ? 1.0f : view0.getAlpha();
        float f1 = this.a;
        Animator animator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ((ValueAnimator)animator0).addUpdateListener(new f(view0, 0.0f, f, f1, 1.0f, 0));
        animator0.addListener(new e(1, f, view0));
        return animator0;
    }

    @Override  // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup0, @NonNull View view0) {
        float f = Float.compare(view0.getAlpha(), 0.0f) == 0 ? 1.0f : view0.getAlpha();
        float f1 = this.a;
        Animator animator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ((ValueAnimator)animator0).addUpdateListener(new f(view0, f, 0.0f, 0.0f, f1, 0));
        animator0.addListener(new e(1, f, view0));
        return animator0;
    }

    public float getProgressThreshold() {
        return this.a;
    }

    public void setProgressThreshold(@FloatRange(from = 0.0, to = 1.0) float f) {
        this.a = f;
    }
}

