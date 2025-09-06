package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.material.R.attr;

@RestrictTo({Scope.LIBRARY_GROUP})
public abstract class MaterialBackAnimationHelper {
    public final TimeInterpolator a;
    public BackEventCompat b;
    protected final int cancelDuration;
    protected final int hideDurationMax;
    protected final int hideDurationMin;
    @NonNull
    protected final View view;

    public MaterialBackAnimationHelper(@NonNull View view0) {
        this.view = view0;
        Context context0 = view0.getContext();
        this.a = MotionUtils.resolveThemeInterpolator(context0, attr.motionEasingStandardDecelerateInterpolator, PathInterpolatorCompat.create(0.0f, 0.0f, 0.0f, 1.0f));
        this.hideDurationMax = MotionUtils.resolveThemeDuration(context0, attr.motionDurationMedium2, 300);
        this.hideDurationMin = MotionUtils.resolveThemeDuration(context0, attr.motionDurationShort3, 150);
        this.cancelDuration = MotionUtils.resolveThemeDuration(context0, attr.motionDurationShort2, 100);
    }

    public float interpolateProgress(float f) {
        return this.a.getInterpolation(f);
    }

    @Nullable
    public BackEventCompat onCancelBackProgress() {
        if(this.b == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        BackEventCompat backEventCompat0 = this.b;
        this.b = null;
        return backEventCompat0;
    }

    @Nullable
    public BackEventCompat onHandleBackInvoked() {
        BackEventCompat backEventCompat0 = this.b;
        this.b = null;
        return backEventCompat0;
    }

    public void onStartBackProgress(@NonNull BackEventCompat backEventCompat0) {
        this.b = backEventCompat0;
    }

    @Nullable
    public BackEventCompat onUpdateBackProgress(@NonNull BackEventCompat backEventCompat0) {
        if(this.b == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat1 = this.b;
        this.b = backEventCompat0;
        return backEventCompat1;
    }
}

