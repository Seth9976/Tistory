package z;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.FloatRef;

public final class u1 extends ContinuationImpl {
    public FloatRef o;
    public Object p;
    public int q;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.q |= 0x80000000;
        return ScrollExtensionsKt.animateScrollBy(null, 0.0f, null, this);
    }
}

