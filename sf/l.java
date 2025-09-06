package sf;

import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CopyableThreadContextElement;

public final class l extends Lambda implements Function2 {
    public static final l w;

    static {
        l.w = new l(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((Element)object1) instanceof CopyableThreadContextElement ? ((CoroutineContext)object0).plus(((CopyableThreadContextElement)(((Element)object1))).copyForChild()) : ((CoroutineContext)object0).plus(((Element)object1));
    }
}

