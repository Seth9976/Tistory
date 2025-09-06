package t;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.AnimationVectorsKt;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.animation.core.VectorizedDecayAnimationSpec;
import kotlin.jvm.internal.Intrinsics;

public final class i0 implements VectorizedDecayAnimationSpec {
    public final FloatDecayAnimationSpec a;
    public AnimationVector b;
    public AnimationVector c;
    public AnimationVector d;
    public final float e;

    public i0(FloatDecayAnimationSpec floatDecayAnimationSpec0) {
        this.a = floatDecayAnimationSpec0;
        this.e = floatDecayAnimationSpec0.getAbsVelocityThreshold();
    }

    @Override  // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final float getAbsVelocityThreshold() {
        return this.e;
    }

    @Override  // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final long getDurationNanos(AnimationVector animationVector0, AnimationVector animationVector1) {
        if(this.c == null) {
            this.c = AnimationVectorsKt.newInstance(animationVector0);
        }
        AnimationVector animationVector2 = this.c;
        if(animationVector2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            animationVector2 = null;
        }
        int v = animationVector2.getSize$animation_core_release();
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            float f = animationVector0.get$animation_core_release(v2);
            float f1 = animationVector1.get$animation_core_release(v2);
            v1 = Math.max(v1, this.a.getDurationNanos(f, f1));
        }
        return v1;
    }

    @Override  // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final AnimationVector getTargetValue(AnimationVector animationVector0, AnimationVector animationVector1) {
        if(this.d == null) {
            this.d = AnimationVectorsKt.newInstance(animationVector0);
        }
        AnimationVector animationVector2 = this.d;
        if(animationVector2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetVector");
            animationVector2 = null;
        }
        int v = animationVector2.getSize$animation_core_release();
        for(int v1 = 0; v1 < v; ++v1) {
            AnimationVector animationVector3 = this.d;
            if(animationVector3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("targetVector");
                animationVector3 = null;
            }
            float f = animationVector0.get$animation_core_release(v1);
            float f1 = animationVector1.get$animation_core_release(v1);
            animationVector3.set$animation_core_release(v1, this.a.getTargetValue(f, f1));
        }
        AnimationVector animationVector4 = this.d;
        if(animationVector4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetVector");
            return null;
        }
        return animationVector4;
    }

    @Override  // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final AnimationVector getValueFromNanos(long v, AnimationVector animationVector0, AnimationVector animationVector1) {
        if(this.b == null) {
            this.b = AnimationVectorsKt.newInstance(animationVector0);
        }
        AnimationVector animationVector2 = this.b;
        if(animationVector2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            animationVector2 = null;
        }
        int v1 = animationVector2.getSize$animation_core_release();
        for(int v2 = 0; v2 < v1; ++v2) {
            AnimationVector animationVector3 = this.b;
            if(animationVector3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                animationVector3 = null;
            }
            float f = animationVector0.get$animation_core_release(v2);
            float f1 = animationVector1.get$animation_core_release(v2);
            animationVector3.set$animation_core_release(v2, this.a.getValueFromNanos(v, f, f1));
        }
        AnimationVector animationVector4 = this.b;
        if(animationVector4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            return null;
        }
        return animationVector4;
    }

    @Override  // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final AnimationVector getVelocityFromNanos(long v, AnimationVector animationVector0, AnimationVector animationVector1) {
        if(this.c == null) {
            this.c = AnimationVectorsKt.newInstance(animationVector0);
        }
        AnimationVector animationVector2 = this.c;
        if(animationVector2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            animationVector2 = null;
        }
        int v1 = animationVector2.getSize$animation_core_release();
        for(int v2 = 0; v2 < v1; ++v2) {
            AnimationVector animationVector3 = this.c;
            if(animationVector3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                animationVector3 = null;
            }
            float f = animationVector0.get$animation_core_release(v2);
            float f1 = animationVector1.get$animation_core_release(v2);
            animationVector3.set$animation_core_release(v2, this.a.getVelocityFromNanos(v, f, f1));
        }
        AnimationVector animationVector4 = this.c;
        if(animationVector4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            return null;
        }
        return animationVector4;
    }
}

