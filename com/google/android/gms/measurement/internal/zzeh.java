package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class zzeh extends b0 {
    public char b;
    public long c;
    public String d;
    public final zzef e;
    public final zzef f;
    public final zzef g;
    public final zzef h;
    public final zzef i;
    public final zzef j;
    public final zzef k;
    public final zzef l;
    public final zzef m;

    public zzeh(zzfr zzfr0) {
        super(zzfr0);
        this.b = '\u0000';
        this.c = -1L;
        this.e = new zzef(this, 6, false, false);
        this.f = new zzef(this, 6, true, false);
        this.g = new zzef(this, 6, false, true);
        this.h = new zzef(this, 5, false, false);
        this.i = new zzef(this, 5, true, false);
        this.j = new zzef(this, 5, false, true);
        this.k = new zzef(this, 4, false, false);
        this.l = new zzef(this, 3, false, false);
        this.m = new zzef(this, 2, false, false);
    }

    public static String a(boolean z, String s, Object object0, Object object1, Object object2) {
        String s1 = "";
        if(s == null) {
            s = "";
        }
        String s2 = zzeh.b(object0, z);
        String s3 = zzeh.b(object1, z);
        String s4 = zzeh.b(object2, z);
        StringBuilder stringBuilder0 = new StringBuilder();
        if(!TextUtils.isEmpty(s)) {
            stringBuilder0.append(s);
            s1 = ": ";
        }
        String s5 = ", ";
        if(!TextUtils.isEmpty(s2)) {
            stringBuilder0.append(s1);
            stringBuilder0.append(s2);
            s1 = ", ";
        }
        if(TextUtils.isEmpty(s3)) {
            s5 = s1;
        }
        else {
            stringBuilder0.append(s1);
            stringBuilder0.append(s3);
        }
        if(!TextUtils.isEmpty(s4)) {
            stringBuilder0.append(s5);
            stringBuilder0.append(s4);
        }
        return stringBuilder0.toString();
    }

    public static String b(Object object0, boolean z) {
        String s = "";
        if(object0 == null) {
            return "";
        }
        if(object0 instanceof Integer) {
            object0 = (long)(((int)(((Integer)object0))));
        }
        if(object0 instanceof Long) {
            if(!z) {
                return object0.toString();
            }
            if(Math.abs(((long)(((Long)object0)))) < 100L) {
                return object0.toString();
            }
            if(object0.toString().charAt(0) == 45) {
                s = "-";
            }
            String s1 = String.valueOf(Math.abs(((long)(((Long)object0)))));
            return s + Math.round(Math.pow(10.0, s1.length() - 1)) + "..." + s + Math.round(Math.pow(10.0, s1.length()) - 1.0);
        }
        if(object0 instanceof Boolean) {
            return object0.toString();
        }
        if(object0 instanceof Throwable) {
            StringBuilder stringBuilder0 = new StringBuilder((z ? ((Throwable)object0).getClass().getName() : ((Throwable)object0).toString()));
            String s2 = zzfr.class.getCanonicalName();
            if(TextUtils.isEmpty(s2)) {
                s2 = "";
            }
            else {
                int v = s2.lastIndexOf(46);
                if(v != -1) {
                    s2 = s2.substring(0, v);
                }
            }
            StackTraceElement[] arr_stackTraceElement = ((Throwable)object0).getStackTrace();
            for(int v1 = 0; v1 < arr_stackTraceElement.length; ++v1) {
                StackTraceElement stackTraceElement0 = arr_stackTraceElement[v1];
                if(!stackTraceElement0.isNativeMethod()) {
                    String s3 = stackTraceElement0.getClassName();
                    if(s3 != null) {
                        if(TextUtils.isEmpty(s3)) {
                            s3 = "";
                        }
                        else {
                            int v2 = s3.lastIndexOf(46);
                            if(v2 != -1) {
                                s3 = s3.substring(0, v2);
                            }
                        }
                        if(s3.equals(s2)) {
                            stringBuilder0.append(": ");
                            stringBuilder0.append(stackTraceElement0);
                            return stringBuilder0.toString();
                        }
                    }
                }
            }
            return stringBuilder0.toString();
        }
        if(object0 instanceof l) {
            return ((l)object0).a;
        }
        return z ? "-" : object0.toString();
    }

    public final zzef zzc() {
        return this.l;
    }

    public final zzef zzd() {
        return this.e;
    }

    public final zzef zze() {
        return this.g;
    }

    @Override  // com.google.android.gms.measurement.internal.b0
    public final boolean zzf() {
        return false;
    }

    public final zzef zzh() {
        return this.f;
    }

    public final zzef zzi() {
        return this.k;
    }

    public final zzef zzj() {
        return this.m;
    }

    public final zzef zzk() {
        return this.h;
    }

    public final zzef zzl() {
        return this.j;
    }

    public final zzef zzm() {
        return this.i;
    }

    public static Object zzn(String s) {
        return s == null ? null : new l(s);
    }

    @VisibleForTesting
    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String zzq() {
        synchronized(this) {
            if(this.d == null) {
                if(this.zzt.zzy() == null) {
                    this.zzt.zzf().zzt.zzaw();
                    this.d = "FA";
                }
                else {
                    this.d = this.zzt.zzy();
                }
            }
            Preconditions.checkNotNull(this.d);
            return this.d;
        }
    }

    public final void zzt(int v, boolean z, boolean z1, String s, Object object0, Object object1, Object object2) {
        if(!z && Log.isLoggable(this.zzq(), v)) {
            String s1 = zzeh.a(false, s, object0, object1, object2);
            Log.println(v, this.zzq(), s1);
        }
        if(!z1 && v >= 5) {
            Preconditions.checkNotNull(s);
            zzfo zzfo0 = this.zzt.j;
            if(zzfo0 == null) {
                Log.println(6, this.zzq(), "Scheduler not set. Not logging error/warn");
                return;
            }
            if(!zzfo0.a) {
                Log.println(6, this.zzq(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if(v >= 9) {
                v = 8;
            }
            zzfo0.zzp(new k(this, v, s, object0, object1, object2));
        }
    }
}

