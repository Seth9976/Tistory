package androidx.constraintlayout.core.motion.utils;

public class SpringStopEngine implements StopEngine {
    public double a;
    public double b;
    public double c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;

    public SpringStopEngine() {
        this.a = 0.5;
        this.i = 0;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String s, float f) {
        return null;
    }

    public float getAcceleration() {
        return ((float)(-this.b * (((double)this.e) - this.c) - this.a * ((double)this.f))) / this.g;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f) {
        double f1 = (double)(f - this.d);
        double f2 = this.b;
        double f3 = this.a;
        int v = (int)(9.0 / (Math.sqrt(f2 / ((double)this.g)) * f1 * 4.0) + 1.0);
        double f4 = f1 / ((double)v);
        for(int v1 = 0; v1 < v; ++v1) {
            double f5 = (double)this.e;
            double f6 = this.c;
            double f7 = (double)this.f;
            double f8 = (double)this.g;
            double f9 = (-f2 * (f5 - f6) - f3 * f7) / f8 * f4 / 2.0 + f7;
            double f10 = (-(f4 * f9 / 2.0 + f5 - f6) * f2 - f9 * f3) / f8 * f4;
            float f11 = (float)(f7 + f10);
            this.f = f11;
            float f12 = (float)((f10 / 2.0 + f7) * f4 + f5);
            this.e = f12;
            int v2 = this.i;
            if(v2 > 0) {
                if(f12 < 0.0f && (v2 & 1) == 1) {
                    this.e = -f12;
                    this.f = -f11;
                }
                float f13 = this.e;
                if(f13 > 1.0f && (v2 & 2) == 2) {
                    this.e = 2.0f - f13;
                    this.f = -this.f;
                }
            }
        }
        this.d = f;
        return this.e;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return 0.0f;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f) {
        return this.f;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        double f = ((double)this.e) - this.c;
        double f1 = (double)this.f;
        return Math.sqrt((this.b * f * f + f1 * f1 * ((double)this.g)) / this.b) <= ((double)this.h);
    }

    public void springConfig(float f, float f1, float f2, float f3, float f4, float f5, float f6, int v) {
        this.c = (double)f1;
        this.a = (double)f5;
        this.e = f;
        this.b = (double)f4;
        this.g = f3;
        this.h = f6;
        this.i = v;
        this.d = 0.0f;
    }
}

