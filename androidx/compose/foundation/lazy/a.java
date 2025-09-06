package androidx.compose.foundation.lazy;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public static final a w;

    static {
        a.w = new a(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        SaverScope saverScope0 = (SaverScope)object0;
        return CollectionsKt__CollectionsKt.listOf(new Integer[]{((LazyListState)object1).getFirstVisibleItemIndex(), ((LazyListState)object1).getFirstVisibleItemScrollOffset()});
    }
}

