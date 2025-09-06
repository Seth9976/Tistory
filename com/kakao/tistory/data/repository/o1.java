package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class o1 extends ContinuationImpl {
    public FeedRepositoryImpl a;
    public Object b;
    public Object c;
    public final FeedRepositoryImpl d;
    public int e;

    public o1(FeedRepositoryImpl feedRepositoryImpl0, Continuation continuation0) {
        this.d = feedRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.c = object0;
        this.e |= 0x80000000;
        return this.d.getBlogFollowingCount(this);
    }
}

