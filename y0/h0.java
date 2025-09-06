package y0;

import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class h0 extends ContinuationImpl {
    public Recomposer o;
    public MonotonicFrameClock p;
    public b0 q;
    public List r;
    public List s;
    public Object t;
    public final Recomposer u;
    public int v;

    public h0(Recomposer recomposer0, Continuation continuation0) {
        this.u = recomposer0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.t = object0;
        this.v |= 0x80000000;
        return Recomposer.access$runFrameLoop(this.u, null, null, this);
    }
}

