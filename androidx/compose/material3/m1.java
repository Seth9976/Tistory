package androidx.compose.material3;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class m1 extends Lambda implements Function1 {
    public static final m1 w;

    static {
        m1.w = new m1(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return AppBarKt.BottomAppBarState(((Number)((List)object0).get(0)).floatValue(), ((Number)((List)object0).get(1)).floatValue(), ((Number)((List)object0).get(2)).floatValue());
    }
}

