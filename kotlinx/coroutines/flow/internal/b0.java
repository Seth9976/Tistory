package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

public final class b0 implements Continuation, CoroutineStackFrame {
    public final Continuation a;
    public final CoroutineContext b;

    public b0(Continuation continuation0, CoroutineContext coroutineContext0) {
        this.a = continuation0;
        this.b = coroutineContext0;
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        return this.a instanceof CoroutineStackFrame ? ((CoroutineStackFrame)this.a) : null;
    }

    @Override  // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.b;
    }

    @Override  // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override  // kotlin.coroutines.Continuation
    public final void resumeWith(Object object0) {
        this.a.resumeWith(object0);
    }
}

