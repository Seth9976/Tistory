package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionValues;
import com.google.android.material.R.attr;
import com.google.android.material.animation.AnimationUtils;

public final class MaterialFade extends l {
    public static final int N;
    public static final int O;
    public static final int P;
    public static final int Q;

    static {
        MaterialFade.N = attr.motionDurationMedium4;
        MaterialFade.O = attr.motionDurationShort3;
        MaterialFade.P = attr.motionEasingEmphasizedDecelerateInterpolator;
        MaterialFade.Q = attr.motionEasingEmphasizedAccelerateInterpolator;
    }

    public MaterialFade() {
        FadeProvider fadeProvider0 = new FadeProvider();
        fadeProvider0.setIncomingEndThreshold(0.3f);
        ScaleProvider scaleProvider0 = new ScaleProvider();
        scaleProvider0.setScaleOnDisappear(false);
        scaleProvider0.setIncomingStartScale(0.8f);
        super(fadeProvider0, scaleProvider0);
    }

    public void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider0) {
        this.M.add(visibilityAnimatorProvider0);
    }

    public void clearAdditionalAnimatorProvider() {
        this.M.clear();
    }

    @NonNull
    public VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return this.K;
    }

    @Nullable
    public VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.L;
    }

    @Override  // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        return this.o(viewGroup0, view0, true);
    }

    @Override  // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        return this.o(viewGroup0, view0, false);
    }

    @Override  // com.google.android.material.transition.l
    public final TimeInterpolator p() {
        return AnimationUtils.LINEAR_INTERPOLATOR;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.transition.l
    public final int q(boolean z) {
        return z ? MaterialFade.N : MaterialFade.O;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.transition.l
    public final int r(boolean z) {
        return z ? MaterialFade.P : MaterialFade.Q;
    }

    public boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider0) {
        return this.M.remove(visibilityAnimatorProvider0);
    }

    public void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider0) {
        this.L = visibilityAnimatorProvider0;
    }
}

