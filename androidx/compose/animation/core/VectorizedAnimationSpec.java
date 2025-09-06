package androidx.compose.animation.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000B\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J%\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00028\u00002\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00028\u0000H&¢\u0006\u0002\u0010\fJ%\u0010\r\u001A\u00028\u00002\u0006\u0010\t\u001A\u00028\u00002\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000EJ-\u0010\u000F\u001A\u00028\u00002\u0006\u0010\u0010\u001A\u00020\b2\u0006\u0010\t\u001A\u00028\u00002\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00028\u0000H&¢\u0006\u0002\u0010\u0011J-\u0010\u0012\u001A\u00028\u00002\u0006\u0010\u0010\u001A\u00020\b2\u0006\u0010\t\u001A\u00028\u00002\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00028\u0000H&¢\u0006\u0002\u0010\u0011R\u0012\u0010\u0004\u001A\u00020\u0005X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/VectorizedAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "", "isInfinite", "", "()Z", "getDurationNanos", "", "initialValue", "targetValue", "initialVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getEndVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getValueFromNanos", "playTimeNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface VectorizedAnimationSpec {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static AnimationVector getEndVelocity(@NotNull VectorizedAnimationSpec vectorizedAnimationSpec0, @NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
            return vectorizedAnimationSpec0.super.getEndVelocity(animationVector0, animationVector1, animationVector2);
        }
    }

    long getDurationNanos(@NotNull AnimationVector arg1, @NotNull AnimationVector arg2, @NotNull AnimationVector arg3);

    @NotNull
    default AnimationVector getEndVelocity(@NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        return this.getVelocityFromNanos(this.getDurationNanos(animationVector0, animationVector1, animationVector2), animationVector0, animationVector1, animationVector2);
    }

    @NotNull
    AnimationVector getValueFromNanos(long arg1, @NotNull AnimationVector arg2, @NotNull AnimationVector arg3, @NotNull AnimationVector arg4);

    @NotNull
    AnimationVector getVelocityFromNanos(long arg1, @NotNull AnimationVector arg2, @NotNull AnimationVector arg3, @NotNull AnimationVector arg4);

    boolean isInfinite();
}

