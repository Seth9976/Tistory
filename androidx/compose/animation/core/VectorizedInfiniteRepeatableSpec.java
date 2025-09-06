package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B!\b\u0017\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tB)\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\b\u0010\fJ/\u0010\u0012\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00028\u00002\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00028\u00002\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\'\u0010\u0015\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00028\u00002\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001A\u0010\u001B\u001A\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR\u0014\u0010\u001D\u001A\u00020\u001C8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001E¨\u0006\u001F"}, d2 = {"Landroidx/compose/animation/core/VectorizedInfiniteRepeatableSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "animation", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "<init>", "(Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)V", "Landroidx/compose/animation/core/StartOffset;", "initialStartOffset", "(Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "getDurationNanos", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "c", "J", "getDurationNanos$animation_core_release", "()J", "durationNanos", "", "isInfinite", "()Z", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class VectorizedInfiniteRepeatableSpec implements VectorizedAnimationSpec {
    public static final int $stable = 8;
    public final VectorizedDurationBasedAnimationSpec a;
    public final RepeatMode b;
    public final long c;
    public final long d;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, RepeatMode repeatMode0) {
        this(vectorizedDurationBasedAnimationSpec0, repeatMode0, 0L, null);
    }

    public VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, RepeatMode repeatMode0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            repeatMode0 = RepeatMode.Restart;
        }
        this(vectorizedDurationBasedAnimationSpec0, repeatMode0);
    }

    public VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, RepeatMode repeatMode0, long v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            repeatMode0 = RepeatMode.Restart;
        }
        if((v1 & 4) != 0) {
            v = 0L;
        }
        this(vectorizedDurationBasedAnimationSpec0, repeatMode0, v, null);
    }

    public VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, RepeatMode repeatMode0, long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = vectorizedDurationBasedAnimationSpec0;
        this.b = repeatMode0;
        int v1 = vectorizedDurationBasedAnimationSpec0.getDelayMillis();
        this.c = ((long)(vectorizedDurationBasedAnimationSpec0.getDurationMillis() + v1)) * 1000000L;
        this.d = v * 1000000L;
    }

    public final long a(long v) {
        long v1 = this.d;
        if(v + v1 <= 0L) {
            return 0L;
        }
        long v2 = v + v1;
        long v3 = v2 / this.c;
        return this.b == RepeatMode.Restart || v3 % 2L == 0L ? v2 - v3 * this.c : (v3 + 1L) * this.c - v2;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(@NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        return 0x7FFFFFFFFFFFFFFFL;
    }

    public final long getDurationNanos$animation_core_release() {
        return this.c;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public AnimationVector getValueFromNanos(long v, @NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        long v1 = this.a(v);
        long v2 = this.d;
        long v3 = this.c;
        if(v + v2 > v3) {
            AnimationVector animationVector3 = this.a.getVelocityFromNanos(v3 - v2, animationVector0, animationVector1, animationVector2);
            return this.a.getValueFromNanos(v1, animationVector0, animationVector1, animationVector3);
        }
        return this.a.getValueFromNanos(v1, animationVector0, animationVector1, animationVector2);
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public AnimationVector getVelocityFromNanos(long v, @NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        long v1 = this.a(v);
        long v2 = this.d;
        long v3 = this.c;
        if(v + v2 > v3) {
            AnimationVector animationVector3 = this.a.getVelocityFromNanos(v3 - v2, animationVector0, animationVector1, animationVector2);
            return this.a.getVelocityFromNanos(v1, animationVector0, animationVector1, animationVector3);
        }
        return this.a.getVelocityFromNanos(v1, animationVector0, animationVector1, animationVector2);
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean isInfinite() {
        return true;
    }
}

