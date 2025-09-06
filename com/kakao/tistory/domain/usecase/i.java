package com.kakao.tistory.domain.usecase;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class i extends ContinuationImpl {
    public Object a;
    public Object b;
    public final LeaveUseCase c;
    public int d;

    public i(LeaveUseCase leaveUseCase0, Continuation continuation0) {
        this.c = leaveUseCase0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.invoke(this);
    }
}

