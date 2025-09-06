package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class k extends ContinuationImpl {
    public AccountRepositoryImpl a;
    public Object b;
    public Object c;
    public final AccountRepositoryImpl d;
    public int e;

    public k(AccountRepositoryImpl accountRepositoryImpl0, Continuation continuation0) {
        this.d = accountRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.c = object0;
        this.e |= 0x80000000;
        return this.d.postProfileImage(null, this);
    }
}

