package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u001A\u0010\u0006\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001A\u0004\b\u0018\u0010\u0016R\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001D"}, d2 = {"Landroidx/compose/animation/core/VectorizedTweenSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "", "durationMillis", "delayMillis", "Landroidx/compose/animation/core/Easing;", "easing", "<init>", "(IILandroidx/compose/animation/core/Easing;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "a", "I", "getDurationMillis", "()I", "b", "getDelayMillis", "c", "Landroidx/compose/animation/core/Easing;", "getEasing", "()Landroidx/compose/animation/core/Easing;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class VectorizedTweenSpec implements VectorizedDurationBasedAnimationSpec {
    public static final int $stable = 8;
    public final int a;
    public final int b;
    public final Easing c;
    public final VectorizedFloatAnimationSpec d;

    public VectorizedTweenSpec() {
        this(0, 0, null, 7, null);
    }

    public VectorizedTweenSpec(int v, int v1, @NotNull Easing easing0) {
        this.a = v;
        this.b = v1;
        this.c = easing0;
        this.d = new VectorizedFloatAnimationSpec(new FloatTweenSpec(this.getDurationMillis(), this.getDelayMillis(), easing0));
    }

    public VectorizedTweenSpec(int v, int v1, Easing easing0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 1) != 0) {
            v = 300;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        if((v2 & 4) != 0) {
            easing0 = EasingKt.getFastOutSlowInEasing();
        }
        this(v, v1, easing0);
    }

    @Override  // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.b;
    }

    @Override  // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.a;
    }

    @NotNull
    public final Easing getEasing() {
        return this.c;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public AnimationVector getValueFromNanos(long v, @NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        return this.d.getValueFromNanos(v, animationVector0, animationVector1, animationVector2);
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public AnimationVector getVelocityFromNanos(long v, @NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        return this.d.getVelocityFromNanos(v, animationVector0, animationVector1, animationVector2);
    }
}

