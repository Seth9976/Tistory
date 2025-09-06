package androidx.paging;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class i1 extends ContinuationImpl {
    public j1 o;
    public StaticList p;
    public List q;
    public Object r;
    public int s;
    public int t;
    public Object u;
    public final j1 v;
    public int w;

    public i1(j1 j10, ContinuationImpl continuationImpl0) {
        this.v = j10;
        super(continuationImpl0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.u = object0;
        this.w |= 0x80000000;
        return this.v.c(null, this);
    }
}

