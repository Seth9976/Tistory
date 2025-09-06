package androidx.compose.ui.platform;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class o extends ContinuationImpl {
    public Object o;
    public final AndroidComposeView p;
    public int q;

    public o(AndroidComposeView androidComposeView0, Continuation continuation0) {
        this.p = androidComposeView0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.textInputSession(null, this);
    }
}

