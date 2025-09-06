package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A;\u0010\u0007\u001A\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001A\u00028\u00002\u0006\u0010\u0004\u001A\u00028\u00002\u0006\u0010\u0005\u001A\u00028\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001AC\u0010\r\u001A\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010\f\u001A\u00028\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000E\u001A\u001F\u0010\u0011\u001A\u00020\u0006*\u0006\u0012\u0002\b\u00030\u000F2\u0006\u0010\u0010\u001A\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "initialValue", "targetValue", "initialVelocity", "", "getDurationMillis", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "playTimeMillis", "start", "end", "startVelocity", "getValueFromMillis", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "playTime", "clampPlayTime", "(Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;J)J", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class VectorizedAnimationSpecKt {
    public static final Animations access$createSpringAnimations(AnimationVector animationVector0, float f, float f1) {
        return animationVector0 != null ? new VectorizedAnimationSpecKt.createSpringAnimations.1(animationVector0, f, f1) : new VectorizedAnimationSpecKt.createSpringAnimations.2(f, f1);
    }

    public static final long clampPlayTime(@NotNull VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, long v) {
        return c.coerceIn(v - ((long)vectorizedDurationBasedAnimationSpec0.getDelayMillis()), 0L, vectorizedDurationBasedAnimationSpec0.getDurationMillis());
    }

    public static final long getDurationMillis(@NotNull VectorizedAnimationSpec vectorizedAnimationSpec0, @NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        return vectorizedAnimationSpec0.getDurationNanos(animationVector0, animationVector1, animationVector2) / 1000000L;
    }

    @NotNull
    public static final AnimationVector getValueFromMillis(@NotNull VectorizedAnimationSpec vectorizedAnimationSpec0, long v, @NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        return vectorizedAnimationSpec0.getValueFromNanos(v * 1000000L, animationVector0, animationVector1, animationVector2);
    }
}

