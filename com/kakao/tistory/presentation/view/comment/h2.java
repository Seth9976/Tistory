package com.kakao.tistory.presentation.view.comment;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class h2 extends ContinuationImpl {
    public Object a;
    public final SimplePagingSource b;
    public int c;

    public h2(SimplePagingSource simplePagingSource0, Continuation continuation0) {
        this.b = simplePagingSource0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.a = object0;
        this.c |= 0x80000000;
        return this.b.load(null, this);
    }
}

