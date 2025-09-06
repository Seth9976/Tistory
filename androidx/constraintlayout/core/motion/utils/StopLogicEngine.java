package androidx.constraintlayout.core.motion.utils;

import a5.b;
import r0.a;

public class StopLogicEngine implements StopEngine {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public String k;
    public boolean l;
    public float m;
    public float n;

    public StopLogicEngine() {
        this.l = false;
    }

    public final void a(float f, float f1, float f2, float f3, float f4) {
        if(f == 0.0f) {
            f = 0.0001f;
        }
        this.a = f;
        float f5 = f / f2;
        float f6 = f5 * f / 2.0f;
        if(Float.compare(f, 0.0f) < 0) {
            float f7 = (float)Math.sqrt((f1 - -f / f2 * f / 2.0f) * f2);
            if(f7 < f3) {
                this.k = "backward accelerate, decelerate";
                this.j = 2;
                this.a = f;
                this.b = f7;
                this.c = 0.0f;
                float f8 = (f7 - f) / f2;
                this.d = f8;
                this.e = f7 / f2;
                this.g = (f + f7) * f8 / 2.0f;
                this.h = f1;
                this.i = f1;
                return;
            }
            this.k = "backward accelerate cruse decelerate";
            this.j = 3;
            this.a = f;
            this.b = f3;
            this.c = f3;
            float f9 = (f3 - f) / f2;
            this.d = f9;
            float f10 = f3 / f2;
            this.f = f10;
            float f11 = (f + f3) * f9 / 2.0f;
            float f12 = f10 * f3 / 2.0f;
            this.e = (f1 - f11 - f12) / f3;
            this.g = f11;
            this.h = f1 - f12;
            this.i = f1;
            return;
        }
        if(f6 >= f1) {
            this.k = "hard stop";
            this.j = 1;
            this.a = f;
            this.b = 0.0f;
            this.g = f1;
            this.d = 2.0f * f1 / f;
            return;
        }
        float f13 = f1 - f6;
        float f14 = f13 / f;
        if(f14 + f5 < f4) {
            this.k = "cruse decelerate";
            this.j = 2;
            this.a = f;
            this.b = f;
            this.c = 0.0f;
            this.g = f13;
            this.h = f1;
            this.d = f14;
            this.e = f5;
            return;
        }
        float f15 = (float)Math.sqrt(f * f / 2.0f + f2 * f1);
        float f16 = (f15 - f) / f2;
        this.d = f16;
        float f17 = f15 / f2;
        this.e = f17;
        if(f15 < f3) {
            this.k = "accelerate decelerate";
            this.j = 2;
            this.a = f;
            this.b = f15;
            this.c = 0.0f;
            this.d = f16;
            this.e = f17;
            this.g = (f + f15) * f16 / 2.0f;
            this.h = f1;
            return;
        }
        this.k = "accelerate cruse decelerate";
        this.j = 3;
        this.a = f;
        this.b = f3;
        this.c = f3;
        float f18 = (f3 - f) / f2;
        this.d = f18;
        float f19 = f3 / f2;
        this.f = f19;
        float f20 = (f + f3) * f18 / 2.0f;
        float f21 = f19 * f3 / 2.0f;
        this.e = (f1 - f20 - f21) / f3;
        this.g = f20;
        this.h = f1 - f21;
        this.i = f1;
    }

    public void config(float f, float f1, float f2, float f3, float f4, float f5) {
        this.m = f;
        boolean z = f > f1;
        this.l = z;
        if(z) {
            this.a(-f2, f - f1, f4, f5, f3);
            return;
        }
        this.a(f2, f1 - f, f4, f5, f3);
    }

    @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String s, float f) {
        StringBuilder stringBuilder0 = b.u(a.o(b.u(s, " ===== "), this.k, "\n"), s);
        stringBuilder0.append((this.l ? "backwards" : "forward "));
        stringBuilder0.append(" time = ");
        stringBuilder0.append(f);
        stringBuilder0.append("  stages ");
        String s1 = wb.a.c(this.j, "\n", stringBuilder0);
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(s1);
        stringBuilder1.append(s);
        stringBuilder1.append(" dur ");
        stringBuilder1.append(this.d);
        stringBuilder1.append(" vel ");
        stringBuilder1.append(this.a);
        stringBuilder1.append(" pos ");
        String s2 = androidx.room.a.h(this.g, "\n", stringBuilder1);
        if(this.j > 1) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(s2);
            stringBuilder2.append(s);
            stringBuilder2.append(" dur ");
            stringBuilder2.append(this.e);
            stringBuilder2.append(" vel ");
            stringBuilder2.append(this.b);
            stringBuilder2.append(" pos ");
            s2 = androidx.room.a.h(this.h, "\n", stringBuilder2);
        }
        if(this.j > 2) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(s2);
            stringBuilder3.append(s);
            stringBuilder3.append(" dur ");
            stringBuilder3.append(this.f);
            stringBuilder3.append(" vel ");
            stringBuilder3.append(this.c);
            stringBuilder3.append(" pos ");
            s2 = androidx.room.a.h(this.i, "\n", stringBuilder3);
        }
        float f1 = this.d;
        if(f <= f1) {
            return s2 + s + "stage 0\n";
        }
        int v = this.j;
        if(v == 1) {
            return s2 + s + "end stage 0\n";
        }
        float f2 = f - f1;
        float f3 = this.e;
        if(f2 < f3) {
            return s2 + s + " stage 1\n";
        }
        if(v == 2) {
            return s2 + s + "end stage 1\n";
        }
        return f2 - f3 < this.f ? s2 + s + " stage 2\n" : s2 + s + " end stage 2\n";
    }

    @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f) {
        float f2;
        float f1 = this.d;
        if(Float.compare(f, f1) <= 0) {
            f2 = (this.b - this.a) * f * f / (f1 * 2.0f) + this.a * f;
        }
        else {
            int v = this.j;
            if(v == 1) {
                f2 = this.g;
            }
            else {
                float f3 = f - f1;
                float f4 = this.e;
                if(f3 < f4) {
                    f2 = (this.c - this.b) * f3 * f3 / (f4 * 2.0f) + (this.b * f3 + this.g);
                }
                else if(v == 2) {
                    f2 = this.h;
                }
                else {
                    float f5 = f3 - f4;
                    float f6 = this.f;
                    if(f5 <= f6) {
                        float f7 = this.c * f5;
                        f2 = this.h + f7 - f7 * f5 / (f6 * 2.0f);
                    }
                    else {
                        f2 = this.i;
                    }
                }
            }
        }
        this.n = f;
        return this.l ? this.m - f2 : this.m + f2;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return this.l ? -this.getVelocity(this.n) : this.getVelocity(this.n);
    }

    @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f) {
        float f1 = this.d;
        if(f <= f1) {
            return (this.b - this.a) * f / f1 + this.a;
        }
        int v = this.j;
        if(v == 1) {
            return 0.0f;
        }
        f -= f1;
        f1 = this.e;
        if(f < f1) {
            return (this.c - this.b) * f / f1 + this.b;
        }
        if(v == 2) {
            return this.h;
        }
        float f2 = f - f1;
        return f2 < this.f ? this.c - f2 * this.c / this.f : this.i;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        return this.getVelocity() < 0.00001f && Math.abs(this.i - this.n) < 0.00001f;
    }
}

