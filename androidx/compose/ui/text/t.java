package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function2 {
    public static final t w;

    static {
        t.w = new t(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return CollectionsKt__CollectionsKt.arrayListOf(new Object[]{SaversKt.save(((Clickable)object1).getTag()), SaversKt.save(((Clickable)object1).getStyles(), SaversKt.getTextLinkStylesSaver(), ((SaverScope)object0))});
    }
}

