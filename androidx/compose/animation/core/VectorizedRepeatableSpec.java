package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000F\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\b\u0017\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BB1\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\r\u001A\u00020\f¢\u0006\u0004\b\n\u0010\u000EJ/\u0010\u0014\u001A\u00028\u00002\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00028\u00002\u0006\u0010\u0013\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001A\u00028\u00002\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00028\u00002\u0006\u0010\u0013\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\'\u0010\u0017\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00028\u00002\u0006\u0010\u0013\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001A\u0010\u001D\u001A\u00020\u000F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Landroidx/compose/animation/core/VectorizedRepeatableSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "", "iterations", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "animation", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "<init>", "(ILandroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)V", "Landroidx/compose/animation/core/StartOffset;", "initialStartOffset", "(ILandroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "getDurationNanos", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "d", "J", "getDurationNanos$animation_core_release", "()J", "durationNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class VectorizedRepeatableSpec implements VectorizedFiniteAnimationSpec {
    public static final int $stable = 8;
    public final int a;
    public final VectorizedDurationBasedAnimationSpec b;
    public final RepeatMode c;
    public final long d;
    public final long e;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public VectorizedRepeatableSpec(int v, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, RepeatMode repeatMode0) {
        this(v, vectorizedDurationBasedAnimationSpec0, repeatMode0, 0L, null);
    }

    public VectorizedRepeatableSpec(int v, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, RepeatMode repeatMode0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            repeatMode0 = RepeatMode.Restart;
        }
        this(v, vectorizedDurationBasedAnimationSpec0, repeatMode0);
    }

    public VectorizedRepeatableSpec(int v, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, RepeatMode repeatMode0, long v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 4) != 0) {
            repeatMode0 = RepeatMode.Restart;
        }
        if((v2 & 8) != 0) {
            v1 = 0L;
        }
        this(v, vectorizedDurationBasedAnimationSpec0, repeatMode0, v1, null);
    }

    public VectorizedRepeatableSpec(int v, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, RepeatMode repeatMode0, long v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = vectorizedDurationBasedAnimationSpec0;
        this.c = repeatMode0;
        if(v < 1) {
            throw new IllegalArgumentException("Iterations count can\'t be less than 1");
        }
        int v2 = vectorizedDurationBasedAnimationSpec0.getDelayMillis();
        this.d = ((long)(vectorizedDurationBasedAnimationSpec0.getDurationMillis() + v2)) * 1000000L;
        this.e = v1 * 1000000L;
    }

    public final long a(long v) {
        long v1 = this.e;
        if(v + v1 <= 0L) {
            return 0L;
        }
        long v2 = v + v1;
        long v3 = Math.min(v2 / this.d, ((long)this.a) - 1L);
        return this.c == RepeatMode.Restart || v3 % 2L == 0L ? v2 - v3 * this.d : (v3 + 1L) * this.d - v2;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(@NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        return ((long)this.a) * this.d - this.e;
    }

    public final long getDurationNanos$animation_core_release() {
        return this.d;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public AnimationVector getValueFromNanos(long v, @NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        long v1 = this.a(v);
        long v2 = this.e;
        long v3 = this.d;
        if(v + v2 > v3) {
            AnimationVector animationVector3 = this.getVelocityFromNanos(v3 - v2, animationVector0, animationVector2, animationVector1);
            return this.b.getValueFromNanos(v1, animationVector0, animationVector1, animationVector3);
        }
        return this.b.getValueFromNanos(v1, animationVector0, animationVector1, animationVector2);
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public AnimationVector getVelocityFromNanos(long v, @NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        long v1 = this.a(v);
        long v2 = this.e;
        long v3 = this.d;
        if(v + v2 > v3) {
            AnimationVector animationVector3 = this.getVelocityFromNanos(v3 - v2, animationVector0, animationVector2, animationVector1);
            return this.b.getVelocityFromNanos(v1, animationVector0, animationVector1, animationVector3);
        }
        return this.b.getVelocityFromNanos(v1, animationVector0, animationVector1, animationVector2);
    }
}

