package p0;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class m4 extends ContinuationImpl {
    public n4 o;
    public Object p;
    public final n4 q;
    public int r;

    public m4(n4 n40, ContinuationImpl continuationImpl0) {
        this.q = n40;
        super(continuationImpl0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.b(this);
    }
}

