package com.kakao.tistory.data.datasource;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class d extends ContinuationImpl {
    public BlogFollowerDataSource a;
    public Object b;
    public final BlogFollowerDataSource c;
    public int d;

    public d(BlogFollowerDataSource blogFollowerDataSource0, Continuation continuation0) {
        this.c = blogFollowerDataSource0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.load(null, this);
    }
}

