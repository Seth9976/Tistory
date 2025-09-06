package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.R.attr;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi(21)
public final class MaterialSharedAxis extends j {
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Axis {
    }

    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;
    public final int d;
    public final boolean e;
    public static final int f;
    public static final int g;

    static {
        MaterialSharedAxis.f = attr.motionDurationLong1;
        MaterialSharedAxis.g = attr.motionEasingEmphasizedInterpolator;
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
        this.d = v;
        this.e = z;
    }

    public void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider0) {
        this.c.add(visibilityAnimatorProvider0);
    }

    public void clearAdditionalAnimatorProvider() {
        this.c.clear();
    }

    @Override  // com.google.android.material.transition.platform.j
    public final int d(boolean z) {
        return MaterialSharedAxis.f;
    }

    @Override  // com.google.android.material.transition.platform.j
    public final int e(boolean z) {
        return MaterialSharedAxis.g;
    }

    public int getAxis() {
        return this.d;
    }

    @NonNull
    public VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return this.a;
    }

    @Nullable
    public VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.b;
    }

    public boolean isForward() {
        return this.e;
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

