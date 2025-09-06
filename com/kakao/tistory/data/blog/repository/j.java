package com.kakao.tistory.data.blog.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class j extends ContinuationImpl {
    public Object a;
    public Object b;
    public final BlogRepositoryImpl c;
    public int d;

    public j(BlogRepositoryImpl blogRepositoryImpl0, Continuation continuation0) {
        this.c = blogRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.getTrend(null, this);
    }
}

