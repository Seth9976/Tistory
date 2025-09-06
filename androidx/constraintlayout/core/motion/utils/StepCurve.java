package androidx.constraintlayout.core.motion.utils;

public class StepCurve extends Easing {
    public MonotonicCurveFit c;

    @Override  // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double f) {
        return this.c.getPos(f, 0);
    }

    @Override  // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double f) {
        return this.c.getSlope(f, 0);
    }
}

