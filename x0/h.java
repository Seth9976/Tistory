package x0;

import androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class h extends ContinuationImpl {
    public PullToRefreshModifierNode o;
    public Object p;
    public final PullToRefreshModifierNode q;
    public int r;

    public h(PullToRefreshModifierNode pullToRefreshModifierNode0, Continuation continuation0) {
        this.q = pullToRefreshModifierNode0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.c(this);
    }
}

