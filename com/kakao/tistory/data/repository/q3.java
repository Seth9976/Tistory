package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class q3 extends ContinuationImpl {
    public Object a;
    public String b;
    public String c;
    public SearchRepositoryImpl d;
    public int e;
    public int f;
    public Object g;
    public final SearchRepositoryImpl h;
    public int i;

    public q3(SearchRepositoryImpl searchRepositoryImpl0, Continuation continuation0) {
        this.h = searchRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.g = object0;
        this.i |= 0x80000000;
        return this.h.getPosts(null, null, 0, 0, null, this);
    }
}

