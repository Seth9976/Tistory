package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class e2 extends ContinuationImpl {
    public Object a;
    public Object b;
    public final MemberRepositoryImpl c;
    public int d;

    public e2(MemberRepositoryImpl memberRepositoryImpl0, Continuation continuation0) {
        this.c = memberRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.joinTalkChannel(this);
    }
}

