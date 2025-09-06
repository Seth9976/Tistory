package androidx.paging;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;

public final class d0 extends ContinuationImpl {
    public final Insert A;
    public int B;
    public Function2 o;
    public Insert p;
    public LoadType q;
    public Collection r;
    public Iterator s;
    public TransformablePage t;
    public int[] u;
    public Collection v;
    public Iterator w;
    public Collection x;
    public Collection y;
    public Object z;

    public d0(Insert pageEvent$Insert0, Continuation continuation0) {
        this.A = pageEvent$Insert0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.z = object0;
        this.B |= 0x80000000;
        return this.A.map(null, this);
    }
}

