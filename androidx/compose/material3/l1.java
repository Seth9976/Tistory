package androidx.compose.material3;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l1 extends Lambda implements Function2 {
    public static final l1 w;

    static {
        l1.w = new l1(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        SaverScope saverScope0 = (SaverScope)object0;
        return CollectionsKt__CollectionsKt.listOf(new Float[]{((BottomAppBarState)object1).getHeightOffsetLimit(), ((BottomAppBarState)object1).getHeightOffset(), ((BottomAppBarState)object1).getContentOffset()});
    }
}

