package z5;

import androidx.lifecycle.Lifecycle;
import coil.util.-Lifecycles;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class a extends ContinuationImpl {
    public Lifecycle o;
    public ObjectRef p;
    public Object q;
    public int r;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.r |= 0x80000000;
        return -Lifecycles.awaitStarted(null, this);
    }
}

