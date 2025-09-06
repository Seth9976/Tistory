package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class g0 extends ContinuationImpl {
    public DashboardRepositoryImpl a;
    public Object b;
    public Object c;
    public final DashboardRepositoryImpl d;
    public int e;

    public g0(DashboardRepositoryImpl dashboardRepositoryImpl0, Continuation continuation0) {
        this.d = dashboardRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.c = object0;
        this.e |= 0x80000000;
        return this.d.getRefLog(null, null, this);
    }
}

