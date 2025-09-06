package com.kakao.tistory.data.datasource;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class g extends ContinuationImpl {
    public Object a;
    public final FeedDataSource b;
    public int c;

    public g(FeedDataSource feedDataSource0, Continuation continuation0) {
        this.b = feedDataSource0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.a = object0;
        this.c |= 0x80000000;
        return this.b.load(null, this);
    }
}

