package com.google.android.gms.common.internal;

import a5.b;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import javax.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@KeepForSdk
public final class Asserts {
    @KeepForSdk
    public static void checkMainThread(@NonNull String s) {
        if(Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        Log.e("Asserts", b.o("checkMainThread: current thread ", "Thread[jeb-dexdec-sb-st-1221,5,main]", " IS NOT the main thread ", String.valueOf(Looper.getMainLooper().getThread()), "!"));
        throw new IllegalStateException(s);
    }

    @KeepForSdk
    public static void checkNotMainThread(@NonNull String s) {
        if(Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        Log.e("Asserts", b.o("checkNotMainThread: current thread ", "Thread[jeb-dexdec-sb-st-1215,5,main]", " IS the main thread ", String.valueOf(Looper.getMainLooper().getThread()), "!"));
        throw new IllegalStateException(s);
    }

    @KeepForSdk
    @EnsuresNonNull({"#1"})
    public static void checkNotNull(@Nullable Object object0) {
        if(object0 == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    @KeepForSdk
    @EnsuresNonNull({"#1"})
    public static void checkNotNull(@Nullable Object object0, @NonNull Object object1) {
        if(object0 == null) {
            throw new IllegalArgumentException(String.valueOf(object1));
        }
    }

    @KeepForSdk
    public static void checkNull(@NonNull Object object0) {
        if(object0 != null) {
            throw new IllegalArgumentException("non-null reference");
        }
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
}

