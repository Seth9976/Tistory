package z;

import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class t1 extends ContinuationImpl {
    public PressGestureScopeImpl o;
    public Object p;
    public final PressGestureScopeImpl q;
    public int r;

    public t1(PressGestureScopeImpl pressGestureScopeImpl0, Continuation continuation0) {
        this.q = pressGestureScopeImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.tryAwaitRelease(this);
    }
}

