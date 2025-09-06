package androidx.core.view;

import android.view.animation.Interpolator;

public abstract class l1 {
    public final int a;
    public float b;
    public final Interpolator c;
    public final long d;
    public float e;

    public l1(int v, Interpolator interpolator0, long v1) {
        this.a = v;
        this.c = interpolator0;
        this.d = v1;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        return this.b;
    }

    public float c() {
        return this.c == null ? this.b : this.c.getInterpolation(this.b);
    }

    public Interpolator d() {
        return this.c;
    }

    public int e() {
        return this.a;
    }

    public void f(float f) {
        this.b = f;
    }
}

