package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 3)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B9\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001A\u00028\u0000\u0012\u0006\u0010\n\u001A\u00028\u0001¢\u0006\u0004\b\u000B\u0010\fB;\b\u0016\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001A\u00028\u0000\u0012\u0006\u0010\n\u001A\u00028\u0001¢\u0006\u0004\b\u000B\u0010\u000EB;\b\u0016\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001A\u00028\u0000\u0012\u0006\u0010\u000F\u001A\u00028\u0000¢\u0006\u0004\b\u000B\u0010\u0010J\u0017\u0010\u0013\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001A\u00028\u00012\u0006\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R&\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR\u0017\u0010\t\u001A\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u0017\u0010\n\u001A\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R\u001A\u0010%\u001A\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001C\u001A\u0004\b$\u0010\u001ER\u001A\u0010*\u001A\u00020\u00118VX\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)R\u001A\u0010,\u001A\u00020+8\u0016X\u0096D¢\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b,\u0010.¨\u0006/"}, d2 = {"Landroidx/compose/animation/core/DecayAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/Animation;", "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "animationSpec", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "initialValue", "initialVelocityVector", "<init>", "(Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "initialVelocity", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;)V", "", "playTimeNanos", "getValueFromNanos", "(J)Ljava/lang/Object;", "getVelocityVectorFromNanos", "(J)Landroidx/compose/animation/core/AnimationVector;", "b", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "c", "Ljava/lang/Object;", "getInitialValue", "()Ljava/lang/Object;", "e", "Landroidx/compose/animation/core/AnimationVector;", "getInitialVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "g", "getTargetValue", "targetValue", "h", "J", "getDurationNanos", "()J", "durationNanos", "", "isInfinite", "Z", "()Z", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DecayAnimation implements Animation {
    public static final int $stable;
    public final VectorizedDecayAnimationSpec a;
    public final TwoWayConverter b;
    public final Object c;
    public final AnimationVector d;
    public final AnimationVector e;
    public final AnimationVector f;
    public final Object g;
    public final long h;

    public DecayAnimation(@NotNull DecayAnimationSpec decayAnimationSpec0, @NotNull TwoWayConverter twoWayConverter0, Object object0, @NotNull AnimationVector animationVector0) {
        this(decayAnimationSpec0.vectorize(twoWayConverter0), twoWayConverter0, object0, animationVector0);
    }

    public DecayAnimation(@NotNull DecayAnimationSpec decayAnimationSpec0, @NotNull TwoWayConverter twoWayConverter0, Object object0, Object object1) {
        this(decayAnimationSpec0.vectorize(twoWayConverter0), twoWayConverter0, object0, ((AnimationVector)twoWayConverter0.getConvertToVector().invoke(object1)));
    }

    public DecayAnimation(@NotNull VectorizedDecayAnimationSpec vectorizedDecayAnimationSpec0, @NotNull TwoWayConverter twoWayConverter0, Object object0, @NotNull AnimationVector animationVector0) {
        this.a = vectorizedDecayAnimationSpec0;
        this.b = twoWayConverter0;
        this.c = object0;
        AnimationVector animationVector1 = (AnimationVector)this.getTypeConverter().getConvertToVector().invoke(object0);
        this.d = animationVector1;
        this.e = AnimationVectorsKt.copy(animationVector0);
        this.g = this.getTypeConverter().getConvertFromVector().invoke(vectorizedDecayAnimationSpec0.getTargetValue(animationVector1, animationVector0));
        this.h = vectorizedDecayAnimationSpec0.getDurationNanos(animationVector1, animationVector0);
        AnimationVector animationVector2 = AnimationVectorsKt.copy(vectorizedDecayAnimationSpec0.getVelocityFromNanos(this.getDurationNanos(), animationVector1, animationVector0));
        this.f = animationVector2;
        int v = animationVector2.getSize$animation_core_release();
        for(int v1 = 0; v1 < v; ++v1) {
            float f = c.coerceIn(this.f.get$animation_core_release(v1), -this.a.getAbsVelocityThreshold(), this.a.getAbsVelocityThreshold());
            this.f.set$animation_core_release(v1, f);
        }
    }

    @Override  // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        return this.h;
    }

    public final Object getInitialValue() {
        return this.c;
    }

    @NotNull
    public final AnimationVector getInitialVelocityVector() {
        return this.e;
    }

    @Override  // androidx.compose.animation.core.Animation
    public Object getTargetValue() {
        return this.g;
    }

    @Override  // androidx.compose.animation.core.Animation
    @NotNull
    public TwoWayConverter getTypeConverter() {
        return this.b;
    }

    @Override  // androidx.compose.animation.core.Animation
    public Object getValueFromNanos(long v) {
        return this.isFinishedFromNanos(v) ? this.getTargetValue() : this.getTypeConverter().getConvertFromVector().invoke(this.a.getValueFromNanos(v, this.d, this.e));
    }

    @Override  // androidx.compose.animation.core.Animation
    @NotNull
    public AnimationVector getVelocityVectorFromNanos(long v) {
        return this.isFinishedFromNanos(v) ? this.f : this.a.getVelocityFromNanos(v, this.d, this.e);
    }

    @Override  // androidx.compose.animation.core.Animation
    public boolean isInfinite() {
        return false;
    }
}

