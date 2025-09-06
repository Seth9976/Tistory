package com.google.android.material.color;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class ThemeUtils {
    public static void applyThemeOverlay(@NonNull Context context0, @StyleRes int v) {
        Resources.Theme resources$Theme0;
        context0.getTheme().applyStyle(v, true);
        if(context0 instanceof Activity) {
            Window window0 = ((Activity)context0).getWindow();
            if(window0 == null) {
                resources$Theme0 = null;
            }
            else {
                View view0 = window0.peekDecorView();
                if(view0 == null) {
                    resources$Theme0 = null;
                }
                else {
                    Context context1 = view0.getContext();
                    resources$Theme0 = context1 == null ? null : context1.getTheme();
                }
            }
            if(resources$Theme0 != null) {
                resources$Theme0.applyStyle(v, true);
            }
        }
    }
}

