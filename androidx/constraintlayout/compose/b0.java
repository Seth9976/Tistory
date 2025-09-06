package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.state.Dimension;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function1 {
    public final float w;

    public b0(float f) {
        this.w = f;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((State)object0), "state");
        Dimension dimension0 = Dimension.Fixed(((State)object0).convertDimension(Dp.box-impl(this.w)));
        Intrinsics.checkNotNullExpressionValue(dimension0, "Fixed(state.convertDimension(dp))");
        return dimension0;
    }
}

