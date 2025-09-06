package com.google.android.material.internal;

import android.os.Build;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Locale;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ManufacturerUtils {
    // 去混淆评级： 低(20)
    public static boolean isDateInputKeyboardMissingSeparatorCharacters() {
        return ManufacturerUtils.isLGEDevice() || ManufacturerUtils.isSamsungDevice();
    }

    public static boolean isLGEDevice() {
        return Build.MANUFACTURER == null ? false : Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("lge");
    }

    public static boolean isMeizuDevice() {
        return Build.MANUFACTURER == null ? false : Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu");
    }

    public static boolean isSamsungDevice() {
        return Build.MANUFACTURER == null ? false : Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("samsung");
    }
}

