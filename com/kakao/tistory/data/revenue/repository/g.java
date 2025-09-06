package com.kakao.tistory.data.revenue.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class g extends ContinuationImpl {
    public Object a;
    public Object b;
    public final RevenueVendorRepositoryImpl c;
    public int d;

    public g(RevenueVendorRepositoryImpl revenueVendorRepositoryImpl0, Continuation continuation0) {
        this.c = revenueVendorRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.getRevenueVendorList(null, this);
    }
}

