package androidx.work.impl;

import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function1 {
    public static final l w;

    static {
        l.w = new l(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((WorkSpec)object0), "spec");
        return ((WorkSpec)object0).isPeriodic() ? "Periodic" : "OneTime";
    }
}

