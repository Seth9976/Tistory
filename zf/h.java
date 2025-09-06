package zf;

import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.ThreadContextElement;

public final class h extends Lambda implements Function2 {
    public static final h w;

    static {
        h.w = new h(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(((Element)object1) instanceof ThreadContextElement) {
            Integer integer0 = object0 instanceof Integer ? ((Integer)object0) : null;
            int v = integer0 == null ? 1 : ((int)integer0);
            return v == 0 ? ((Element)object1) : ((int)(v + 1));
        }
        return object0;
    }
}

