package zf;

import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.ThreadContextElement;

public final class j extends Lambda implements Function2 {
    public static final j w;

    static {
        j.w = new j(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(((Element)object1) instanceof ThreadContextElement) {
            Object object2 = ((ThreadContextElement)(((Element)object1))).updateThreadContext(((k)object0).a);
            int v = ((k)object0).d;
            ((k)object0).b[v] = object2;
            ((k)object0).d = v + 1;
            Intrinsics.checkNotNull(((ThreadContextElement)(((Element)object1))), "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((k)object0).c[v] = (ThreadContextElement)(((Element)object1));
        }
        return (k)object0;
    }
}

