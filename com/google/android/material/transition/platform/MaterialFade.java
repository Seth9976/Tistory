package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.R.attr;
import com.google.android.material.animation.AnimationUtils;

@RequiresApi(21)
public final class MaterialFade extends j {
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;

    static {
        MaterialFade.d = attr.motionDurationMedium4;
        MaterialFade.e = attr.motionDurationShort3;
        MaterialFade.f = attr.motionEasingEmphasizedDecelerateInterpolator;
        MaterialFade.g = attr.motionEasingEmphasizedAccelerateInterpolator;
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
        this.c.add(visibilityAnimatorProvider0);
    }

    @Override  // com.google.android.material.transition.platform.j
    public final TimeInterpolator c() {
        return AnimationUtils.LINEAR_INTERPOLATOR;
    }

    public void clearAdditionalAnimatorProvider() {
        this.c.clear();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.transition.platform.j
    public final int d(boolean z) {
        return z ? MaterialFade.d : MaterialFade.e;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.transition.platform.j
    public final int e(boolean z) {
        return z ? MaterialFade.f : MaterialFade.g;
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

