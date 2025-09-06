package sf;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.DelayKt;

public final class p extends ContinuationImpl {
    public Object o;
    public int p;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.p |= 0x80000000;
        return DelayKt.awaitCancellation(this);
    }
}

