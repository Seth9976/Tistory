package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class d4 {
    public static final Unsafe a;
    public static final Class b;
    public static final c4 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final long g;
    public static final boolean h;

    static {
        Unsafe unsafe0 = d4.o();
        d4.a = unsafe0;
        d4.b = c.a;
        d4.h(Long.TYPE);
        d4.h(Integer.TYPE);
        c4 c40 = null;
        if(unsafe0 != null) {
            c40 = new b4(unsafe0);  // 初始化器: Landroidx/datastore/preferences/protobuf/c4;-><init>(Lsun/misc/Unsafe;)V
        }
        d4.c = c40;
        boolean z = false;
        d4.d = c40 == null ? false : c40.x();
        d4.e = c40 == null ? false : c40.w();
        d4.f = (long)d4.d(byte[].class);
        d4.d(boolean[].class);
        d4.e(boolean[].class);
        d4.d(int[].class);
        d4.e(int[].class);
        d4.d(long[].class);
        d4.e(long[].class);
        d4.d(float[].class);
        d4.e(float[].class);
        d4.d(double[].class);
        d4.e(double[].class);
        d4.d(Object[].class);
        d4.e(Object[].class);
        Field field0 = d4.f();
        d4.g = field0 == null || c40 == null ? -1L : c40.n(field0);
        if(ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        }
        d4.h = z;
    }

    public static void a(Throwable throwable0) {
        Logger.getLogger("androidx.datastore.preferences.protobuf.d4").log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + throwable0);
    }

    public static long b(ByteBuffer byteBuffer0) {
        return d4.c.l(byteBuffer0, d4.g);
    }

    public static Object c(Class class0) {
        try {
            return d4.a.allocateInstance(class0);
        }
        catch(InstantiationException instantiationException0) {
            throw new IllegalStateException(instantiationException0);
        }
    }

    public static int d(Class class0) {
        return d4.c.a(class0);
    }

    public static void e(Class class0) {
        d4.c.b(class0);
    }

    public static Field f() {
        Field field0 = null;
        try {
            field0 = Buffer.class.getDeclaredField("address");
        }
        catch(Throwable unused_ex) {
        }
        return field0 == null || field0.getType() != Long.TYPE ? null : field0;
    }

    public static void g(long v, byte[] arr_b, long v1, long v2) {
        d4.c.c(v, arr_b, v1, v2);
    }

    // 去混淆评级： 低(30)
    public static boolean h(Class class0) {
        return false;
    }

    public static byte i(byte[] arr_b, long v) {
        return d4.c.g(arr_b, d4.f + v);
    }

    public static byte j(Object object0, long v) {
        return (byte)(d4.c.j(object0, -4L & v) >>> ((int)((~v & 3L) << 3)) & 0xFF);
    }

    public static byte k(Object object0, long v) {
        return (byte)(d4.c.j(object0, -4L & v) >>> ((int)((v & 3L) << 3)) & 0xFF);
    }

    public static int l(Object object0, long v) {
        return d4.c.j(object0, v);
    }

    public static long m(Object object0, long v) {
        return d4.c.l(object0, v);
    }

    public static Object n(Object object0, long v) {
        return d4.c.m(object0, v);
    }

    public static Unsafe o() {
        try {
            return (Unsafe)AccessController.doPrivileged(new z3());
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static void p(Object object0, long v, boolean z) {
        d4.c.o(object0, v, z);
    }

    public static void q(long v, byte b) {
        d4.c.p(v, b);
    }

    public static void r(byte[] arr_b, long v, byte b) {
        d4.c.q(arr_b, d4.f + v, b);
    }

    public static void s(Object object0, long v, byte b) {
        int v1 = (~((int)v) & 3) << 3;
        d4.w((0xFF & b) << v1 | d4.c.j(object0, -4L & v) & ~(0xFF << v1), -4L & v, object0);
    }

    public static void t(Object object0, long v, byte b) {
        int v1 = (((int)v) & 3) << 3;
        d4.w((0xFF & b) << v1 | d4.c.j(object0, -4L & v) & ~(0xFF << v1), -4L & v, object0);
    }

    public static void u(Object object0, long v, double f) {
        d4.c.r(object0, v, f);
    }

    public static void v(Object object0, long v, float f) {
        d4.c.s(object0, v, f);
    }

    public static void w(int v, long v1, Object object0) {
        d4.c.t(v, v1, object0);
    }

    public static void x(Object object0, long v, long v1) {
        d4.c.u(object0, v, v1);
    }

    public static void y(long v, Object object0, Object object1) {
        d4.c.v(v, object0, object1);
    }
}

