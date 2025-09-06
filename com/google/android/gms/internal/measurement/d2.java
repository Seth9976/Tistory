package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class d2 {
    public static final Unsafe a;
    public static final Class b;
    public static final c2 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    static {
        Field field2;
        boolean z3;
        boolean z2;
        Field field1;
        c2 c20;
        Class class0 = Class.class;
        Unsafe unsafe0 = d2.j();
        d2.a = unsafe0;
        d2.b = l0.a();
        Class class1 = Long.TYPE;
        boolean z = d2.r(class1);
        boolean z1 = d2.r(Integer.TYPE);
        Field field0 = null;
        if(unsafe0 == null) {
            c20 = null;
        }
        else if(z) {
            c20 = new b2(unsafe0, 1);
        }
        else if(z1) {
            c20 = new b2(unsafe0, 0);
        }
        else {
            c20 = null;
        }
        d2.c = c20;
        Class class2 = d2.class;
        Class class3 = Buffer.class;
        Class class4 = Field.class;
        Class class5 = Object.class;
        if(c20 == null) {
            z2 = false;
        }
        else {
            try {
                Class class6 = c20.a.getClass();
                class6.getMethod("objectFieldOffset", class4);
                class6.getMethod("getLong", class5, class1);
                try {
                    field1 = null;
                    field1 = class3.getDeclaredField("effectiveDirectAddress");
                }
                catch(Throwable unused_ex) {
                }
                if(field1 == null) {
                    try {
                        field1 = null;
                        field1 = class3.getDeclaredField("address");
                    }
                    catch(Throwable unused_ex) {
                    }
                    if(field1 == null) {
                        goto label_41;
                    }
                    else if(field1.getType() != Long.TYPE) {
                        field1 = null;
                    }
                }
                goto label_42;
            }
            catch(Throwable throwable0) {
                Logger.getLogger(class2.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + throwable0.toString());
                z2 = false;
                goto label_48;
            }
            field1 = null;
            goto label_42;
        label_41:
            field1 = null;
        label_42:
            z2 = field1 == null ? false : true;
        }
    label_48:
        d2.d = z2;
        c2 c21 = d2.c;
        if(c21 == null) {
            z3 = false;
        }
        else {
            try {
                Class class7 = c21.a.getClass();
                class7.getMethod("objectFieldOffset", class4);
                class7.getMethod("arrayBaseOffset", class0);
                class7.getMethod("arrayIndexScale", class0);
                Class class8 = Long.TYPE;
                class7.getMethod("getInt", class5, class8);
                class7.getMethod("putInt", class5, class8, Integer.TYPE);
                class7.getMethod("getLong", class5, class8);
                class7.getMethod("putLong", class5, class8, class8);
                class7.getMethod("getObject", class5, class8);
                class7.getMethod("putObject", class5, class8, class5);
                z3 = true;
            }
            catch(Throwable throwable1) {
                Logger.getLogger(class2.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + throwable1.toString());
                z3 = false;
            }
        }
        d2.e = z3;
        d2.f = (long)d2.t(byte[].class);
        d2.t(boolean[].class);
        d2.a(boolean[].class);
        d2.t(int[].class);
        d2.a(int[].class);
        d2.t(long[].class);
        d2.a(long[].class);
        d2.t(float[].class);
        d2.a(float[].class);
        d2.t(double[].class);
        d2.a(double[].class);
        d2.t(Object[].class);
        d2.a(Object[].class);
        try {
            field2 = null;
            field2 = class3.getDeclaredField("effectiveDirectAddress");
        }
        catch(Throwable unused_ex) {
        }
        if(field2 == null) {
            try {
                field2 = null;
                field2 = class3.getDeclaredField("address");
            }
            catch(Throwable unused_ex) {
            }
            if(field2 != null && field2.getType() == Long.TYPE) {
                field0 = field2;
            }
        }
        else {
            field0 = field2;
        }
        if(field0 != null) {
            c2 c22 = d2.c;
            if(c22 != null) {
                c22.l(field0);
            }
        }
        d2.g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class class0) {
        if(d2.e) {
            d2.c.i(class0);
        }
    }

    public static void b(Object object0, long v, byte b) {
        int v1 = d2.c.j(object0, -4L & v);
        int v2 = (~((int)v) & 3) << 3;
        d2.c.n((0xFF & b) << v2 | v1 & ~(0xFF << v2), -4L & v, object0);
    }

    public static void c(Object object0, long v, byte b) {
        int v1 = d2.c.j(object0, -4L & v);
        int v2 = (((int)v) & 3) << 3;
        d2.c.n((0xFF & b) << v2 | v1 & ~(0xFF << v2), -4L & v, object0);
    }

    public static double d(Object object0, long v) {
        return d2.c.a(object0, v);
    }

    public static float e(Object object0, long v) {
        return d2.c.b(object0, v);
    }

    public static int f(Object object0, long v) {
        return d2.c.j(object0, v);
    }

    public static long g(Object object0, long v) {
        return d2.c.k(object0, v);
    }

    public static Object h(Class class0) {
        try {
            return d2.a.allocateInstance(class0);
        }
        catch(InstantiationException instantiationException0) {
            throw new IllegalStateException(instantiationException0);
        }
    }

    public static Object i(Object object0, long v) {
        return d2.c.m(object0, v);
    }

    public static Unsafe j() {
        try {
            return (Unsafe)AccessController.doPrivileged(new a2());
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static void k(Object object0, long v, boolean z) {
        d2.c.c(object0, v, z);
    }

    public static void l(Object object0, long v, double f) {
        d2.c.e(object0, v, f);
    }

    public static void m(Object object0, long v, float f) {
        d2.c.f(object0, v, f);
    }

    public static void n(int v, long v1, Object object0) {
        d2.c.n(v, v1, object0);
    }

    public static void o(long v, Object object0, Object object1) {
        d2.c.p(v, object0, object1);
    }

    public static boolean p(Object object0, long v) {
        return ((byte)(d2.c.j(object0, -4L & v) >>> ((int)((~v & 3L) << 3)) & 0xFF)) != 0;
    }

    public static boolean q(Object object0, long v) {
        return ((byte)(d2.c.j(object0, -4L & v) >>> ((int)((v & 3L) << 3)) & 0xFF)) != 0;
    }

    public static boolean r(Class class0) {
        try {
            Class class1 = Boolean.TYPE;
            d2.b.getMethod("peekLong", class0, class1);
            d2.b.getMethod("pokeLong", class0, Long.TYPE, class1);
            Class class2 = Integer.TYPE;
            d2.b.getMethod("pokeInt", class0, class2, class1);
            d2.b.getMethod("peekInt", class0, class1);
            d2.b.getMethod("pokeByte", class0, Byte.TYPE);
            d2.b.getMethod("peekByte", class0);
            d2.b.getMethod("pokeByteArray", class0, byte[].class, class2, class2);
            d2.b.getMethod("peekByteArray", class0, byte[].class, class2, class2);
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    public static boolean s(Object object0, long v) {
        return d2.c.g(object0, v);
    }

    // 去混淆评级： 低(20)
    public static int t(Class class0) {
        return d2.e ? d2.c.h(class0) : -1;
    }
}

