package com.google.android.gms.common.config;

import android.os.Binder;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
public abstract class GservicesValue {
    public Object a;
    public static final Object b;
    @NonNull
    protected final String zza;
    @NonNull
    protected final Object zzb;

    static {
        GservicesValue.b = new Object();
    }

    public GservicesValue(@NonNull String s, @NonNull Object object0) {
        this.a = null;
        this.zza = s;
        this.zzb = object0;
    }

    @NonNull
    @KeepForSdk
    public final Object get() {
        Object object1;
        Object object0 = this.a;
        if(object0 != null) {
            return object0;
        }
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try {
            object1 = this.zza(this.zza);
        }
        catch(SecurityException unused_ex) {
            long v1 = Binder.clearCallingIdentity();
            try {
                return this.zza(this.zza);
            }
            finally {
                Binder.restoreCallingIdentity(v1);
            }
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
        return object1;
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public final Object getBinderSafe() {
        return this.get();
    }

    @KeepForSdk
    public static boolean isInitialized() {
        synchronized(GservicesValue.b) {
        }
        return false;
    }

    @KeepForSdk
    @VisibleForTesting
    public void override(@NonNull Object object0) {
        Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.a = object0;
        synchronized(GservicesValue.b) {
        }
    }

    @KeepForSdk
    @VisibleForTesting
    public void resetOverride() {
        this.a = null;
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue value(@NonNull String s, @NonNull Float float0) {
        return new a(float0, 3, s);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue value(@NonNull String s, @NonNull Integer integer0) {
        return new a(integer0, 2, s);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue value(@NonNull String s, @NonNull Long long0) {
        return new a(long0, 1, s);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue value(@NonNull String s, @NonNull String s1) {
        return new a(s1, 4, s);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue value(@NonNull String s, boolean z) {
        return new a(Boolean.valueOf(z), 0, s);
    }

    @NonNull
    public abstract Object zza(@NonNull String arg1);
}

