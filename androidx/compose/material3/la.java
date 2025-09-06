package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class la extends ContinuationImpl {
    public ma o;
    public Object p;
    public final ma q;
    public int r;

    public la(ma ma0, ContinuationImpl continuationImpl0) {
        this.q = ma0;
        super(continuationImpl0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.b(this);
    }
}

