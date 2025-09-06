package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.Dimension;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function1 {
    public static final v w;

    static {
        v.w = new v(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((State)object0), "it");
        Dimension dimension0 = Dimension.Suggested(Dimension.SPREAD_DIMENSION);
        Intrinsics.checkNotNullExpressionValue(dimension0, "Suggested(SPREAD_DIMENSION)");
        return dimension0;
    }
}

