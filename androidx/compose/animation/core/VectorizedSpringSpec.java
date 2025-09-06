package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\b\u0016\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000E\u001A\u00020\r2\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010\f\u001A\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ(\u0010\u0010\u001A\u00028\u00002\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010\f\u001A\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0013\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\r2\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010\f\u001A\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0015\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\r2\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010\f\u001A\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0017\u001A\u0004\b\u001B\u0010\u0019R\u0014\u0010\u001D\u001A\u00020\u001C8VX\u0096\u0005¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001E¨\u0006\u001F"}, d2 = {"Landroidx/compose/animation/core/VectorizedSpringSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "", "dampingRatio", "stiffness", "visibilityThreshold", "<init>", "(FFLandroidx/compose/animation/core/AnimationVector;)V", "initialValue", "targetValue", "initialVelocity", "", "getDurationNanos", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getEndVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "playTimeNanos", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "a", "F", "getDampingRatio", "()F", "b", "getStiffness", "", "isInfinite", "()Z", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class VectorizedSpringSpec implements VectorizedFiniteAnimationSpec {
    public static final int $stable = 8;
    public final float a;
    public final float b;
    public final VectorizedFloatAnimationSpec c;

    public VectorizedSpringSpec(float f, float f1, @Nullable AnimationVector animationVector0) {
        Animations animations0 = VectorizedAnimationSpecKt.access$createSpringAnimations(animationVector0, f, f1);
        super();
        this.a = f;
        this.b = f1;
        this.c = new VectorizedFloatAnimationSpec(animations0);
    }

    public VectorizedSpringSpec(float f, float f1, AnimationVector animationVector0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 1500.0f;
        }
        if((v & 4) != 0) {
            animationVector0 = null;
        }
        this(f, f1, animationVector0);
    }

    public final float getDampingRatio() {
        return this.a;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(@NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        return this.c.getDurationNanos(animationVector0, animationVector1, animationVector2);
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public AnimationVector getEndVelocity(@NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        return this.c.getEndVelocity(animationVector0, animationVector1, animationVector2);
    }

    public final float getStiffness() {
        return this.b;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public AnimationVector getValueFromNanos(long v, @NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        return this.c.getValueFromNanos(v, animationVector0, animationVector1, animationVector2);
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public AnimationVector getVelocityFromNanos(long v, @NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        return this.c.getVelocityFromNanos(v, animationVector0, animationVector1, animationVector2);
    }

    @Override  // androidx.compose.animation.core.VectorizedFiniteAnimationSpec
    public boolean isInfinite() {
        return this.c.isInfinite();
    }
}

