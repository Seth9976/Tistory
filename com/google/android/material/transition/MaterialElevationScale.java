package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionValues;

public final class MaterialElevationScale extends l {
    public final boolean N;

    public MaterialElevationScale(boolean z) {
        ScaleProvider scaleProvider0 = new ScaleProvider(z);
        scaleProvider0.setOutgoingEndScale(0.85f);
        scaleProvider0.setIncomingStartScale(0.85f);
        super(scaleProvider0, new FadeProvider());
        this.N = z;
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

    public boolean isGrowing() {
        return this.N;
    }

    @Override  // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        return this.o(viewGroup0, view0, true);
    }

    @Override  // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        return this.o(viewGroup0, view0, false);
    }

    public boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider0) {
        return this.M.remove(visibilityAnimatorProvider0);
    }

    public void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider0) {
        this.L = visibilityAnimatorProvider0;
    }
}

