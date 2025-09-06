package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000EJ/\u0010\u000F\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000F\u0010\u000EJ\'\u0010\u0010\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\'\u0010\u0012\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001A\u0004\b\u0019\u0010\u0017¨\u0006\u001A"}, d2 = {"Landroidx/compose/animation/core/FloatSpringSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "", "dampingRatio", "stiffness", "visibilityThreshold", "<init>", "(FFF)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JFFF)F", "getVelocityFromNanos", "getEndVelocity", "(FFF)F", "getDurationNanos", "(FFF)J", "a", "F", "getDampingRatio", "()F", "b", "getStiffness", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FloatSpringSpec implements FloatAnimationSpec {
    public static final int $stable = 8;
    public final float a;
    public final float b;
    public final float c;
    public final SpringSimulation d;

    public FloatSpringSpec() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public FloatSpringSpec(float f, float f1, float f2) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        SpringSimulation springSimulation0 = new SpringSimulation(1.0f);
        springSimulation0.setDampingRatio(f);
        springSimulation0.setStiffness(f1);
        this.d = springSimulation0;
    }

    public FloatSpringSpec(float f, float f1, float f2, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 1500.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.01f;
        }
        this(f, f1, f2);
    }

    public final float getDampingRatio() {
        return this.a;
    }

    @Override  // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float f, float f1, float f2) {
        return SpringEstimationKt.estimateAnimationDurationMillis(this.d.getStiffness(), this.d.getDampingRatio(), f2 / this.c, (f - f1) / this.c, 1.0f) * 1000000L;
    }

    @Override  // androidx.compose.animation.core.FloatAnimationSpec
    public float getEndVelocity(float f, float f1, float f2) {
        return 0.0f;
    }

    public final float getStiffness() {
        return this.b;
    }

    @Override  // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long v, float f, float f1, float f2) {
        this.d.setFinalPosition(f1);
        return Motion.getValue-impl(this.d.updateValues-IJZedt4$animation_core_release(f, f2, v / 1000000L));
    }

    @Override  // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long v, float f, float f1, float f2) {
        this.d.setFinalPosition(f1);
        return Motion.getVelocity-impl(this.d.updateValues-IJZedt4$animation_core_release(f, f2, v / 1000000L));
    }
}

