package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.FloatRef;

public final class gl extends ContinuationImpl {
    public FloatRef o;
    public Object p;
    public int q;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.q |= 0x80000000;
        return SliderKt.access$awaitSlop-8vUncbI(null, 0L, 0, this);
    }
}

