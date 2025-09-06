package androidx.compose.foundation.layout;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.ui.unit.Density;

public final class w3 implements FloatDecayAnimationSpec {
    public final float a;

    public w3(Density density0) {
        this.a = density0.getDensity() * 51890.199219f;
    }

    // 去混淆评级： 中等(80)
    public final float a(float f) {
        return Math.signum(f) * ((float)(Math.exp(1.736268 * Math.log(((double)(Math.abs(f) * 0.35f)) / ((double)(0.015f * this.a)))) * ((double)(0.015f * this.a))));
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float getAbsVelocityThreshold() {
        return 0.0f;
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final long getDurationNanos(float f, float f1) {
        return (long)(Math.exp(Math.log(((double)(Math.abs(f1) * 0.35f)) / ((double)(0.015f * this.a))) / 1.358202) * 1000000000.0);
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float getTargetValue(float f, float f1) {
        return this.a(f1) + f;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float getValueFromNanos(long v, float f, float f1) {
        long v1 = this.getDurationNanos(0.0f, f1);
        return v1 <= 0L ? 1.0f * this.a(f1) + f : AndroidFlingSpline.FlingResult.getDistanceCoefficient-impl(e.a(((float)v) / ((float)v1))) * this.a(f1) + f;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float getVelocityFromNanos(long v, float f, float f1) {
        long v1 = this.getDurationNanos(0.0f, f1);
        return v1 <= 0L ? 0.0f * this.a(f1) / ((float)v1) * 1000000000.0f : AndroidFlingSpline.FlingResult.getVelocityCoefficient-impl(e.a(((float)v) / ((float)v1))) * this.a(f1) / ((float)v1) * 1000000000.0f;
    }
}

