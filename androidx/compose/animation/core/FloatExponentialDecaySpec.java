package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000F\b\u0007\u0018\u00002\u00020\u0001B\u001B\u0012\b\b\u0003\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\'\u0010\u000B\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\'\u0010\r\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\fJ\u001F\u0010\u000E\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u001F\u0010\u0010\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001A\u0010\u0004\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/core/FloatExponentialDecaySpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "", "frictionMultiplier", "absVelocityThreshold", "<init>", "(FF)V", "", "playTimeNanos", "initialValue", "initialVelocity", "getValueFromNanos", "(JFF)F", "getVelocityFromNanos", "getDurationNanos", "(FF)J", "getTargetValue", "(FF)F", "a", "F", "getAbsVelocityThreshold", "()F", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FloatExponentialDecaySpec implements FloatDecayAnimationSpec {
    public static final int $stable;
    public final float a;
    public final float b;

    public FloatExponentialDecaySpec() {
        this(0.0f, 0.0f, 3, null);
    }

    public FloatExponentialDecaySpec(@FloatRange(from = 0.0, fromInclusive = false) float f, @FloatRange(from = 0.0, fromInclusive = false) float f1) {
        this.a = Math.max(1.000000E-07f, Math.abs(f1));
        this.b = Math.max(0.0001f, f) * -4.2f;
    }

    public FloatExponentialDecaySpec(float f, float f1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.1f;
        }
        this(f, f1);
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.a;
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f, float f1) {
        return ((long)(((float)Math.log(this.getAbsVelocityThreshold() / Math.abs(f1))) * 1000.0f / this.b)) * 1000000L;
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f, float f1) {
        return Math.abs(f1) <= this.getAbsVelocityThreshold() ? f : f1 / this.b * ((float)Math.exp(((double)this.b) * (Math.log(Math.abs(this.getAbsVelocityThreshold() / f1)) / ((double)this.b) * 1000.0) / 1000.0)) + (f - f1 / this.b);
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long v, float f, float f1) {
        return f1 / this.b * ((float)Math.exp(this.b * ((float)(v / 1000000L)) / 1000.0f)) + (f - f1 / this.b);
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long v, float f, float f1) {
        return f1 * ((float)Math.exp(((float)(v / 1000000L)) / 1000.0f * this.b));
    }
}

