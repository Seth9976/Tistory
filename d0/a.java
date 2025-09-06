package d0;

import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class a extends ContinuationImpl {
    public SafeContinuation o;
    public Object p;
    public final AwaitFirstLayoutModifier q;
    public int r;

    public a(AwaitFirstLayoutModifier awaitFirstLayoutModifier0, Continuation continuation0) {
        this.q = awaitFirstLayoutModifier0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.waitForFirstLayout(this);
    }
}

