package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

@KeepForSdk
@VisibleForTesting
public class Strings {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    // 去混淆评级： 低(20)
    @Nullable
    @KeepForSdk
    public static String emptyToNull(@Nullable String s) {
        return TextUtils.isEmpty(s) ? null : s;
    }

    @KeepForSdk
    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean isEmptyOrWhitespace(@Nullable String s) {
        return s == null || s.trim().isEmpty();
    }
}

