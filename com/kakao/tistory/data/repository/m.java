package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class m extends ContinuationImpl {
    public Object a;
    public Object b;
    public final AccountRepositoryImpl c;
    public int d;

    public m(AccountRepositoryImpl accountRepositoryImpl0, Continuation continuation0) {
        this.c = accountRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.postTransfer(null, 0L, null, 0L, null, this);
    }
}

