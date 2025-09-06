package s4;

import androidx.paging.j1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class v1 extends ContinuationImpl {
    public j1 o;
    public Object p;
    public final j1 q;
    public int r;

    public v1(j1 j10, ContinuationImpl continuationImpl0) {
        this.q = j10;
        super(continuationImpl0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.a(null, this);
    }
}

