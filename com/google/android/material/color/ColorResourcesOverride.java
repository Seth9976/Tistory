package com.google.android.material.color;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Map;

@RestrictTo({Scope.LIBRARY_GROUP})
public interface ColorResourcesOverride {
    boolean applyIfPossible(@NonNull Context arg1, @NonNull Map arg2);

    @Nullable
    static ColorResourcesOverride getInstance() {
        int v = Build.VERSION.SDK_INT;
        ColorResourcesOverride colorResourcesOverride0 = j.d;
        if(30 <= v && v <= 33) {
            return colorResourcesOverride0;
        }
        return v < 34 ? null : colorResourcesOverride0;
    }

    @NonNull
    Context wrapContextIfPossible(@NonNull Context arg1, @NonNull Map arg2);
}

