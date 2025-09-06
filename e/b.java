package e;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class b extends ContinuationImpl {
    public g a;
    public Iterator b;
    public q c;
    public Object d;
    public int e;

    public b(Continuation continuation0) {
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.d = object0;
        this.e |= 0x80000000;
        return a.a(null, null, this);
    }
}

