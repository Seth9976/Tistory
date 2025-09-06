package androidx.compose.animation;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\t\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\'\u0010\r\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u001F\u0010\u000F\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\'\u0010\u0011\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u000ER\u0014\u0010\u0014\u001A\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/SplineBasedFloatDecayAnimationSpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "", "initialValue", "initialVelocity", "getTargetValue", "(FF)F", "", "playTimeNanos", "getValueFromNanos", "(JFF)F", "getDurationNanos", "(FF)J", "getVelocityFromNanos", "getAbsVelocityThreshold", "()F", "absVelocityThreshold", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {
    public static final int $stable;
    public final FlingCalculator a;

    public SplineBasedFloatDecayAnimationSpec(@NotNull Density density0) {
        this.a = new FlingCalculator(0.015f, density0);
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f, float f1) {
        return this.a.flingDuration(f1) * 1000000L;
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f, float f1) {
        return Math.signum(f1) * this.a.flingDistance(f1) + f;
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long v, float f, float f1) {
        return this.a.flingInfo(f1).position(v / 1000000L) + f;
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long v, float f, float f1) {
        return this.a.flingInfo(f1).velocity(v / 1000000L);
    }
}

