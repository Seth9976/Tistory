package o6;

import com.google.accompanist.pager.PagerState;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class t extends ContinuationImpl {
    public PagerState o;
    public int p;
    public int q;
    public float r;
    public Object s;
    public final PagerState t;
    public int u;

    public t(PagerState pagerState0, Continuation continuation0) {
        this.t = pagerState0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.u |= 0x80000000;
        return this.t.animateScrollToPage(0, 0.0f, this);
    }
}

