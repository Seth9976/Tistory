package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class k0 extends ContinuationImpl {
    public Object a;
    public Object b;
    public final DashboardRepositoryImpl c;
    public int d;

    public k0(DashboardRepositoryImpl dashboardRepositoryImpl0, Continuation continuation0) {
        this.c = dashboardRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.getTopPost(null, this);
    }
}

