package com.kakao.tistory.data.common;

import androidx.paging.PagingSource.LoadParams;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class b extends ContinuationImpl {
    public LoadParams a;
    public Object b;
    public final SimplePagingSource c;
    public int d;

    public b(SimplePagingSource simplePagingSource0, Continuation continuation0) {
        this.c = simplePagingSource0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.load(null, this);
    }
}

