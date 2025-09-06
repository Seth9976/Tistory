package de;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.reflect.KCallable;
import kotlin.reflect.full.KCallables;

public final class b extends ContinuationImpl {
    public KCallable o;
    public Object[] p;
    public Object q;
    public int r;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.r |= 0x80000000;
        return KCallables.callSuspend(null, null, this);
    }
}

