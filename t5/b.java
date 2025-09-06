package t5;

import coil.disk.DiskCache.Snapshot;
import coil.fetch.HttpUriFetcher;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class b extends ContinuationImpl {
    public HttpUriFetcher o;
    public Snapshot p;
    public Object q;
    public Object r;
    public final HttpUriFetcher s;
    public int t;

    public b(HttpUriFetcher httpUriFetcher0, Continuation continuation0) {
        this.s = httpUriFetcher0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.fetch(this);
    }
}

