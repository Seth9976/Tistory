package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.transition.d;
import com.google.android.material.transition.e;

@RequiresApi(21)
public final class FadeProvider implements VisibilityAnimatorProvider {
    public float a;

    public FadeProvider() {
        this.a = 1.0f;
    }

    @Override  // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup0, @NonNull View view0) {
        float f = Float.compare(view0.getAlpha(), 0.0f) == 0 ? 1.0f : view0.getAlpha();
        float f1 = this.a;
        Animator animator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ((ValueAnimator)animator0).addUpdateListener(new d(view0, 0.0f, f, f1, 1));
        animator0.addListener(new e(4, f, view0));
        return animator0;
    }

    @Override  // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup0, @NonNull View view0) {
        float f = Float.compare(view0.getAlpha(), 0.0f) == 0 ? 1.0f : view0.getAlpha();
        Animator animator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ((ValueAnimator)animator0).addUpdateListener(new d(view0, f, 0.0f, 1.0f, 1));
        animator0.addListener(new e(4, f, view0));
        return animator0;
    }

    public float getIncomingEndThreshold() {
        return this.a;
    }

    public void setIncomingEndThreshold(float f) {
        this.a = f;
    }
}

