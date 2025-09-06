package x0;

import androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class l extends ContinuationImpl {
    public Object o;
    public final PullToRefreshModifierNode p;
    public int q;

    public l(PullToRefreshModifierNode pullToRefreshModifierNode0, Continuation continuation0) {
        this.p = pullToRefreshModifierNode0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.onPreFling-QWom1Mo(0L, this);
    }
}

