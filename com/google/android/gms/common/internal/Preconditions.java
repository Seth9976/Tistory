package com.google.android.gms.common.internal;

import a5.b;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.zzb;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@KeepForSdk
public final class Preconditions {
    @KeepForSdk
    public static void checkArgument(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    @KeepForSdk
    public static void checkArgument(boolean z, @NonNull Object object0) {
        if(!z) {
            throw new IllegalArgumentException(String.valueOf(object0));
        }
    }

    @KeepForSdk
    public static void checkArgument(boolean z, @NonNull String s, @NonNull Object[] arr_object) {
        if(!z) {
            throw new IllegalArgumentException(String.format(s, arr_object));
        }
    }

    @KeepForSdk
    public static void checkHandlerThread(@NonNull Handler handler0) {
        Looper looper0 = Looper.myLooper();
        if(looper0 != handler0.getLooper()) {
            String s = looper0 == null ? "null current looper" : looper0.getThread().getName();
            throw new IllegalStateException(b.o("Must be called on ", handler0.getLooper().getThread().getName(), " thread, but got ", s, "."));
        }
    }

    @KeepForSdk
    public static void checkHandlerThread(@NonNull Handler handler0, @NonNull String s) {
        if(Looper.myLooper() != handler0.getLooper()) {
            throw new IllegalStateException(s);
        }
    }

    @KeepForSdk
    public static void checkMainThread() {
        Preconditions.checkMainThread("Must be called on the main application thread");
    }

    @KeepForSdk
    public static void checkMainThread(@NonNull String s) {
        if(!zzb.zza()) {
            throw new IllegalStateException(s);
        }
    }

    @NonNull
    @KeepForSdk
    @EnsuresNonNull({"#1"})
    public static String checkNotEmpty(@Nullable String s) [...] // 潜在的解密器

    @NonNull
    @KeepForSdk
    @EnsuresNonNull({"#1"})
    public static String checkNotEmpty(@Nullable String s, @NonNull Object object0) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException(String.valueOf(object0));
        }
        return s;
    }

    @KeepForSdk
    public static void checkNotMainThread() {
        Preconditions.checkNotMainThread("Must not be called on the main application thread");
    }

    @KeepForSdk
    public static void checkNotMainThread(@NonNull String s) {
        if(zzb.zza()) {
            throw new IllegalStateException(s);
        }
    }

    @NonNull
    @KeepForSdk
    @EnsuresNonNull({"#1"})
    public static Object checkNotNull(@Nullable Object object0) {
        if(object0 == null) {
            throw new NullPointerException("null reference");
        }
        return object0;
    }

    @NonNull
    @KeepForSdk
    @EnsuresNonNull({"#1"})
    public static Object checkNotNull(@NonNull Object object0, @NonNull Object object1) {
        if(object0 == null) {
            throw new NullPointerException(String.valueOf(object1));
        }
        return object0;
    }

    @KeepForSdk
    public static int checkNotZero(int v) {
        if(v == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        return v;
    }

    @KeepForSdk
    public static int checkNotZero(int v, @NonNull Object object0) {
        if(v == 0) {
            throw new IllegalArgumentException(String.valueOf(object0));
        }
        return v;
    }

    @KeepForSdk
    public static long checkNotZero(long v) {
        if(v == 0L) {
            throw new IllegalArgumentException("Given Long is zero");
        }
        return v;
    }

    @KeepForSdk
    public static long checkNotZero(long v, @NonNull Object object0) {
        if(v == 0L) {
            throw new IllegalArgumentException(String.valueOf(object0));
        }
        return v;
    }

    @KeepForSdk
    public static void checkState(boolean z) {
        if(!z) {
            throw new IllegalStateException();
        }
    }

    @KeepForSdk
    public static void checkState(boolean z, @NonNull Object object0) {
        if(!z) {
            throw new IllegalStateException(String.valueOf(object0));
        }
    }

    @KeepForSdk
    public static void checkState(boolean z, @NonNull String s, @NonNull Object[] arr_object) {
        if(!z) {
            throw new IllegalStateException(String.format(s, arr_object));
        }
    }
}

