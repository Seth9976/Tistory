package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.common.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class h6 extends ContinuationImpl {
    public StatisticsViewModel a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Result g;
    public Result h;
    public Object i;
    public final StatisticsViewModel j;
    public int k;

    public h6(StatisticsViewModel statisticsViewModel0, Continuation continuation0) {
        this.j = statisticsViewModel0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.i = object0;
        this.k |= 0x80000000;
        return StatisticsViewModel.access$getBlogStatistics(this.j, null, null, null, null, this);
    }
}

