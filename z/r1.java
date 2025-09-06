package z;

import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class r1 extends ContinuationImpl {
    public Object o;
    public final PressGestureScopeImpl p;
    public int q;

    public r1(PressGestureScopeImpl pressGestureScopeImpl0, Continuation continuation0) {
        this.p = pressGestureScopeImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.awaitRelease(this);
    }
}

