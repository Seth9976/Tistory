package com.kakao.tistory.data.datasource;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class e extends ContinuationImpl {
    public BlogFollowingDataSource a;
    public Object b;
    public final BlogFollowingDataSource c;
    public int d;

    public e(BlogFollowingDataSource blogFollowingDataSource0, Continuation continuation0) {
        this.c = blogFollowingDataSource0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.load(null, this);
    }
}

