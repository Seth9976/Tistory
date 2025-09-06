package s;

import androidx.compose.animation.SizeTransform;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function2;

public final class q1 implements SizeTransform {
    public final boolean a;
    public final Function2 b;

    public q1(boolean z, Function2 function20) {
        this.a = z;
        this.b = function20;
    }

    @Override  // androidx.compose.animation.SizeTransform
    public final FiniteAnimationSpec createAnimationSpec-TemP2vQ(long v, long v1) {
        IntSize intSize0 = IntSize.box-impl(v);
        IntSize intSize1 = IntSize.box-impl(v1);
        return (FiniteAnimationSpec)this.b.invoke(intSize0, intSize1);
    }

    @Override  // androidx.compose.animation.SizeTransform
    public final boolean getClip() {
        return this.a;
    }
}

