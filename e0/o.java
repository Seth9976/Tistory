package e0;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;

public final class o extends ContinuationImpl {
    public LazyStaggeredGridState o;
    public MutatePriority p;
    public Function2 q;
    public Object r;
    public final LazyStaggeredGridState s;
    public int t;

    public o(LazyStaggeredGridState lazyStaggeredGridState0, Continuation continuation0) {
        this.s = lazyStaggeredGridState0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.scroll(null, null, this);
    }
}

