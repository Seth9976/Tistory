package sf;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.TimeoutKt;

public final class q0 extends ContinuationImpl {
    public Function2 o;
    public ObjectRef p;
    public Object q;
    public int r;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.r |= 0x80000000;
        return TimeoutKt.withTimeoutOrNull(0L, null, this);
    }
}

