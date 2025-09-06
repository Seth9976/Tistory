package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

@RestrictTo({Scope.LIBRARY_GROUP})
public class AnimationUtils {
    public static final TimeInterpolator DECELERATE_INTERPOLATOR;
    public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR;
    public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR;
    public static final TimeInterpolator LINEAR_INTERPOLATOR;
    public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR;

    static {
        AnimationUtils.LINEAR_INTERPOLATOR = new LinearInterpolator();
        AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR = new FastOutSlowInInterpolator();
        AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR = new FastOutLinearInInterpolator();
        AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR = new LinearOutSlowInInterpolator();
        AnimationUtils.DECELERATE_INTERPOLATOR = new DecelerateInterpolator();
    }

    public static float lerp(float f, float f1, float f2) {
        return (f1 - f) * f2 + f;
    }

    public static float lerp(float f, float f1, float f2, float f3, float f4) {
        if(f4 <= f2) {
            return f;
        }
        return f4 >= f3 ? f1 : AnimationUtils.lerp(f, f1, (f4 - f2) / (f3 - f2));
    }

    public static int lerp(int v, int v1, float f) {
        return Math.round(f * ((float)(v1 - v))) + v;
    }
}

