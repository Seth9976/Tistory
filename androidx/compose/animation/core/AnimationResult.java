package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 4)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u000B\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B#\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rR#\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/core/AnimationResult;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "Landroidx/compose/animation/core/AnimationState;", "endState", "Landroidx/compose/animation/core/AnimationEndReason;", "endReason", "<init>", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationEndReason;)V", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/animation/core/AnimationState;", "getEndState", "()Landroidx/compose/animation/core/AnimationState;", "b", "Landroidx/compose/animation/core/AnimationEndReason;", "getEndReason", "()Landroidx/compose/animation/core/AnimationEndReason;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AnimationResult {
    public static final int $stable;
    public final AnimationState a;
    public final AnimationEndReason b;

    public AnimationResult(@NotNull AnimationState animationState0, @NotNull AnimationEndReason animationEndReason0) {
        this.a = animationState0;
        this.b = animationEndReason0;
    }

    @NotNull
    public final AnimationEndReason getEndReason() {
        return this.b;
    }

    @NotNull
    public final AnimationState getEndState() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        return "AnimationResult(endReason=" + this.b + ", endState=" + this.a + ')';
    }
}

