package s4;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

public final class f2 extends ContinuationImpl {
    public h2 o;
    public Job p;
    public Mutex q;
    public Object r;
    public final h2 s;
    public int t;

    public f2(h2 h20, ContinuationImpl continuationImpl0) {
        this.s = h20;
        super(continuationImpl0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.a(null, this);
    }
}

