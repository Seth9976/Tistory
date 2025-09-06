package b0;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function2 {
    public static final o w;

    static {
        o.w = new o(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        SaverScope saverScope0 = (SaverScope)object0;
        return CollectionsKt__CollectionsKt.listOf(new Integer[]{((LazyListState)object1).getFirstVisibleItemIndex(), ((LazyListState)object1).getFirstVisibleItemScrollOffset()});
    }
}

