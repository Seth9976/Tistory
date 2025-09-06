package androidx.constraintlayout.motion.widget;

public final class j extends MotionInterpolator {
    public float a;
    public float b;
    public float c;
    public final MotionLayout d;

    public j(MotionLayout motionLayout0) {
        this.d = motionLayout0;
        super();
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionInterpolator
    public final float getInterpolation(float f) {
        float f1 = this.a;
        MotionLayout motionLayout0 = this.d;
        if(Float.compare(f1, 0.0f) > 0) {
            float f2 = this.c;
            if(f1 / f2 < f) {
                f = f1 / f2;
            }
            motionLayout0.d = f1 - f2 * f;
            return f1 * f - f2 * f * f / 2.0f + this.b;
        }
        float f3 = this.c;
        if(-f1 / f3 < f) {
            f = -f1 / f3;
        }
        motionLayout0.d = f3 * f + f1;
        return f3 * f * f / 2.0f + f1 * f + this.b;
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionInterpolator
    public final float getVelocity() {
        return this.d.d;
    }
}

