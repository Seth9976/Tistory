package x0;

import androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class m extends ContinuationImpl {
    public PullToRefreshModifierNode o;
    public float p;
    public Object q;
    public final PullToRefreshModifierNode r;
    public int s;

    public m(PullToRefreshModifierNode pullToRefreshModifierNode0, Continuation continuation0) {
        this.r = pullToRefreshModifierNode0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.g(0.0f, this);
    }
}

