package w1;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class c extends ContinuationImpl {
    public Object o;
    public final NestedScrollDispatcher p;
    public int q;

    public c(NestedScrollDispatcher nestedScrollDispatcher0, Continuation continuation0) {
        this.p = nestedScrollDispatcher0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.dispatchPreFling-QWom1Mo(0L, this);
    }
}

