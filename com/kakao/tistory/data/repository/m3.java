package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class m3 extends ContinuationImpl {
    public PushRepositoryImpl a;
    public String b;
    public Object c;
    public Object d;
    public final PushRepositoryImpl e;
    public int f;

    public m3(PushRepositoryImpl pushRepositoryImpl0, Continuation continuation0) {
        this.e = pushRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.d = object0;
        this.f |= 0x80000000;
        return this.e.postPushToken(null, this);
    }
}

