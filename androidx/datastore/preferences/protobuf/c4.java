package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class c4 {
    public final Unsafe a;

    public c4(Unsafe unsafe0) {
        this.a = unsafe0;
    }

    public final int a(Class class0) {
        return this.a.arrayBaseOffset(class0);
    }

    public final int b(Class class0) {
        return this.a.arrayIndexScale(class0);
    }

    public abstract void c(long arg1, byte[] arg2, long arg3, long arg4);

    public abstract void d(byte[] arg1, long arg2, long arg3, long arg4);

    public abstract boolean e(Object arg1, long arg2);

    public abstract byte f(long arg1);

    public abstract byte g(Object arg1, long arg2);

    public abstract double h(Object arg1, long arg2);

    public abstract float i(Object arg1, long arg2);

    public final int j(Object object0, long v) {
        return this.a.getInt(object0, v);
    }

    public abstract long k(long arg1);

    public final long l(Object object0, long v) {
        return this.a.getLong(object0, v);
    }

    public final Object m(Object object0, long v) {
        return this.a.getObject(object0, v);
    }

    public final long n(Field field0) {
        return this.a.objectFieldOffset(field0);
    }

    public abstract void o(Object arg1, long arg2, boolean arg3);

    public abstract void p(long arg1, byte arg2);

    public abstract void q(Object arg1, long arg2, byte arg3);

    public abstract void r(Object arg1, long arg2, double arg3);

    public abstract void s(Object arg1, long arg2, float arg3);

    public final void t(int v, long v1, Object object0) {
        this.a.putInt(object0, v1, v);
    }

    public final void u(Object object0, long v, long v1) {
        this.a.putLong(object0, v, v1);
    }

    public final void v(long v, Object object0, Object object1) {
        this.a.putObject(object0, v, object1);
    }

    public boolean w() {
        Class class0 = Class.class;
        Class class1 = Object.class;
        Unsafe unsafe0 = this.a;
        if(unsafe0 == null) {
            return false;
        }
        try {
            Class class2 = unsafe0.getClass();
            class2.getMethod("objectFieldOffset", Field.class);
            class2.getMethod("arrayBaseOffset", class0);
            class2.getMethod("arrayIndexScale", class0);
            Class class3 = Long.TYPE;
            class2.getMethod("getInt", class1, class3);
            class2.getMethod("putInt", class1, class3, Integer.TYPE);
            class2.getMethod("getLong", class1, class3);
            class2.getMethod("putLong", class1, class3, class3);
            class2.getMethod("getObject", class1, class3);
            class2.getMethod("putObject", class1, class3, class1);
            return true;
        }
        catch(Throwable throwable0) {
            d4.a(throwable0);
            return false;
        }
    }

    public abstract boolean x();
}

