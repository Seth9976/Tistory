package sf;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AwaitKt;

public final class e extends ContinuationImpl {
    public Object[] o;
    public int p;
    public int q;
    public Object r;
    public int s;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.s |= 0x80000000;
        return AwaitKt.joinAll(null, this);
    }
}

