package t;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import kotlin.jvm.internal.Intrinsics;

public final class y implements AnimationSpec {
    public final AnimationSpec a;
    public final long b;

    public y(AnimationSpec animationSpec0, long v) {
        this.a = animationSpec0;
        this.b = v;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof y ? ((y)object0).b == this.b && Intrinsics.areEqual(((y)object0).a, this.a) : false;
    }

    @Override
    public final int hashCode() {
        return Long.hashCode(this.b) + this.a.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.animation.core.AnimationSpec
    public final VectorizedAnimationSpec vectorize(TwoWayConverter twoWayConverter0) {
        return new z(this.a.vectorize(twoWayConverter0), this.b);
    }
}

