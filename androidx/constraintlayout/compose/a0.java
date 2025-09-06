package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.Dimension;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function1 {
    public final String w;

    public a0(String s) {
        this.w = s;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((State)object0), "it");
        Dimension dimension0 = Dimension.Ratio(this.w).suggested(Dimension.SPREAD_DIMENSION);
        Intrinsics.checkNotNullExpressionValue(dimension0, "Ratio(ratio).suggested(SPREAD_DIMENSION)");
        return dimension0;
    }
}

