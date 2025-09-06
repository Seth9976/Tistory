package com.google.android.gms.common.util;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class Base64Utils {
    @NonNull
    @KeepForSdk
    public static byte[] decode(@NonNull String s) {
        return s == null ? null : Base64.decode(s, 0);
    }

    @NonNull
    @KeepForSdk
    public static byte[] decodeUrlSafe(@NonNull String s) {
        return s == null ? null : Base64.decode(s, 10);
    }

    @NonNull
    @KeepForSdk
    public static byte[] decodeUrlSafeNoPadding(@NonNull String s) {
        return s == null ? null : Base64.decode(s, 11);
    }

    @NonNull
    @KeepForSdk
    public static String encode(@NonNull byte[] arr_b) {
        return arr_b == null ? null : Base64.encodeToString(arr_b, 0);
    }

    @NonNull
    @KeepForSdk
    public static String encodeUrlSafe(@NonNull byte[] arr_b) {
        return arr_b == null ? null : Base64.encodeToString(arr_b, 10);
    }

    @NonNull
    @KeepForSdk
    public static String encodeUrlSafeNoPadding(@NonNull byte[] arr_b) {
        return arr_b == null ? null : Base64.encodeToString(arr_b, 11);
    }
}

