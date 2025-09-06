package com.kakao.tistory.data.usecase;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class c extends ContinuationImpl {
    public Object a;
    public final LoginByTokenUseCase b;
    public int c;

    public c(LoginByTokenUseCase loginByTokenUseCase0, Continuation continuation0) {
        this.b = loginByTokenUseCase0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.a = object0;
        this.c |= 0x80000000;
        return this.b.invoke(this);
    }
}

