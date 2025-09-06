package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.dimen;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class SlideDistanceProvider implements VisibilityAnimatorProvider {
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    public int a;
    public int b;

    public SlideDistanceProvider(int v) {
        this.b = -1;
        this.a = v;
    }

    public static ObjectAnimator a(View view0, float f, float f1, float f2) {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofPropertyValuesHolder(view0, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f, f1})});
        objectAnimator0.addListener(new e(2, f2, view0));
        return objectAnimator0;
    }

    public static ObjectAnimator b(View view0, float f, float f1, float f2) {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofPropertyValuesHolder(view0, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f, f1})});
        objectAnimator0.addListener(new e(3, f2, view0));
        return objectAnimator0;
    }

    @Override  // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup0, @NonNull View view0) {
        int v = this.a;
        Context context0 = view0.getContext();
        int v1 = this.b == -1 ? context0.getResources().getDimensionPixelSize(dimen.mtrl_transition_shared_axis_slide_distance) : this.b;
        float f = view0.getTranslationX();
        float f1 = view0.getTranslationY();
        switch(v) {
            case 3: {
                return SlideDistanceProvider.a(view0, ((float)v1) + f, f, f);
            }
            case 5: {
                return SlideDistanceProvider.a(view0, f - ((float)v1), f, f);
            }
            case 0x30: {
                return SlideDistanceProvider.b(view0, f1 - ((float)v1), f1, f1);
            }
            case 80: {
                return SlideDistanceProvider.b(view0, ((float)v1) + f1, f1, f1);
            }
            case 0x800003: {
                return ViewCompat.getLayoutDirection(viewGroup0) == 1 ? SlideDistanceProvider.a(view0, ((float)v1) + f, f, f) : SlideDistanceProvider.a(view0, f - ((float)v1), f, f);
            }
            case 0x800005: {
                return ViewCompat.getLayoutDirection(viewGroup0) == 1 ? SlideDistanceProvider.a(view0, f - ((float)v1), f, f) : SlideDistanceProvider.a(view0, ((float)v1) + f, f, f);
            }
            default: {
                throw new IllegalArgumentException("Invalid slide direction: " + v);
            }
        }
    }

    @Override  // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup0, @NonNull View view0) {
        int v = this.a;
        Context context0 = view0.getContext();
        int v1 = this.b == -1 ? context0.getResources().getDimensionPixelSize(dimen.mtrl_transition_shared_axis_slide_distance) : this.b;
        float f = view0.getTranslationX();
        float f1 = view0.getTranslationY();
        switch(v) {
            case 3: {
                return SlideDistanceProvider.a(view0, f, f - ((float)v1), f);
            }
            case 5: {
                return SlideDistanceProvider.a(view0, f, ((float)v1) + f, f);
            }
            case 0x30: {
                return SlideDistanceProvider.b(view0, f1, ((float)v1) + f1, f1);
            }
            case 80: {
                return SlideDistanceProvider.b(view0, f1, f1 - ((float)v1), f1);
            }
            case 0x800003: {
                return ViewCompat.getLayoutDirection(viewGroup0) == 1 ? SlideDistanceProvider.a(view0, f, f - ((float)v1), f) : SlideDistanceProvider.a(view0, f, ((float)v1) + f, f);
            }
            case 0x800005: {
                return ViewCompat.getLayoutDirection(viewGroup0) == 1 ? SlideDistanceProvider.a(view0, f, ((float)v1) + f, f) : SlideDistanceProvider.a(view0, f, f - ((float)v1), f);
            }
            default: {
                throw new IllegalArgumentException("Invalid slide direction: " + v);
            }
        }
    }

    @Px
    public int getSlideDistance() {
        return this.b;
    }

    public int getSlideEdge() {
        return this.a;
    }

    public void setSlideDistance(@Px int v) {
        if(v < 0) {
            throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
        }
        this.b = v;
    }

    public void setSlideEdge(int v) {
        this.a = v;
    }
}

