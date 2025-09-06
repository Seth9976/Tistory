package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class b3 extends ContinuationImpl {
    public Object a;
    public Object b;
    public final OldStatisticsRepositoryImpl c;
    public int d;

    public b3(OldStatisticsRepositoryImpl oldStatisticsRepositoryImpl0, Continuation continuation0) {
        this.c = oldStatisticsRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.getBlogTopPosts(null, null, null, this);
    }
}

