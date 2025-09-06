package e;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class e extends ContinuationImpl {
    public g a;
    public Collection b;
    public Iterator c;
    public q d;
    public Collection e;
    public Object f;
    public int g;

    public e(Continuation continuation0) {
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.f = object0;
        this.g |= 0x80000000;
        return a.d(null, null, this);
    }
}

