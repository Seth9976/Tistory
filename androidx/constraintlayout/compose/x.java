package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.Dimension;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function1 {
    public final float w;

    public x(float f) {
        this.w = f;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((State)object0), "it");
        Dimension dimension0 = Dimension.Percent(0, this.w).suggested(0);
        Intrinsics.checkNotNullExpressionValue(dimension0, "Percent(0, percent).suggested(0)");
        return dimension0;
    }
}

