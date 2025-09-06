package androidx.constraintlayout.core.motion.utils;

public final class a {
    public double[] a;
    public double b;
    public double c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public double j;
    public double k;
    public double l;
    public double m;
    public double n;
    public double o;
    public double p;
    public boolean q;
    public boolean r;
    public static final double[] s;

    static {
        a.s = new double[91];
    }

    public final double a() {
        double f = this.j * this.p;
        double f1 = this.n / Math.hypot(f, -this.k * this.o);
        if(this.q) {
            f = -f;
        }
        return f * f1;
    }

    public final double b() {
        double f = -this.k * this.o;
        double f1 = this.n / Math.hypot(this.j * this.p, f);
        return this.q ? -f * f1 : f * f1;
    }

    public final double c(double f) {
        return (this.f - this.e) * ((f - this.c) * this.i) + this.e;
    }

    public final double d(double f) {
        return (this.h - this.g) * ((f - this.c) * this.i) + this.g;
    }

    public final double e() {
        return this.j * this.o + this.l;
    }

    public final double f() {
        return this.k * this.p + this.m;
    }

    public final void g(double f) {
        double f1 = (this.q ? this.d - f : f - this.c) * this.i;
        double f2 = 0.0;
        if(f1 > 0.0 && f1 < 1.0) {
            double[] arr_f = this.a;
            double f3 = f1 * ((double)(arr_f.length - 1));
            double f4 = arr_f[((int)f3)];
            f2 = (arr_f[((int)f3) + 1] - f4) * (f3 - ((double)(((int)f3)))) + f4;
        }
        this.o = Math.sin(f2 * 1.570796);
        this.p = Math.cos(f2 * 1.570796);
    }
}

