package f0;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.pager.PagerState;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;

public final class c0 extends ContinuationImpl {
    public PagerState o;
    public MutatePriority p;
    public Function2 q;
    public Object r;
    public final PagerState s;
    public int t;

    public c0(PagerState pagerState0, Continuation continuation0) {
        this.s = pagerState0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return PagerState.d(this.s, null, null, this);
    }
}

