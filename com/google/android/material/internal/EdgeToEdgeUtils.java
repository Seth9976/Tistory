package com.google.android.material.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.WindowCompat;
import com.google.android.material.color.MaterialColors;

@RestrictTo({Scope.LIBRARY_GROUP})
public class EdgeToEdgeUtils {
    public static void applyEdgeToEdge(@NonNull Window window0, boolean z) {
        EdgeToEdgeUtils.applyEdgeToEdge(window0, z, null, null);
    }

    public static void applyEdgeToEdge(@NonNull Window window0, boolean z, @ColorInt @Nullable Integer integer0, @ColorInt @Nullable Integer integer1) {
        int v3;
        int v = Build.VERSION.SDK_INT;
        boolean z1 = false;
        boolean z2 = integer0 == null || ((int)integer0) == 0;
        boolean z3 = integer1 == null || ((int)integer1) == 0;
        if(z2 || z3) {
            int v1 = MaterialColors.getColor(window0.getContext(), 0x1010031, 0xFF000000);
            if(z2) {
                integer0 = v1;
            }
            if(z3) {
                integer1 = v1;
            }
        }
        WindowCompat.setDecorFitsSystemWindows(window0, !z);
        int v2 = z ? 0 : MaterialColors.getColor(window0.getContext(), 0x1010451, 0xFF000000);
        Context context0 = window0.getContext();
        if(!z || v >= 27) {
            v3 = z ? 0 : MaterialColors.getColor(context0, 0x1010452, 0xFF000000);
        }
        else {
            v3 = ColorUtils.setAlphaComponent(MaterialColors.getColor(context0, 0x1010452, 0xFF000000), 0x80);
        }
        window0.setStatusBarColor(v2);
        window0.setNavigationBarColor(v3);
        boolean z4 = MaterialColors.isColorLight(((int)integer0));
        EdgeToEdgeUtils.setLightStatusBar(window0, MaterialColors.isColorLight(v2) || v2 == 0 && z4);
        boolean z5 = MaterialColors.isColorLight(((int)integer1));
        if(MaterialColors.isColorLight(v3) || v3 == 0 && z5) {
            z1 = true;
        }
        EdgeToEdgeUtils.setLightNavigationBar(window0, z1);
    }

    public static void setLightNavigationBar(@NonNull Window window0, boolean z) {
        WindowCompat.getInsetsController(window0, window0.getDecorView()).setAppearanceLightNavigationBars(z);
    }

    public static void setLightStatusBar(@NonNull Window window0, boolean z) {
        WindowCompat.getInsetsController(window0, window0.getDecorView()).setAppearanceLightStatusBars(z);
    }
}

