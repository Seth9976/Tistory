package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;
import n7.a;

@KeepForSdk
@ShowFirstParty
@ThreadSafe
public class WakeLock {
    public final Object a;
    public final PowerManager.WakeLock b;
    public int c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f;
    public boolean g;
    public zzb h;
    public final Clock i;
    public final String j;
    public final HashMap k;
    public final AtomicInteger l;
    public final ScheduledExecutorService m;
    public static final long n;
    public static volatile ScheduledExecutorService o;
    public static final Object p;

    static {
        WakeLock.n = TimeUnit.DAYS.toMillis(366L);
        WakeLock.o = null;
        WakeLock.p = new Object();
    }

    @KeepForSdk
    public WakeLock(@NonNull Context context0, int v, @NonNull String s) {
        this.a = new Object();
        this.c = 0;
        this.f = new HashSet();
        this.g = true;
        this.i = DefaultClock.getInstance();
        this.k = new HashMap();
        this.l = new AtomicInteger(0);
        Preconditions.checkNotNull(context0, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(s, "WakeLock: wakeLockName must not be empty");
        context0.getApplicationContext();
        this.h = null;
        String s1 = String.valueOf(s);
        this.j = s1.length() == 0 ? new String("*gcore*:") : "*gcore*:" + s1;
        PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
        if(powerManager0 != null) {
            PowerManager.WakeLock powerManager$WakeLock0 = powerManager0.newWakeLock(v, s);
            this.b = powerManager$WakeLock0;
            if(WorkSourceUtil.hasWorkSourcePermission(context0)) {
                WorkSource workSource0 = WorkSourceUtil.fromPackage(context0, "net.daum.android.tistoryapp");
                if(workSource0 != null) {
                    try {
                        powerManager$WakeLock0.setWorkSource(workSource0);
                    }
                    catch(IllegalArgumentException | ArrayIndexOutOfBoundsException illegalArgumentException0) {
                        Log.wtf("WakeLock", illegalArgumentException0.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService0 = WakeLock.o;
            if(scheduledExecutorService0 == null) {
                synchronized(WakeLock.p) {
                    scheduledExecutorService0 = WakeLock.o;
                    if(scheduledExecutorService0 == null) {
                        scheduledExecutorService0 = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        WakeLock.o = scheduledExecutorService0;
                    }
                }
            }
            this.m = scheduledExecutorService0;
            return;
        }
        new StringBuilder(29).append("expected a non-null reference", 0, 29);
        throw new zzi("expected a non-null reference");
    }

    public final void a() {
        HashSet hashSet0 = this.f;
        if(hashSet0.isEmpty()) {
            return;
        }
        ArrayList arrayList0 = new ArrayList(hashSet0);
        hashSet0.clear();
        if(arrayList0.size() <= 0) {
            return;
        }
        zze zze0 = (zze)arrayList0.get(0);
        throw null;
    }

    @KeepForSdk
    public void acquire(long v) {
        this.l.incrementAndGet();
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        long v2 = v <= 0L ? Math.max(Math.min(0x7FFFFFFFFFFFFFFFL, WakeLock.n), 1L) : Math.min(v, Math.max(Math.min(0x7FFFFFFFFFFFFFFFL, WakeLock.n), 1L));
        synchronized(this.a) {
            if(!this.isHeld()) {
                this.h = zzb.zza(false, null);
                this.b.acquire();
                this.i.elapsedRealtime();
            }
            ++this.c;
            if(this.g) {
                TextUtils.isEmpty(null);
            }
            a a0 = (a)this.k.get(null);
            if(a0 == null) {
                a0 = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
                this.k.put(null, a0);
            }
            ++a0.a;
            long v4 = this.i.elapsedRealtime();
            if(0x7FFFFFFFFFFFFFFFL - v4 > v2) {
                v1 = v4 + v2;
            }
            if(v1 > this.e) {
                this.e = v1;
                ScheduledFuture scheduledFuture0 = this.d;
                if(scheduledFuture0 != null) {
                    scheduledFuture0.cancel(false);
                }
                zza zza0 = () -> synchronized(this.a) {
                    if(!this.isHeld()) {
                        return;
                    }
                    Log.e("WakeLock", this.j + " ** IS FORCE-RELEASED ON TIMEOUT **");
                    this.a();
                    if(!this.isHeld()) {
                        return;
                    }
                    this.c = 1;
                    this.b();
                };
                this.d = this.m.schedule(zza0, v2, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void b() {
        synchronized(this.a) {
            if(!this.isHeld()) {
                return;
            }
            if(this.g) {
                int v1 = this.c - 1;
                this.c = v1;
                if(v1 > 0) {
                    return;
                }
            }
            else {
                this.c = 0;
            }
            this.a();
            for(Object object1: this.k.values()) {
                ((a)object1).a = 0;
            }
            this.k.clear();
            ScheduledFuture scheduledFuture0 = this.d;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(false);
                this.d = null;
                this.e = 0L;
            }
            if(this.b.isHeld()) {
                try {
                    try {
                        this.b.release();
                    }
                    catch(RuntimeException runtimeException0) {
                        if(!runtimeException0.getClass().equals(RuntimeException.class)) {
                            throw runtimeException0;
                        }
                        Log.e("WakeLock", this.j + " failed to release!", runtimeException0);
                        if(this.h != null) {
                            this.h = null;
                        }
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    if(this.h != null) {
                        this.h = null;
                    }
                    throw throwable0;
                }
                if(this.h != null) {
                    this.h = null;
                }
            }
            else {
                Log.e("WakeLock", this.j + " should be held!");
            }
        }
    }

    @KeepForSdk
    public boolean isHeld() {
        synchronized(this.a) {
        }
        return this.c > 0;
    }

    @KeepForSdk
    public void release() {
        if(this.l.decrementAndGet() < 0) {
            Log.e("WakeLock", this.j + " release without a matched acquire!");
        }
        synchronized(this.a) {
            if(this.g) {
                TextUtils.isEmpty(null);
            }
            if(this.k.containsKey(null)) {
                a a0 = (a)this.k.get(null);
                if(a0 != null) {
                    int v1 = a0.a - 1;
                    a0.a = v1;
                    if(v1 == 0) {
                        this.k.remove(null);
                    }
                }
            }
            else {
                Log.w("WakeLock", this.j + " counter does not exist");
            }
            this.b();
        }
    }

    @KeepForSdk
    public void setReferenceCounted(boolean z) {
        synchronized(this.a) {
            this.g = z;
        }
    }

    // 检测为 Lambda 实现
    public static void zza(@NonNull WakeLock wakeLock0) [...]
}

