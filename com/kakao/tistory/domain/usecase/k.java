package com.kakao.tistory.domain.usecase;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class k extends ContinuationImpl {
    public Object a;
    public final UnFollowBlogUseCase b;
    public int c;

    public k(UnFollowBlogUseCase unFollowBlogUseCase0, Continuation continuation0) {
        this.b = unFollowBlogUseCase0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.a = object0;
        this.c |= 0x80000000;
        return this.b.invoke(null, this);
    }
}

