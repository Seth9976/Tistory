package androidx.compose.material3;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class j9 extends ContinuationImpl {
    public ExitUntilCollapsedScrollBehavior.nestedScrollConnection.1 o;
    public long p;
    public Object q;
    public final ExitUntilCollapsedScrollBehavior.nestedScrollConnection.1 r;
    public int s;

    public j9(ExitUntilCollapsedScrollBehavior.nestedScrollConnection.1 exitUntilCollapsedScrollBehavior$nestedScrollConnection$10, Continuation continuation0) {
        this.r = exitUntilCollapsedScrollBehavior$nestedScrollConnection$10;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.onPostFling-RZ2iAVY(0L, 0L, this);
    }
}

