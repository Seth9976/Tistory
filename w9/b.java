package w9;

import java.util.Map.Entry;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public static final b w;

    static {
        b.w = new b(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Map.Entry)object0), "<name for destructuring parameter 0>");
        Integer integer0 = (Integer)((Map.Entry)object0).getKey();
        return ((Number)((Pair)((Map.Entry)object0).getValue()).getFirst()).intValue() > 0 ? false : true;
    }
}

