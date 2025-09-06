package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;

public final class SpringAnimation extends DynamicAnimation {
    public SpringForce m;
    public float n;
    public boolean o;

    public SpringAnimation(FloatValueHolder floatValueHolder0) {
        super(floatValueHolder0);
        this.m = null;
        this.n = 3.402823E+38f;
        this.o = false;
    }

    public SpringAnimation(Object object0, FloatPropertyCompat floatPropertyCompat0) {
        super(object0, floatPropertyCompat0);
        this.m = null;
        this.n = 3.402823E+38f;
        this.o = false;
    }

    public SpringAnimation(Object object0, FloatPropertyCompat floatPropertyCompat0, float f) {
        super(object0, floatPropertyCompat0);
        this.n = 3.402823E+38f;
        this.o = false;
        this.m = new SpringForce(f);
    }

    public void animateToFinalPosition(float f) {
        if(this.isRunning()) {
            this.n = f;
            return;
        }
        if(this.m == null) {
            this.m = new SpringForce(f);
        }
        this.m.setFinalPosition(f);
        this.start();
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation
    public final void c(float f) {
    }

    public boolean canSkipToEnd() {
        return this.m.b > 0.0;
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation
    public final boolean d(long v) {
        if(this.o) {
            float f = this.n;
            if(f != 3.402823E+38f) {
                this.m.setFinalPosition(f);
                this.n = 3.402823E+38f;
            }
            this.b = this.m.getFinalPosition();
            this.a = 0.0f;
            this.o = false;
            return true;
        }
        if(this.n == 3.402823E+38f) {
            s s2 = this.m.a(((double)this.b), ((double)this.a), v);
            this.b = s2.a;
            this.a = s2.b;
        }
        else {
            s s0 = this.m.a(((double)this.b), ((double)this.a), v / 2L);
            this.m.setFinalPosition(this.n);
            this.n = 3.402823E+38f;
            s s1 = this.m.a(((double)s0.a), ((double)s0.b), v / 2L);
            this.b = s1.a;
            this.a = s1.b;
        }
        float f1 = Math.min(Math.max(this.b, this.h), this.g);
        this.b = f1;
        if(this.m.isAtEquilibrium(f1, this.a)) {
            this.b = this.m.getFinalPosition();
            this.a = 0.0f;
            return true;
        }
        return false;
    }

    public SpringForce getSpring() {
        return this.m;
    }

    public SpringAnimation setSpring(SpringForce springForce0) {
        this.m = springForce0;
        return this;
    }

    public void skipToEnd() {
        if(!this.canSkipToEnd()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if(Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if(this.f) {
            this.o = true;
        }
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation
    public void start() {
        SpringForce springForce0 = this.m;
        if(springForce0 == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double f = (double)springForce0.getFinalPosition();
        if(f > ((double)this.g)) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if(f < ((double)this.h)) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        SpringForce springForce1 = this.m;
        double f1 = (double)(this.j * 0.75f);
        springForce1.getClass();
        double f2 = Math.abs(f1);
        springForce1.d = f2;
        springForce1.e = f2 * 62.5;
        super.start();
    }
}

