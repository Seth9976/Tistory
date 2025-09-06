package androidx.compose.material3;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class d9 extends ContinuationImpl {
    public EnterAlwaysScrollBehavior.nestedScrollConnection.1 o;
    public long p;
    public Object q;
    public final EnterAlwaysScrollBehavior.nestedScrollConnection.1 r;
    public int s;

    public d9(EnterAlwaysScrollBehavior.nestedScrollConnection.1 enterAlwaysScrollBehavior$nestedScrollConnection$10, Continuation continuation0) {
        this.r = enterAlwaysScrollBehavior$nestedScrollConnection$10;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.onPostFling-RZ2iAVY(0L, 0L, this);
    }
}

