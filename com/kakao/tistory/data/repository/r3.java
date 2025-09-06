package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class r3 extends ContinuationImpl {
    public Object a;
    public Object b;
    public final SearchRepositoryImpl c;
    public int d;

    public r3(SearchRepositoryImpl searchRepositoryImpl0, Continuation continuation0) {
        this.c = searchRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.getPostsFromTags(null, null, 0, 0, null, this);
    }
}

