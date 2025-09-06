package c0;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;

public final class s extends ContinuationImpl {
    public LazyGridState o;
    public MutatePriority p;
    public Function2 q;
    public Object r;
    public final LazyGridState s;
    public int t;

    public s(LazyGridState lazyGridState0, Continuation continuation0) {
        this.s = lazyGridState0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.scroll(null, null, this);
    }
}

