package com.google.android.material.color;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;

public class ColorContrast {
    public static int a(Context context0, ColorContrastOptions colorContrastOptions0) {
        UiModeManager uiModeManager0 = (UiModeManager)context0.getSystemService("uimode");
        return 0;
    }

    // 去混淆评级： 低(30)
    public static void applyToActivitiesIfAvailable(@NonNull Application application0, @NonNull ColorContrastOptions colorContrastOptions0) {
    }

    // 去混淆评级： 低(30)
    public static void applyToActivityIfAvailable(@NonNull Activity activity0, @NonNull ColorContrastOptions colorContrastOptions0) {
    }

    @ChecksSdkIntAtLeast(api = 34)
    public static boolean isContrastAvailable() [...] // 潜在的解密器

    // 去混淆评级： 低(30)
    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context0, @NonNull ColorContrastOptions colorContrastOptions0) {
        return context0;
    }
}

