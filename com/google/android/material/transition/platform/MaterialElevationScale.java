package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
public final class MaterialElevationScale extends j {
    public final boolean d;

    public MaterialElevationScale(boolean z) {
        ScaleProvider scaleProvider0 = new ScaleProvider(z);
        scaleProvider0.setOutgoingEndScale(0.85f);
        scaleProvider0.setIncomingStartScale(0.85f);
        super(scaleProvider0, new FadeProvider());
        this.d = z;
    }

    public void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider0) {
        this.c.add(visibilityAnimatorProvider0);
    }

    public void clearAdditionalAnimatorProvider() {
        this.c.clear();
    }

    @NonNull
    public VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return this.a;
    }

    @Nullable
    public VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.b;
    }

    public boolean isGrowing() {
        return this.d;
    }

    @Override  // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        return this.b(viewGroup0, view0, true);
    }

    @Override  // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        return this.b(viewGroup0, view0, false);
    }

    public boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider0) {
        return this.c.remove(visibilityAnimatorProvider0);
    }

    public void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider0) {
        this.b = visibilityAnimatorProvider0;
    }
}

