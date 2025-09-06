package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class u3 extends ContinuationImpl {
    public SessionRepositoryImpl a;
    public Object b;
    public Object c;
    public final SessionRepositoryImpl d;
    public int e;

    public u3(SessionRepositoryImpl sessionRepositoryImpl0, Continuation continuation0) {
        this.d = sessionRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.c = object0;
        this.e |= 0x80000000;
        return this.d.postWebSession(this);
    }
}

