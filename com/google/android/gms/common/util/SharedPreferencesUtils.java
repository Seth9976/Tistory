package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class SharedPreferencesUtils {
    @KeepForSdk
    @Deprecated
    public static void publishWorldReadableSharedPreferences(@NonNull Context context0, @NonNull SharedPreferences.Editor sharedPreferences$Editor0, @NonNull String s) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}

