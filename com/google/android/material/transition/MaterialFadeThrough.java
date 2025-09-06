package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionValues;
import com.google.android.material.R.attr;

public final class MaterialFadeThrough extends l {
    public static final int N;
    public static final int O;

    static {
        MaterialFadeThrough.N = attr.motionDurationLong1;
        MaterialFadeThrough.O = attr.motionEasingEmphasizedInterpolator;
    }

    public MaterialFadeThrough() {
        FadeThroughProvider fadeThroughProvider0 = new FadeThroughProvider();
        ScaleProvider scaleProvider0 = new ScaleProvider();
        scaleProvider0.setScaleOnDisappear(false);
        scaleProvider0.setIncomingStartScale(0.92f);
        super(fadeThroughProvider0, scaleProvider0);
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
    public final int q(boolean z) {
        return MaterialFadeThrough.N;
    }

    @Override  // com.google.android.material.transition.l
    public final int r(boolean z) {
        return MaterialFadeThrough.O;
    }

    public boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider0) {
        return this.M.remove(visibilityAnimatorProvider0);
    }

    public void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider0) {
        this.L = visibilityAnimatorProvider0;
    }
}

