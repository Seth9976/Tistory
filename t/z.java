package t;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import kotlin.jvm.internal.Intrinsics;

public final class z implements VectorizedAnimationSpec {
    public final VectorizedAnimationSpec a;
    public final long b;

    public z(VectorizedAnimationSpec vectorizedAnimationSpec0, long v) {
        this.a = vectorizedAnimationSpec0;
        this.b = v;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof z ? ((z)object0).b == this.b && Intrinsics.areEqual(((z)object0).a, this.a) : false;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long getDurationNanos(AnimationVector animationVector0, AnimationVector animationVector1, AnimationVector animationVector2) {
        return this.a.getDurationNanos(animationVector0, animationVector1, animationVector2) + this.b;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector getValueFromNanos(long v, AnimationVector animationVector0, AnimationVector animationVector1, AnimationVector animationVector2) {
        return v < this.b ? animationVector0 : this.a.getValueFromNanos(v - this.b, animationVector0, animationVector1, animationVector2);
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector getVelocityFromNanos(long v, AnimationVector animationVector0, AnimationVector animationVector1, AnimationVector animationVector2) {
        return v < this.b ? animationVector2 : this.a.getVelocityFromNanos(v - this.b, animationVector0, animationVector1, animationVector2);
    }

    @Override
    public final int hashCode() {
        return Long.hashCode(this.b) + this.a.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    public final boolean isInfinite() {
        return this.a.isInfinite();
    }
}

