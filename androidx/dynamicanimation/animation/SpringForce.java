package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public final class SpringForce implements Force {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;
    public double a;
    public double b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public final s j;

    public SpringForce() {
        this.a = 38.729833;
        this.b = 0.5;
        this.c = false;
        this.i = 1.797693E+308;
        this.j = new s();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public SpringForce(float f) {
        this.a = 38.729833;
        this.b = 0.5;
        this.c = false;
        this.j = new s();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.i = (double)f;
    }

    public final s a(double f, double f1, long v) {
        double f9;
        double f8;
        if(!this.c) {
            if(this.i == 1.797693E+308) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double f2 = this.b;
            if(f2 > 1.0) {
                this.f = Math.sqrt(f2 * f2 - 1.0) * this.a + -f2 * this.a;
                this.g = -this.b * this.a - Math.sqrt(this.b * this.b - 1.0) * this.a;
            }
            else if(f2 >= 0.0 && f2 < 1.0) {
                this.h = Math.sqrt(1.0 - f2 * f2) * this.a;
            }
            this.c = true;
        }
        double f3 = f - this.i;
        double f4 = this.b;
        int v1 = Double.compare(f4, 1.0);
        if(v1 > 0) {
            double f5 = this.g;
            double f6 = (f5 * f3 - f1) / (f5 - this.f);
            double f7 = f3 - f6;
            f8 = Math.pow(2.718282, this.f * (((double)v) / 1000.0)) * f6 + Math.pow(2.718282, f5 * (((double)v) / 1000.0)) * f7;
            f9 = Math.pow(2.718282, this.f * (((double)v) / 1000.0)) * (f6 * this.f) + Math.pow(2.718282, this.g * (((double)v) / 1000.0)) * (f7 * this.g);
        }
        else if(v1 == 0) {
            double f10 = this.a * f3 + f1;
            double f11 = f10 * (((double)v) / 1000.0) + f3;
            f9 = Math.pow(2.718282, -this.a * (((double)v) / 1000.0)) * f10 + Math.pow(2.718282, -this.a * (((double)v) / 1000.0)) * f11 * -this.a;
            f8 = Math.pow(2.718282, -this.a * (((double)v) / 1000.0)) * f11;
        }
        else {
            double f12 = this.a;
            double f13 = (f4 * f12 * f3 + f1) * (1.0 / this.h);
            double f14 = (Math.sin(this.h * (((double)v) / 1000.0)) * f13 + Math.cos(this.h * (((double)v) / 1000.0)) * f3) * Math.pow(2.718282, -f4 * f12 * (((double)v) / 1000.0));
            f9 = (Math.cos(this.h * (((double)v) / 1000.0)) * (f13 * this.h) + Math.sin(this.h * (((double)v) / 1000.0)) * (-this.h * f3)) * Math.pow(2.718282, -this.b * this.a * (((double)v) / 1000.0)) + -this.a * f14 * this.b;
            f8 = f14;
        }
        this.j.a = (float)(f8 + this.i);
        this.j.b = (float)f9;
        return this.j;
    }

    @Override  // androidx.dynamicanimation.animation.Force
    @RestrictTo({Scope.LIBRARY})
    public float getAcceleration(float f, float f1) {
        return (float)(-(this.a * this.a) * ((double)(f - this.getFinalPosition())) - this.a * 2.0 * this.b * ((double)f1));
    }

    public float getDampingRatio() {
        return (float)this.b;
    }

    public float getFinalPosition() {
        return (float)this.i;
    }

    public float getStiffness() {
        return (float)(this.a * this.a);
    }

    @Override  // androidx.dynamicanimation.animation.Force
    @RestrictTo({Scope.LIBRARY})
    public boolean isAtEquilibrium(float f, float f1) {
        return ((double)Math.abs(f1)) < this.e && ((double)Math.abs(f - this.getFinalPosition())) < this.d;
    }

    public SpringForce setDampingRatio(@FloatRange(from = 0.0) float f) {
        if(f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.b = (double)f;
        this.c = false;
        return this;
    }

    public SpringForce setFinalPosition(float f) {
        this.i = (double)f;
        return this;
    }

    public SpringForce setStiffness(@FloatRange(from = 0.0, fromInclusive = false) float f) {
        if(f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.a = Math.sqrt(f);
        this.c = false;
        return this;
    }
}

