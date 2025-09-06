package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class o3 extends ContinuationImpl {
    public PushRepositoryImpl a;
    public Object b;
    public Object c;
    public final PushRepositoryImpl d;
    public int e;

    public o3(PushRepositoryImpl pushRepositoryImpl0, Continuation continuation0) {
        this.d = pushRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.c = object0;
        this.e |= 0x80000000;
        return this.d.putPushSetting(null, false, false, false, false, false, false, false, null, null, this);
    }
}

