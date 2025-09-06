package com.google.android.gms.internal.measurement;

import android.content.Context;
import androidx.core.content.PermissionChecker;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zzib {
    public final zzhy a;
    public final String b;
    public final Object c;
    public volatile int d;
    public volatile Object e;
    public static final Object f;
    public static volatile c0 g;
    public static final AtomicInteger h;
    public static final int zzc;

    static {
        zzib.f = new Object();
        new AtomicReference();
        zzib.h = new AtomicInteger();
    }

    public zzib(zzhy zzhy0, String s, Object object0) {
        this.d = -1;
        if(zzhy0.a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.a = zzhy0;
        this.b = s;
        this.c = object0;
    }

    public abstract Object a(Object arg1);

    public final Object zzb() {
        Object object1;
        zzic zzic0;
        int v = zzib.h.get();
        if(this.d < v) {
            synchronized(this) {
                if(this.d < v) {
                    c0 c00 = zzib.g;
                    if(c00 == null) {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    this.a.getClass();
                    if(this.a.a == null) {
                        this.a.getClass();
                        zzic0 = zzic.a();
                    }
                    else if(zzhp.zza(c00.a, this.a.a)) {
                        this.a.getClass();
                        zzic0 = zzhf.zza(c00.a.getContentResolver(), this.a.a, zzhr.zza);
                    }
                    else {
                        zzic0 = null;
                    }
                    if(zzic0 == null) {
                        object1 = null;
                    }
                    else {
                        Object object0 = zzic0.zzb(this.zzc());
                        object1 = object0 == null ? null : this.a(object0);
                    }
                    if(object1 == null) {
                        if(this.a.d) {
                            object1 = null;
                        }
                        else {
                            Context context0 = c00.a;
                            Class class0 = d0.class;
                            synchronized(class0) {
                                if((String s) -> this.a(s) == null) {
                                    (String s) -> this.a(s) = PermissionChecker.checkSelfPermission(context0, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new d0(context0) : new d0();
                                }
                            }
                            String s = (String s) -> this.a(s).a((this.a.d ? null : this.b));
                            object1 = s == null ? null : this.a(s);
                        }
                        if(object1 == null) {
                            object1 = this.c;
                        }
                    }
                    zzig zzig0 = (zzig)c00.b.zza();
                    if(zzig0.zzb()) {
                        String s1 = ((zzhh)zzig0.zza()).zza(this.a.a, null, this.a.c, this.b);
                        object1 = s1 == null ? this.c : this.a(s1);
                    }
                    this.e = object1;
                    this.d = v;
                }
            }
        }
        return this.e;
    }

    public final String zzc() {
        return this.b;
    }

    public static void zzd() {
        zzib.h.incrementAndGet();
    }

    public static void zze(Context context0) {
        if(zzib.g == null) {
            Object object0 = zzib.f;
            synchronized(object0) {
                if(zzib.g == null) {
                    synchronized(object0) {
                        c0 c00 = zzib.g;
                        Context context1 = context0.getApplicationContext();
                        if(context1 != null) {
                            context0 = context1;
                        }
                        if(c00 == null || c00.a != context0) {
                            zzhf.a();
                            zzic.b();
                            Class class0 = d0.class;
                            synchronized(class0) {
                                d0 d00 = (String s) -> this.a(s);
                                if(d00 != null) {
                                    Context context2 = d00.a;
                                    if(context2 != null && d00.b != null) {
                                        context2.getContentResolver().unregisterContentObserver((String s) -> this.a(s).b);
                                    }
                                }
                                (String s) -> this.a(s) = null;
                            }
                            zzib.g = new c0(context0, zzim.zza(new zzhs(context0)));
                            zzib.h.incrementAndGet();
                        }
                    }
                }
            }
        }
    }
}

