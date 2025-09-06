package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public final class b4 extends c4 {
    @Override  // androidx.datastore.preferences.protobuf.c4
    public final void c(long v, byte[] arr_b, long v1, long v2) {
        this.a.copyMemory(null, v, arr_b, d4.f + v1, v2);
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final void d(byte[] arr_b, long v, long v1, long v2) {
        this.a.copyMemory(arr_b, d4.f + v, null, v1, v2);
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final boolean e(Object object0, long v) {
        return this.a.getBoolean(object0, v);
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final byte f(long v) {
        return this.a.getByte(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final byte g(Object object0, long v) {
        return this.a.getByte(object0, v);
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final double h(Object object0, long v) {
        return this.a.getDouble(object0, v);
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final float i(Object object0, long v) {
        return this.a.getFloat(object0, v);
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final long k(long v) {
        return this.a.getLong(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final void o(Object object0, long v, boolean z) {
        this.a.putBoolean(object0, v, z);
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final void p(long v, byte b) {
        this.a.putByte(v, b);
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final void q(Object object0, long v, byte b) {
        this.a.putByte(object0, v, b);
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final void r(Object object0, long v, double f) {
        this.a.putDouble(object0, v, f);
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final void s(Object object0, long v, float f) {
        this.a.putFloat(object0, v, f);
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final boolean w() {
        Class class0 = Object.class;
        if(!super.w()) {
            return false;
        }
        try {
            Class class1 = this.a.getClass();
            Class class2 = Long.TYPE;
            class1.getMethod("getByte", class0, class2);
            class1.getMethod("putByte", class0, class2, Byte.TYPE);
            class1.getMethod("getBoolean", class0, class2);
            class1.getMethod("putBoolean", class0, class2, Boolean.TYPE);
            class1.getMethod("getFloat", class0, class2);
            class1.getMethod("putFloat", class0, class2, Float.TYPE);
            class1.getMethod("getDouble", class0, class2);
            class1.getMethod("putDouble", class0, class2, Double.TYPE);
            return true;
        }
        catch(Throwable throwable0) {
            d4.a(throwable0);
            return false;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final boolean x() {
        Class class2;
        Class class0 = Object.class;
        Unsafe unsafe0 = this.a;
        if(unsafe0 != null) {
            try {
                Class class1 = unsafe0.getClass();
                class1.getMethod("objectFieldOffset", Field.class);
                class2 = Long.TYPE;
                class1.getMethod("getLong", class0, class2);
                if(d4.f() != null) {
                    goto label_12;
                }
            }
            catch(Throwable throwable0) {
                d4.a(throwable0);
            }
            return false;
            try {
            label_12:
                Class class3 = this.a.getClass();
                class3.getMethod("getByte", class2);
                class3.getMethod("putByte", class2, Byte.TYPE);
                class3.getMethod("getInt", class2);
                class3.getMethod("putInt", class2, Integer.TYPE);
                class3.getMethod("getLong", class2);
                class3.getMethod("putLong", class2, class2);
                class3.getMethod("copyMemory", class2, class2, class2);
                class3.getMethod("copyMemory", class0, class2, class0, class2, class2);
                return true;
            }
            catch(Throwable throwable1) {
                d4.a(throwable1);
                return false;
            }
        }
        return false;
    }
}

