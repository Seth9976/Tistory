package androidx.paging;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;

public final class c0 extends ContinuationImpl {
    public int A;
    public Object B;
    public final Insert C;
    public int D;
    public Function2 o;
    public Insert p;
    public LoadType q;
    public Collection r;
    public Iterator s;
    public TransformablePage t;
    public List u;
    public List v;
    public Iterator w;
    public Collection x;
    public Collection y;
    public int z;

    public c0(Insert pageEvent$Insert0, Continuation continuation0) {
        this.C = pageEvent$Insert0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.B = object0;
        this.D |= 0x80000000;
        return this.C.flatMap(null, this);
    }
}

