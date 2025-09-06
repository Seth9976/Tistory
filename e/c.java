package e;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class c extends ContinuationImpl {
    public g a;
    public Iterator b;
    public Object c;
    public int d;

    public c(Continuation continuation0) {
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.c = object0;
        this.d |= 0x80000000;
        return a.b(null, null, this);
    }
}

