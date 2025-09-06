package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0018\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004BG\b\u0000\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001A\u00028\u0000\u0012\u0006\u0010\n\u001A\u00028\u0000\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00018\u0001\u00A2\u0006\u0004\b\f\u0010\rBG\b\u0016\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E\u0012\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001A\u00028\u0000\u0012\u0006\u0010\n\u001A\u00028\u0000\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00018\u0001\u00A2\u0006\u0004\b\f\u0010\u000FJ\u0017\u0010\u0012\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001A\u00028\u00012\u0006\u0010\u0011\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR&\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R*\u0010(\u001A\u00028\u00002\u0006\u0010!\u001A\u00028\u00008\u0000@@X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'R*\u0010,\u001A\u00028\u00002\u0006\u0010!\u001A\u00028\u00008\u0000@@X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b)\u0010#\u001A\u0004\b*\u0010%\"\u0004\b+\u0010\'R\u0011\u0010\t\u001A\u00028\u00008F\u00A2\u0006\u0006\u001A\u0004\b-\u0010%R\u0014\u0010\n\u001A\u00028\u00008VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b.\u0010%R\u0014\u00100\u001A\u00020/8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b0\u00101R\u0014\u00104\u001A\u00020\u00108VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b2\u00103\u00A8\u00065"}, d2 = {"Landroidx/compose/animation/core/TargetBasedAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/Animation;", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "animationSpec", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "initialValue", "targetValue", "initialVelocityVector", "<init>", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "", "playTimeNanos", "getValueFromNanos", "(J)Ljava/lang/Object;", "getVelocityVectorFromNanos", "(J)Landroidx/compose/animation/core/AnimationVector;", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "getAnimationSpec$animation_core_release", "()Landroidx/compose/animation/core/VectorizedAnimationSpec;", "b", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "value", "c", "Ljava/lang/Object;", "getMutableTargetValue$animation_core_release", "()Ljava/lang/Object;", "setMutableTargetValue$animation_core_release", "(Ljava/lang/Object;)V", "mutableTargetValue", "d", "getMutableInitialValue$animation_core_release", "setMutableInitialValue$animation_core_release", "mutableInitialValue", "getInitialValue", "getTargetValue", "", "isInfinite", "()Z", "getDurationNanos", "()J", "durationNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animation.kt\nandroidx/compose/animation/core/TargetBasedAnimation\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,490:1\n54#2,7:491\n1#3:498\n*S KotlinDebug\n*F\n+ 1 Animation.kt\nandroidx/compose/animation/core/TargetBasedAnimation\n*L\n270#1:491,7\n*E\n"})
public final class TargetBasedAnimation implements Animation {
    public static final int $stable = 8;
    public final VectorizedAnimationSpec a;
    public final TwoWayConverter b;
    public Object c;
    public Object d;
    public AnimationVector e;
    public AnimationVector f;
    public final AnimationVector g;
    public long h;
    public AnimationVector i;

    public TargetBasedAnimation(@NotNull AnimationSpec animationSpec0, @NotNull TwoWayConverter twoWayConverter0, Object object0, Object object1, @Nullable AnimationVector animationVector0) {
        this(animationSpec0.vectorize(twoWayConverter0), twoWayConverter0, object0, object1, animationVector0);
    }

    public TargetBasedAnimation(AnimationSpec animationSpec0, TwoWayConverter twoWayConverter0, Object object0, Object object1, AnimationVector animationVector0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 16) != 0) {
            animationVector0 = null;
        }
        this(animationSpec0, twoWayConverter0, object0, object1, animationVector0);
    }

    public TargetBasedAnimation(@NotNull VectorizedAnimationSpec vectorizedAnimationSpec0, @NotNull TwoWayConverter twoWayConverter0, Object object0, Object object1, @Nullable AnimationVector animationVector0) {
        AnimationVector animationVector1;
        this.a = vectorizedAnimationSpec0;
        this.b = twoWayConverter0;
        this.c = object1;
        this.d = object0;
        this.e = (AnimationVector)this.getTypeConverter().getConvertToVector().invoke(object0);
        this.f = (AnimationVector)this.getTypeConverter().getConvertToVector().invoke(object1);
        if(animationVector0 == null) {
            animationVector1 = AnimationVectorsKt.newInstance(((AnimationVector)this.getTypeConverter().getConvertToVector().invoke(object0)));
        }
        else {
            animationVector1 = AnimationVectorsKt.copy(animationVector0);
            if(animationVector1 == null) {
                animationVector1 = AnimationVectorsKt.newInstance(((AnimationVector)this.getTypeConverter().getConvertToVector().invoke(object0)));
            }
        }
        this.g = animationVector1;
        this.h = -1L;
    }

    public TargetBasedAnimation(VectorizedAnimationSpec vectorizedAnimationSpec0, TwoWayConverter twoWayConverter0, Object object0, Object object1, AnimationVector animationVector0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 16) != 0) {
            animationVector0 = null;
        }
        this(vectorizedAnimationSpec0, twoWayConverter0, object0, object1, animationVector0);
    }

    @NotNull
    public final VectorizedAnimationSpec getAnimationSpec$animation_core_release() {
        return this.a;
    }

    @Override  // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        if(this.h < 0L) {
            this.h = this.a.getDurationNanos(this.e, this.f, this.g);
        }
        return this.h;
    }

    public final Object getInitialValue() {
        return this.d;
    }

    public final Object getMutableInitialValue$animation_core_release() {
        return this.d;
    }

    public final Object getMutableTargetValue$animation_core_release() {
        return this.c;
    }

    @Override  // androidx.compose.animation.core.Animation
    public Object getTargetValue() {
        return this.c;
    }

    @Override  // androidx.compose.animation.core.Animation
    @NotNull
    public TwoWayConverter getTypeConverter() {
        return this.b;
    }

    @Override  // androidx.compose.animation.core.Animation
    public Object getValueFromNanos(long v) {
        if(!this.isFinishedFromNanos(v)) {
            AnimationVector animationVector0 = this.a.getValueFromNanos(v, this.e, this.f, this.g);
            int v1 = animationVector0.getSize$animation_core_release();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(Float.isNaN(animationVector0.get$animation_core_release(v2))) {
                    PreconditionsKt.throwIllegalStateException(("AnimationVector cannot contain a NaN. " + animationVector0 + ". Animation: " + this + ", playTimeNanos: " + v));
                }
            }
            return this.getTypeConverter().getConvertFromVector().invoke(animationVector0);
        }
        return this.getTargetValue();
    }

    @Override  // androidx.compose.animation.core.Animation
    @NotNull
    public AnimationVector getVelocityVectorFromNanos(long v) {
        if(!this.isFinishedFromNanos(v)) {
            return this.a.getVelocityFromNanos(v, this.e, this.f, this.g);
        }
        AnimationVector animationVector0 = this.i;
        if(animationVector0 == null) {
            animationVector0 = this.a.getEndVelocity(this.e, this.f, this.g);
            this.i = animationVector0;
        }
        return animationVector0;
    }

    @Override  // androidx.compose.animation.core.Animation
    public boolean isInfinite() {
        return this.a.isInfinite();
    }

    public final void setMutableInitialValue$animation_core_release(Object object0) {
        if(!Intrinsics.areEqual(object0, this.d)) {
            this.d = object0;
            this.e = (AnimationVector)this.getTypeConverter().getConvertToVector().invoke(object0);
            this.i = null;
            this.h = -1L;
        }
    }

    public final void setMutableTargetValue$animation_core_release(Object object0) {
        if(!Intrinsics.areEqual(this.c, object0)) {
            this.c = object0;
            this.f = (AnimationVector)this.getTypeConverter().getConvertToVector().invoke(object0);
            this.i = null;
            this.h = -1L;
        }
    }

    @Override
    @NotNull
    public String toString() {
        return "TargetBasedAnimation: " + this.getInitialValue() + " -> " + this.getTargetValue() + ",initial velocity: " + this.g + ", duration: " + AnimationKt.getDurationMillis(this) + " ms,animationSpec: " + this.a;
    }
}

