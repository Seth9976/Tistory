package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function2 {
    public static final a0 w;

    static {
        a0.w = new a0(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        SaverScope saverScope0 = (SaverScope)object0;
        long v = ((Offset)object1).unbox-impl();
        return Offset.equals-impl0(v, 0x7FC000007FC00000L) ? false : CollectionsKt__CollectionsKt.arrayListOf(new Float[]{Offset.getX-impl(v), Offset.getY-impl(v)});
    }
}

