package androidx.paging;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;

public final class f0 extends ContinuationImpl {
    public StaticList o;
    public Function2 p;
    public Collection q;
    public Iterator r;
    public Object s;
    public final StaticList t;
    public int u;

    public f0(StaticList pageEvent$StaticList0, Continuation continuation0) {
        this.t = pageEvent$StaticList0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.u |= 0x80000000;
        return this.t.flatMap(null, this);
    }
}

