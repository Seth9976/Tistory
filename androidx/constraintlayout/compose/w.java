package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.Dimension;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function1 {
    public static final w w;

    static {
        w.w = new w(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((State)object0), "it");
        Dimension dimension0 = Dimension.Parent();
        Intrinsics.checkNotNullExpressionValue(dimension0, "Parent()");
        return dimension0;
    }
}

