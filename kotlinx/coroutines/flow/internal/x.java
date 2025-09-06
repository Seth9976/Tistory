package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

public final class x implements Continuation {
    public static final x a;
    public static final EmptyCoroutineContext b;

    static {
        x.a = new x();  // 初始化器: Ljava/lang/Object;-><init>()V
        x.b = EmptyCoroutineContext.INSTANCE;
    }

    @Override  // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return x.b;
    }

    @Override  // kotlin.coroutines.Continuation
    public final void resumeWith(Object object0) {
    }
}

