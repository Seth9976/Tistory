package com.kakao.tistory.domain.usecase;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class e extends ContinuationImpl {
    public Object a;
    public final FollowBlogUseCase b;
    public int c;

    public e(FollowBlogUseCase followBlogUseCase0, Continuation continuation0) {
        this.b = followBlogUseCase0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.a = object0;
        this.c |= 0x80000000;
        return this.b.invoke(null, this);
    }
}

