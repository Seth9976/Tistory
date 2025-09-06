package s4;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

public final class g2 extends ContinuationImpl {
    public h2 o;
    public Job p;
    public Mutex q;
    public int r;
    public Object s;
    public final h2 t;
    public int u;

    public g2(h2 h20, ContinuationImpl continuationImpl0) {
        this.t = h20;
        super(continuationImpl0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.u |= 0x80000000;
        return this.t.b(0, null, this);
    }
}

