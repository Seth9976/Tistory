package z;

import androidx.compose.foundation.gestures.ScrollingLogic;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.LongRef;

public final class n2 extends ContinuationImpl {
    public LongRef o;
    public Object p;
    public final ScrollingLogic q;
    public int r;

    public n2(ScrollingLogic scrollingLogic0, Continuation continuation0) {
        this.q = scrollingLogic0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.doFlingAnimation-QWom1Mo(0L, this);
    }
}

