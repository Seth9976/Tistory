package androidx.paging;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;

public final class e0 extends ContinuationImpl {
    public StaticList o;
    public Function2 p;
    public Collection q;
    public Iterator r;
    public Object s;
    public Object t;
    public final StaticList u;
    public int v;

    public e0(StaticList pageEvent$StaticList0, Continuation continuation0) {
        this.u = pageEvent$StaticList0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.t = object0;
        this.v |= 0x80000000;
        return this.u.filter(null, this);
    }
}

