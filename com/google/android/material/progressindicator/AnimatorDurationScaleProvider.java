package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.provider.Settings.Global;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;

@RestrictTo({Scope.LIBRARY_GROUP})
public class AnimatorDurationScaleProvider {
    public float getSystemAnimatorDurationScale(@NonNull ContentResolver contentResolver0) {
        return Settings.Global.getFloat(contentResolver0, "animator_duration_scale", 1.0f);
    }

    @VisibleForTesting
    public static void setDefaultSystemAnimatorDurationScale(float f) {
    }
}

