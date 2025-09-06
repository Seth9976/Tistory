package w1;

import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class d extends ContinuationImpl {
    public NestedScrollNode o;
    public long p;
    public long q;
    public Object r;
    public final NestedScrollNode s;
    public int t;

    public d(NestedScrollNode nestedScrollNode0, Continuation continuation0) {
        this.s = nestedScrollNode0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.onPostFling-RZ2iAVY(0L, 0L, this);
    }
}

