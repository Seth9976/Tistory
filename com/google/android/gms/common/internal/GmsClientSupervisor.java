package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;

@KeepForSdk
public abstract class GmsClientSupervisor {
    public static final Object a = null;
    public static l b = null;
    public static HandlerThread c = null;
    public static boolean d = false;

    static {
        GmsClientSupervisor.a = new Object();
    }

    @KeepForSdk
    public boolean bindService(@NonNull ComponentName componentName0, @NonNull ServiceConnection serviceConnection0, @NonNull String s) {
        return this.zzc(new zzn(componentName0, 0x1081), serviceConnection0, s, null);
    }

    @KeepForSdk
    public boolean bindService(@NonNull String s, @NonNull ServiceConnection serviceConnection0, @NonNull String s1) {
        return this.zzc(new zzn(s, 0x1081, false), serviceConnection0, s1, null);
    }

    @KeepForSdk
    public static int getDefaultBindFlags() [...] // Inlined contents

    @NonNull
    @KeepForSdk
    public static GmsClientSupervisor getInstance(@NonNull Context context0) {
        synchronized(GmsClientSupervisor.a) {
            if(GmsClientSupervisor.b == null) {
                GmsClientSupervisor.b = new l(context0.getApplicationContext(), (GmsClientSupervisor.d ? GmsClientSupervisor.getOrStartHandlerThread().getLooper() : context0.getMainLooper()));
            }
            return GmsClientSupervisor.b;
        }
    }

    @NonNull
    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread() {
        synchronized(GmsClientSupervisor.a) {
            HandlerThread handlerThread0 = GmsClientSupervisor.c;
            if(handlerThread0 != null) {
                return handlerThread0;
            }
            HandlerThread handlerThread1 = new HandlerThread("GoogleApiHandler", 9);
            GmsClientSupervisor.c = handlerThread1;
            handlerThread1.start();
            return GmsClientSupervisor.c;
        }
    }

    @KeepForSdk
    public static void setUseHandlerThreadForCallbacks() {
        synchronized(GmsClientSupervisor.a) {
            l l0 = GmsClientSupervisor.b;
            if(l0 != null && !GmsClientSupervisor.d) {
                Looper looper0 = GmsClientSupervisor.getOrStartHandlerThread().getLooper();
                synchronized(l0.e) {
                    l0.g = new zzi(looper0, l0.h);
                }
            }
            GmsClientSupervisor.d = true;
        }
    }

    @KeepForSdk
    public void unbindService(@NonNull ComponentName componentName0, @NonNull ServiceConnection serviceConnection0, @NonNull String s) {
        this.zza(new zzn(componentName0, 0x1081), serviceConnection0, s);
    }

    @KeepForSdk
    public void unbindService(@NonNull String s, @NonNull ServiceConnection serviceConnection0, @NonNull String s1) {
        this.zza(new zzn(s, 0x1081, false), serviceConnection0, s1);
    }

    public abstract void zza(zzn arg1, ServiceConnection arg2, String arg3);

    public final void zzb(@NonNull String s, @NonNull String s1, int v, @NonNull ServiceConnection serviceConnection0, @NonNull String s2, boolean z) {
        this.zza(new zzn(s, s1, v, z), serviceConnection0, s2);
    }

    public abstract boolean zzc(zzn arg1, ServiceConnection arg2, String arg3, @Nullable Executor arg4);
}

