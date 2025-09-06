package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import c6.a;
import jeb.synthetic.FIN;

public final class zzb {
    public static volatile ClassLoader a;
    public static volatile Thread b;

    public static ClassLoader a() {
        ClassLoader classLoader0 = null;
        Class class0 = zzb.class;
        __monitor_enter(class0);
        int v = FIN.finallyOpen$NT();
        if(zzb.b == null) {
            zzb.b = zzb.b();
            if(zzb.b == null) {
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(class0);
                FIN.finallyCodeEnd$NT(v);
                return null;
            }
        }
        Thread thread0 = zzb.b;
        __monitor_enter(thread0);
        try {
            classLoader0 = zzb.b.getContextClassLoader();
        }
        catch(SecurityException securityException0) {
            Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + securityException0.getMessage());
        }
        finally {
            __monitor_exit(thread0);
            FIN.finallyExec$NT(v);
        }
        return classLoader0;
    }

    public static Thread b() {
        Thread thread2;
        SecurityException securityException1;
        Thread thread1;
        Thread thread0;
        ThreadGroup threadGroup1;
        synchronized(zzb.class) {
            ThreadGroup threadGroup0 = Looper.getMainLooper().getThread().getThreadGroup();
            if(threadGroup0 == null) {
                return null;
            }
            synchronized(Void.class) {
                try {
                    threadGroup1 = null;
                    int v2 = threadGroup0.activeGroupCount();
                    ThreadGroup[] arr_threadGroup = new ThreadGroup[v2];
                    threadGroup0.enumerate(arr_threadGroup);
                    int v3 = 0;
                    for(int v4 = 0; v4 < v2; ++v4) {
                        ThreadGroup threadGroup2 = arr_threadGroup[v4];
                        if("dynamiteLoader".equals(threadGroup2.getName())) {
                            threadGroup1 = threadGroup2;
                            break;
                        }
                    }
                    if(threadGroup1 == null) {
                        threadGroup1 = new ThreadGroup(threadGroup0, "dynamiteLoader");
                    }
                    thread0 = null;
                    int v5 = threadGroup1.activeCount();
                    Thread[] arr_thread = new Thread[v5];
                    threadGroup1.enumerate(arr_thread);
                    while(true) {
                        if(v3 >= v5) {
                            goto label_40;
                        }
                        thread1 = arr_thread[v3];
                        if("GmsDynamite".equals(thread1.getName())) {
                            break;
                        }
                        ++v3;
                    }
                }
                catch(SecurityException securityException0) {
                    securityException1 = securityException0;
                    Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + securityException1.getMessage());
                    return null;
                }
            }
            thread0 = thread1;
        label_40:
            if(thread0 == null) {
                try {
                    thread2 = new a(threadGroup1, "GmsDynamite");
                }
                catch(SecurityException securityException2) {
                    securityException1 = securityException2;
                    Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + securityException1.getMessage());
                    return null;
                }
                try {
                    thread2.setContextClassLoader(null);
                    thread2.start();
                    return thread2;
                }
                catch(SecurityException securityException1) {
                }
                Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + securityException1.getMessage());
                thread0 = thread2;
            }
            return thread0;
        }
    }

    @Nullable
    public static ClassLoader zza() {
        synchronized(zzb.class) {
            if(zzb.a == null) {
                zzb.a = zzb.a();
            }
            return zzb.a;
        }
    }
}

