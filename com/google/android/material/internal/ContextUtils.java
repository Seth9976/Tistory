package com.google.android.material.internal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ContextUtils {
    @Nullable
    public static Activity getActivity(Context context0) {
        while(context0 instanceof ContextWrapper) {
            if(context0 instanceof Activity) {
                return (Activity)context0;
            }
            context0 = ((ContextWrapper)context0).getBaseContext();
        }
        return null;
    }
}

