package s4;

import androidx.activity.d0;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class l extends ContinuationImpl {
    public d0 o;
    public IndexedValue p;
    public Object q;
    public final d0 r;
    public int s;

    public l(d0 d00, Continuation continuation0) {
        this.r = d00;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.a(null, this);
    }
}

