package androidx.paging;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s0 extends Lambda implements Function1 {
    public static final s0 w;

    static {
        s0.w = new s0(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((WeakReference)object0), "it");
        return ((WeakReference)object0).get() == null;
    }
}

