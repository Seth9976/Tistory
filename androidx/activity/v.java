package androidx.activity;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class v extends ContinuationImpl {
    public FullyDrawnReporter o;
    public Object p;
    public int q;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.q |= 0x80000000;
        return FullyDrawnReporterKt.reportWhenComplete(null, null, this);
    }
}

