package androidx.compose.animation.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0002H&J \u0010\b\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0002H\u0016J(\u0010\t\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0002H&J(\u0010\u000B\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0002H&J,\u0010\f\u001A\b\u0012\u0004\u0012\u0002H\u000E0\r\"\b\b\u0000\u0010\u000E*\u00020\u000F2\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u000E0\u0011H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/FloatAnimationSpec;", "Landroidx/compose/animation/core/AnimationSpec;", "", "getDurationNanos", "", "initialValue", "targetValue", "initialVelocity", "getEndVelocity", "getValueFromNanos", "playTimeNanos", "getVelocityFromNanos", "vectorize", "Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface FloatAnimationSpec extends AnimationSpec {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static float getEndVelocity(@NotNull FloatAnimationSpec floatAnimationSpec0, float f, float f1, float f2) {
            return floatAnimationSpec0.super.getEndVelocity(f, f1, f2);
        }

        @Deprecated
        @NotNull
        public static VectorizedFloatAnimationSpec vectorize(@NotNull FloatAnimationSpec floatAnimationSpec0, @NotNull TwoWayConverter twoWayConverter0) {
            return floatAnimationSpec0.super.vectorize(twoWayConverter0);
        }
    }

    long getDurationNanos(float arg1, float arg2, float arg3);

    default float getEndVelocity(float f, float f1, float f2) {
        return this.getVelocityFromNanos(this.getDurationNanos(f, f1, f2), f, f1, f2);
    }

    float getValueFromNanos(long arg1, float arg2, float arg3, float arg4);

    float getVelocityFromNanos(long arg1, float arg2, float arg3, float arg4);

    @Override  // androidx.compose.animation.core.AnimationSpec
    default VectorizedAnimationSpec vectorize(TwoWayConverter twoWayConverter0) {
        return this.vectorize(twoWayConverter0);
    }

    @NotNull
    default VectorizedFloatAnimationSpec vectorize(@NotNull TwoWayConverter twoWayConverter0) {
        return new VectorizedFloatAnimationSpec(this);
    }
}

