package cg;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

public final class a extends ContinuationImpl {
    public b o;
    public FlowCollector p;
    public Iterator q;
    public Object r;
    public final b s;
    public int t;

    public a(b b0, Continuation continuation0) {
        this.s = b0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.collect(null, this);
    }
}

