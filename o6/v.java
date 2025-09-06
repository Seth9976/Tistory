package o6;

import com.google.accompanist.pager.PagerState;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class v extends ContinuationImpl {
    public PagerState o;
    public float p;
    public Object q;
    public final PagerState r;
    public int s;

    public v(PagerState pagerState0, Continuation continuation0) {
        this.r = pagerState0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.scrollToPage(0, 0.0f, this);
    }
}

