package androidx.constraintlayout.core.motion.utils;

public class Schlick extends Easing {
    public double c;
    public double d;

    @Override  // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double f) {
        return Double.compare(f, this.d) >= 0 ? (f - 1.0) * (1.0 - this.d) / (1.0 - f - (this.d - f) * this.c) : this.d * f / ((this.d - f) * this.c + f);
    }

    @Override  // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double f) {
        double f1 = this.d;
        double f2 = this.c;
        if(Double.compare(f, f1) < 0) {
            double f3 = (f1 - f) * f2 + f;
            return f2 * f1 * f1 / (f3 * f3);
        }
        double f4 = (f1 - f) * -f2 - f + 1.0;
        return (f1 - 1.0) * f2 * (f1 - 1.0) / (f4 * f4);
    }
}

