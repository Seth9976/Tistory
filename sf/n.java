package sf;

import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CopyableThreadContextElement;

public final class n extends Lambda implements Function2 {
    public static final n w;

    static {
        n.w = new n(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((Boolean)object0).booleanValue() || ((Element)object1) instanceof CopyableThreadContextElement;
    }
}

