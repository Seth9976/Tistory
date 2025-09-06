package e;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class d extends ContinuationImpl {
    public g a;
    public Collection b;
    public Iterator c;
    public Collection d;
    public Object e;
    public int f;

    public d(Continuation continuation0) {
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.e = object0;
        this.f |= 0x80000000;
        return a.c(null, null, this);
    }
}

