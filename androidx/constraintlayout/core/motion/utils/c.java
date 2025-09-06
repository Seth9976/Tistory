package androidx.constraintlayout.core.motion.utils;

public final class c extends Easing {
    public final double c;
    public final double d;
    public final double e;
    public final double f;

    public c(String s) {
        this.a = s;
        int v = s.indexOf(40);
        int v1 = s.indexOf(44, v);
        this.c = Double.parseDouble(s.substring(v + 1, v1).trim());
        int v2 = s.indexOf(44, v1 + 1);
        this.d = Double.parseDouble(s.substring(v1 + 1, v2).trim());
        int v3 = s.indexOf(44, v2 + 1);
        this.e = Double.parseDouble(s.substring(v2 + 1, v3).trim());
        this.f = Double.parseDouble(s.substring(v3 + 1, s.indexOf(41, v3 + 1)).trim());
    }

    public final double a(double f) {
        double f1 = 3.0 * (1.0 - f);
        return this.e * (f1 * f * f) + this.c * ((1.0 - f) * f1 * f) + f * f * f;
    }

    public final double b(double f) {
        double f1 = 3.0 * (1.0 - f);
        return this.f * (f1 * f * f) + this.d * ((1.0 - f) * f1 * f) + f * f * f;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.Easing
    public final double get(double f) {
        if(f <= 0.0) {
            return 0.0;
        }
        if(f >= 1.0) {
            return 1.0;
        }
        double f1 = 0.5;
        double f2 = 0.5;
        while(f1 > 0.01) {
            f1 *= 0.5;
            if(this.a(f2) < f) {
                f2 += f1;
            }
            else {
                f2 -= f1;
            }
        }
        double f3 = f2 - f1;
        double f4 = this.a(f3);
        double f5 = f2 + f1;
        double f6 = this.a(f5);
        double f7 = this.b(f3);
        return (f - f4) * (this.b(f5) - f7) / (f6 - f4) + f7;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.Easing
    public final double getDiff(double f) {
        double f1 = 0.5;
        double f2 = 0.5;
        while(f1 > 0.0001) {
            f1 *= 0.5;
            if(this.a(f2) < f) {
                f2 += f1;
            }
            else {
                f2 -= f1;
            }
        }
        return (this.b(f2 + f1) - this.b(f2 - f1)) / (this.a(f2 + f1) - this.a(f2 - f1));
    }
}

