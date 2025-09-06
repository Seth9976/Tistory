package w1;

import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class e extends ContinuationImpl {
    public NestedScrollNode o;
    public long p;
    public Object q;
    public final NestedScrollNode r;
    public int s;

    public e(NestedScrollNode nestedScrollNode0, Continuation continuation0) {
        this.r = nestedScrollNode0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.onPreFling-QWom1Mo(0L, this);
    }
}

