package f0;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public static final d w;

    static {
        d.w = new d(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Object object1 = ((List)object0).get(0);
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Int");
        Object object2 = ((List)object0).get(1);
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.Float");
        return new e(((int)(((Integer)object1))), ((float)(((Float)object2))), new c(((List)object0), 0));
    }
}

