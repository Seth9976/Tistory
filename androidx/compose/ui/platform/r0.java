package androidx.compose.ui.platform;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class r0 extends ContinuationImpl {
    public Object o;
    public final w0 p;
    public int q;

    public r0(w0 w00, ContinuationImpl continuationImpl0) {
        this.p = w00;
        super(continuationImpl0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.a(null, null, this);
    }
}

