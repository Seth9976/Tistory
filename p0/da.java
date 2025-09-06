package p0;

import androidx.compose.foundation.text.selection.y0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class da extends ContinuationImpl {
    public y0 o;
    public Object p;
    public final y0 q;
    public int r;

    public da(y0 y00, Continuation continuation0) {
        this.q = y00;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.a(null, this);
    }
}

