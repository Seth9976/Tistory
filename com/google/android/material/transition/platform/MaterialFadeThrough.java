package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.R.attr;

@RequiresApi(21)
public final class MaterialFadeThrough extends j {
    public static final int d;
    public static final int e;

    static {
        MaterialFadeThrough.d = attr.motionDurationLong1;
        MaterialFadeThrough.e = attr.motionEasingEmphasizedInterpolator;
    }

    public MaterialFadeThrough() {
        FadeThroughProvider fadeThroughProvider0 = new FadeThroughProvider();
        ScaleProvider scaleProvider0 = new ScaleProvider();
        scaleProvider0.setScaleOnDisappear(false);
        scaleProvider0.setIncomingStartScale(0.92f);
        super(fadeThroughProvider0, scaleProvider0);
    }

    public void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider0) {
        this.c.add(visibilityAnimatorProvider0);
    }

    public void clearAdditionalAnimatorProvider() {
        this.c.clear();
    }

    @Override  // com.google.android.material.transition.platform.j
    public final int d(boolean z) {
        return MaterialFadeThrough.d;
    }

    @Override  // com.google.android.material.transition.platform.j
    public final int e(boolean z) {
        return MaterialFadeThrough.e;
    }

    @NonNull
    public VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return this.a;
    }

    @Nullable
    public VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.b;
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

