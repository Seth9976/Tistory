package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class d3 extends ContinuationImpl {
    public Object a;
    public Object b;
    public final OldStatisticsRepositoryImpl c;
    public int d;

    public d3(OldStatisticsRepositoryImpl oldStatisticsRepositoryImpl0, Continuation continuation0) {
        this.c = oldStatisticsRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.getEntryRefererChannels(null, 0L, null, null, this);
    }
}

