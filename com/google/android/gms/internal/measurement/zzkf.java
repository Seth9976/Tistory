package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzkf extends zzio {
    private static final Map zza;
    protected zzmp zzc;
    private int zzd;

    static {
        zzkf.zza = new ConcurrentHashMap();
    }

    public zzkf() {
        this.zzd = -1;
        this.zzc = zzmp.zzc();
    }

    @Override  // com.google.android.gms.internal.measurement.zzio
    public final int a(zzlx zzlx0) {
        if(this.f()) {
            int v = this.b(zzlx0);
            if(v < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v);
            }
            return v;
        }
        int v1 = this.zzd & 0x7FFFFFFF;
        if(v1 != 0x7FFFFFFF) {
            return v1;
        }
        int v2 = this.b(zzlx0);
        if(v2 < 0) {
            throw new IllegalStateException("serialized size must be non-negative, was " + v2);
        }
        this.zzd = this.zzd & 0x80000000 | v2;
        return v2;
    }

    public final int b(zzlx zzlx0) {
        if(zzlx0 == null) {
            Class class0 = this.getClass();
            return o1.c.a(class0).zza(this);
        }
        return zzlx0.zza(this);
    }

    public static Object c(Method method0, zzlm zzlm0, Object[] arr_object) {
        try {
            return method0.invoke(zzlm0, arr_object);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException("Couldn\'t use Java reflection to implement protocol message reflection.", illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            Throwable throwable0 = invocationTargetException0.getCause();
            if(throwable0 instanceof RuntimeException) {
                throw (RuntimeException)throwable0;
            }
            if(throwable0 instanceof Error) {
                throw (Error)throwable0;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", throwable0);
        }
    }

    public final void d() {
        this.zzd &= 0x7FFFFFFF;
    }

    // 去混淆评级： 低(25)
    public final void e() {
        this.zzd |= 0x7FFFFFFF;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        if(this.getClass() != object0.getClass()) {
            return false;
        }
        Class class0 = this.getClass();
        return o1.c.a(class0).zzj(this, ((zzkf)object0));
    }

    public final boolean f() {
        return (this.zzd & 0x80000000) != 0;
    }

    public static zzkf g(Class class0) {
        Map map0 = zzkf.zza;
        zzkf zzkf0 = (zzkf)map0.get(class0);
        if(zzkf0 == null) {
            try {
                Class.forName(class0.getName(), true, class0.getClassLoader());
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException0);
            }
            zzkf0 = (zzkf)map0.get(class0);
        }
        if(zzkf0 == null) {
            zzkf0 = (zzkf)((zzkf)d2.h(class0)).zzl(6, null, null);
            if(zzkf0 == null) {
                throw new IllegalStateException();
            }
            map0.put(class0, zzkf0);
            return zzkf0;
        }
        return zzkf0;
    }

    @Override
    public final int hashCode() {
        if(!this.f()) {
            int v = this.zzb;
            if(v == 0) {
                Class class0 = this.getClass();
                v = o1.c.a(class0).zzb(this);
                this.zzb = v;
            }
            return v;
        }
        Class class1 = this.getClass();
        return o1.c.a(class1).zzb(this);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("# ");
        stringBuilder0.append(super.toString());
        j1.c(this, stringBuilder0, 0);
        return stringBuilder0.toString();
    }

    public static zzkk zzbB() {
        return a1.d;
    }

    public static zzkl zzbC() {
        return e1.d;
    }

    public static zzkl zzbD(zzkl zzkl0) {
        int v = zzkl0.size();
        return v == 0 ? zzkl0.zze(10) : zzkl0.zze(v + v);
    }

    public static zzkm zzbE() {
        return p1.d;
    }

    public static zzkm zzbF(zzkm zzkm0) {
        int v = zzkm0.size();
        return v == 0 ? zzkm0.zzd(10) : zzkm0.zzd(v + v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlm
    public final zzll zzbG() {
        return (zzkb)this.zzl(5, null, null);
    }

    public static Object zzbI(zzlm zzlm0, String s, Object[] arr_object) {
        return new q1(zzlm0, s, arr_object);
    }

    public final void zzbJ() {
        Class class0 = this.getClass();
        o1.c.a(class0).zzf(this);
        this.d();
    }

    public static void zzbL(Class class0, zzkf zzkf0) {
        zzkf.zza.put(class0, zzkf0);
        zzkf0.zzbJ();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlm
    public final void zzbN(zzjm zzjm0) throws IOException {
        Class class0 = this.getClass();
        o1.c.a(class0).zzi(this, (zzjm0.a == null ? new t0(zzjm0) : zzjm0.a));
    }

    @Override  // com.google.android.gms.internal.measurement.zzln
    public final zzlm zzbS() {
        return (zzkf)this.zzl(6, null, null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlm
    public final int zzbw() {
        int v;
        if(this.f()) {
            v = this.b(null);
            if(v < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v);
            }
        }
        else {
            v = this.zzd & 0x7FFFFFFF;
            if(v == 0x7FFFFFFF) {
                v = this.b(null);
                if(v < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + v);
                }
                this.zzd = this.zzd & 0x80000000 | v;
                return v;
            }
        }
        return v;
    }

    public final zzkb zzbx() {
        return (zzkb)this.zzl(5, null, null);
    }

    public final zzkb zzby() {
        zzkb zzkb0 = (zzkb)this.zzl(5, null, null);
        zzkb0.zzaA(this);
        return zzkb0;
    }

    public abstract Object zzl(int arg1, Object arg2, Object arg3);
}

