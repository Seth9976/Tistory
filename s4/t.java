package s4;

import androidx.paging.m;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

public final class t extends ContinuationImpl {
    public m o;
    public IndexedValue p;
    public Mutex q;
    public Object r;
    public final m s;
    public int t;

    public t(m m0, ContinuationImpl continuationImpl0) {
        this.s = m0;
        super(continuationImpl0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.b(null, this);
    }
}

