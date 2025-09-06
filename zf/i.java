package zf;

import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.ThreadContextElement;

public final class i extends Lambda implements Function2 {
    public static final i w;

    static {
        i.w = new i(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(((ThreadContextElement)object0) == null) {
            return ((Element)object1) instanceof ThreadContextElement ? ((ThreadContextElement)(((Element)object1))) : null;
        }
        return (ThreadContextElement)object0;
    }
}

