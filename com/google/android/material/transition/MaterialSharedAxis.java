package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.transition.TransitionValues;
import com.google.android.material.R.attr;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class MaterialSharedAxis extends l {
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Axis {
    }

    public final int N;
    public final boolean O;
    public static final int P = 0;
    public static final int Q = 0;
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;

    static {
        MaterialSharedAxis.P = attr.motionDurationLong1;
        MaterialSharedAxis.Q = attr.motionEasingEmphasizedInterpolator;
    }

    public MaterialSharedAxis(int v, boolean z) {
        SlideDistanceProvider slideDistanceProvider0;
        switch(v) {
            case 0: {
                slideDistanceProvider0 = new SlideDistanceProvider((z ? 0x800005 : 0x800003));
                break;
            }
            case 1: {
                slideDistanceProvider0 = new SlideDistanceProvider((z ? 80 : 0x30));
                break;
            }
            case 2: {
                slideDistanceProvider0 = new ScaleProvider(z);
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid axis: " + v);
            }
        }
        super(slideDistanceProvider0, new FadeThroughProvider());
        this.N = v;
        this.O = z;
    }

    public void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider0) {
        this.M.add(visibilityAnimatorProvider0);
    }

    public void clearAdditionalAnimatorProvider() {
        this.M.clear();
    }

    public int getAxis() {
        return this.N;
    }

    @NonNull
    public VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return this.K;
    }

    @Nullable
    public VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.L;
    }

    public boolean isForward() {
        return this.O;
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
        return MaterialSharedAxis.P;
    }

    @Override  // com.google.android.material.transition.l
    public final int r(boolean z) {
        return MaterialSharedAxis.Q;
    }

    public boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider0) {
        return this.M.remove(visibilityAnimatorProvider0);
    }

    public void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider0) {
        this.L = visibilityAnimatorProvider0;
    }
}

