package f0;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.pager.PagerState;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class a0 extends ContinuationImpl {
    public PagerState o;
    public AnimationSpec p;
    public int q;
    public float r;
    public Object s;
    public final PagerState t;
    public int u;

    public a0(PagerState pagerState0, Continuation continuation0) {
        this.t = pagerState0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.u |= 0x80000000;
        return this.t.animateScrollToPage(0, 0.0f, null, this);
    }
}

