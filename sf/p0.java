package sf;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.internal.ScopeCoroutine;

public final class p0 extends ScopeCoroutine implements Runnable {
    public final long d;

    public p0(long v, Continuation continuation0) {
        super(continuation0.getContext(), continuation0);
        this.d = v;
    }

    @Override  // kotlinx.coroutines.AbstractCoroutine
    public final String nameString$kotlinx_coroutines_core() {
        return super.nameString$kotlinx_coroutines_core() + "(timeMillis=" + this.d + ')';
    }

    @Override
    public final void run() {
        Delay delay0 = DelayKt.getDelay(this.getContext());
        this.cancelCoroutine(TimeoutKt.TimeoutCancellationException(this.d, delay0, this));
    }
}

