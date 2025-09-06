package com.kakao.tistory.data.home.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class b extends ContinuationImpl {
    public Object a;
    public Object b;
    public final HomeRepositoryImpl c;
    public int d;

    public b(HomeRepositoryImpl homeRepositoryImpl0, Continuation continuation0) {
        this.c = homeRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.getHomeSlotList(this);
    }
}

