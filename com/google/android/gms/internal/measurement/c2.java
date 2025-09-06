package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class c2 {
    public final Unsafe a;

    public c2(Unsafe unsafe0) {
        this.a = unsafe0;
    }

    public abstract double a(Object arg1, long arg2);

    public abstract float b(Object arg1, long arg2);

    public abstract void c(Object arg1, long arg2, boolean arg3);

    public abstract void d(Object arg1, long arg2, byte arg3);

    public abstract void e(Object arg1, long arg2, double arg3);

    public abstract void f(Object arg1, long arg2, float arg3);

    public abstract boolean g(Object arg1, long arg2);

    public final int h(Class class0) {
        return this.a.arrayBaseOffset(class0);
    }

    public final int i(Class class0) {
        return this.a.arrayIndexScale(class0);
    }

    public final int j(Object object0, long v) {
        return this.a.getInt(object0, v);
    }

    public final long k(Object object0, long v) {
        return this.a.getLong(object0, v);
    }

    public final void l(Field field0) {
        this.a.objectFieldOffset(field0);
    }

    public final Object m(Object object0, long v) {
        return this.a.getObject(object0, v);
    }

    public final void n(int v, long v1, Object object0) {
        this.a.putInt(object0, v1, v);
    }

    public final void o(Object object0, long v, long v1) {
        this.a.putLong(object0, v, v1);
    }

    public final void p(long v, Object object0, Object object1) {
        this.a.putObject(object0, v, object1);
    }
}

