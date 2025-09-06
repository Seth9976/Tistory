package y0;

import androidx.compose.runtime.PausableMonotonicFrameClock;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

public final class z extends ContinuationImpl {
    public PausableMonotonicFrameClock o;
    public Function1 p;
    public Object q;
    public final PausableMonotonicFrameClock r;
    public int s;

    public z(PausableMonotonicFrameClock pausableMonotonicFrameClock0, Continuation continuation0) {
        this.r = pausableMonotonicFrameClock0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.withFrameNanos(null, this);
    }
}

