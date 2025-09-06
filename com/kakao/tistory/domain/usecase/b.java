package com.kakao.tistory.domain.usecase;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class b extends ContinuationImpl {
    public Long a;
    public Object b;
    public final CheckLatestEditEntryUseCase c;
    public int d;

    public b(CheckLatestEditEntryUseCase checkLatestEditEntryUseCase0, Continuation continuation0) {
        this.c = checkLatestEditEntryUseCase0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.a(null, 0L, null, this);
    }
}

