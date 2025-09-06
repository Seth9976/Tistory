package s4;

import androidx.paging.m;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

public final class s extends ContinuationImpl {
    public m o;
    public Mutex p;
    public Object q;
    public final m r;
    public int s;

    public s(m m0, ContinuationImpl continuationImpl0) {
        this.r = m0;
        super(continuationImpl0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.a(this);
    }
}

