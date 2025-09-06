package androidx.work.impl.constraints;

import androidx.work.impl.constraints.controllers.ConstraintController;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public static final a w;

    static {
        a.w = new a(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ConstraintController)object0), "it");
        String s = ((ConstraintController)object0).getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(s, "it.javaClass.simpleName");
        return s;
    }
}

