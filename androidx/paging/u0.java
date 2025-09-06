package androidx.paging;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class u0 extends Lambda implements Function0 {
    public static final u0 w;

    static {
        u0.w = new u0(0);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list0 = k.listOf(new TransformablePage(0, CollectionsKt__CollectionsKt.emptyList()));
        return Insert.Companion.Refresh(list0, 0, 0, LoadStates.Companion.getIDLE(), null);
    }
}

