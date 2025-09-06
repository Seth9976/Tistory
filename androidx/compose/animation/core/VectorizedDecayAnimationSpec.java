package androidx.compose.animation.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u001D\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00028\u0000H&¢\u0006\u0002\u0010\fJ\u001D\u0010\r\u001A\u00028\u00002\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00028\u0000H&¢\u0006\u0002\u0010\u000EJ%\u0010\u000F\u001A\u00028\u00002\u0006\u0010\u0010\u001A\u00020\t2\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00028\u0000H&¢\u0006\u0002\u0010\u0011J%\u0010\u0012\u001A\u00028\u00002\u0006\u0010\u0010\u001A\u00020\t2\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00028\u0000H&¢\u0006\u0002\u0010\u0011R\u0012\u0010\u0004\u001A\u00020\u0005X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "", "absVelocityThreshold", "", "getAbsVelocityThreshold", "()F", "getDurationNanos", "", "initialValue", "initialVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getTargetValue", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getValueFromNanos", "playTimeNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface VectorizedDecayAnimationSpec {
    float getAbsVelocityThreshold();

    long getDurationNanos(@NotNull AnimationVector arg1, @NotNull AnimationVector arg2);

    @NotNull
    AnimationVector getTargetValue(@NotNull AnimationVector arg1, @NotNull AnimationVector arg2);

    @NotNull
    AnimationVector getValueFromNanos(long arg1, @NotNull AnimationVector arg2, @NotNull AnimationVector arg3);

    @NotNull
    AnimationVector getVelocityFromNanos(long arg1, @NotNull AnimationVector arg2, @NotNull AnimationVector arg3);
}

