package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;

public final class FlingAnimation extends DynamicAnimation {
    public final t m;

    public FlingAnimation(FloatValueHolder floatValueHolder0) {
        super(floatValueHolder0);
        t t0 = new t();
        this.m = t0;
        t0.b = this.j * 46.875f;
    }

    public FlingAnimation(Object object0, FloatPropertyCompat floatPropertyCompat0) {
        super(object0, floatPropertyCompat0);
        t t0 = new t();
        this.m = t0;
        t0.b = this.j * 46.875f;
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation
    public final void c(float f) {
        this.m.b = f * 62.5f;
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation
    public final boolean d(long v) {
        float f = this.b;
        t t0 = this.m;
        s s0 = t0.c;
        s0.b = (float)(Math.exp(((float)v) / 1000.0f * t0.a) * ((double)this.a));
        float f1 = t0.a;
        float f2 = this.a / f1;
        float f3 = (float)(Math.exp(f1 * ((float)v) / 1000.0f) * ((double)f2) + ((double)(f - f2)));
        s0.a = f3;
        if(t0.isAtEquilibrium(f3, s0.b)) {
            s0.b = 0.0f;
        }
        float f4 = s0.a;
        this.b = f4;
        float f5 = s0.b;
        this.a = f5;
        float f6 = this.h;
        if(Float.compare(f4, f6) < 0) {
            this.b = f6;
            return true;
        }
        float f7 = this.g;
        if(f4 > f7) {
            this.b = f7;
            return true;
        }
        return f4 >= f7 || f4 <= f6 || t0.isAtEquilibrium(f4, f5);
    }

    public float getFriction() {
        return this.m.a / -4.2f;
    }

    public FlingAnimation setFriction(@FloatRange(from = 0.0, fromInclusive = false) float f) {
        if(f <= 0.0f) {
            throw new IllegalArgumentException("Friction must be positive");
        }
        this.m.a = f * -4.2f;
        return this;
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation
    public DynamicAnimation setMaxValue(float f) {
        return this.setMaxValue(f);
    }

    public FlingAnimation setMaxValue(float f) {
        super.setMaxValue(f);
        return this;
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation
    public DynamicAnimation setMinValue(float f) {
        return this.setMinValue(f);
    }

    public FlingAnimation setMinValue(float f) {
        super.setMinValue(f);
        return this;
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation
    public DynamicAnimation setStartVelocity(float f) {
        return this.setStartVelocity(f);
    }

    public FlingAnimation setStartVelocity(float f) {
        super.setStartVelocity(f);
        return this;
    }
}

