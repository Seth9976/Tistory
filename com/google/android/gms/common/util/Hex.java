package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

@KeepForSdk
@ShowFirstParty
public class Hex {
    public static final char[] a;
    public static final char[] b;

    static {
        Hex.a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        Hex.b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    @NonNull
    @KeepForSdk
    public static String bytesToStringLowercase(@NonNull byte[] arr_b) {
        char[] arr_c = new char[arr_b.length + arr_b.length];
        int v1 = 0;
        for(int v = 0; v < arr_b.length; ++v) {
            int v2 = arr_b[v];
            int v3 = v1 + 1;
            arr_c[v1] = Hex.b[(v2 & 0xFF) >>> 4];
            v1 += 2;
            arr_c[v3] = Hex.b[v2 & 15];
        }
        return new String(arr_c);
    }

    @NonNull
    @KeepForSdk
    public static String bytesToStringUppercase(@NonNull byte[] arr_b) {
        return Hex.bytesToStringUppercase(arr_b, false);
    }

    @NonNull
    @KeepForSdk
    public static String bytesToStringUppercase(@NonNull byte[] arr_b, boolean z) {
        StringBuilder stringBuilder0 = new StringBuilder(arr_b.length + arr_b.length);
        for(int v = 0; v < arr_b.length && (!z || v != arr_b.length - 1 || (arr_b[v] & 0xFF) != 0); ++v) {
            stringBuilder0.append(Hex.a[(arr_b[v] & 0xF0) >>> 4]);
            stringBuilder0.append(Hex.a[arr_b[v] & 15]);
        }
        return stringBuilder0.toString();
    }

    @NonNull
    @KeepForSdk
    public static byte[] stringToBytes(@NonNull String s) throws IllegalArgumentException {
        int v = s.length();
        if(v % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] arr_b = new byte[v / 2];
        for(int v1 = 0; v1 < v; v1 += 2) {
            arr_b[v1 / 2] = (byte)Integer.parseInt(s.substring(v1, v1 + 2), 16);
        }
        return arr_b;
    }
}

