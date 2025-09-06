package com.kakao.tistory.data.statistics.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class b extends ContinuationImpl {
    public Object a;
    public Object b;
    public final StatisticsRepositoryImpl c;
    public int d;

    public b(StatisticsRepositoryImpl statisticsRepositoryImpl0, Continuation continuation0) {
        this.c = statisticsRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.getTopEntriesLastWeek(null, this);
    }
}

