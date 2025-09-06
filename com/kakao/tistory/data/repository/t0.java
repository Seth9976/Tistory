package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class t0 extends ContinuationImpl {
    public EntryRepositoryImpl a;
    public Object b;
    public long c;
    public Object d;
    public final EntryRepositoryImpl e;
    public int f;

    public t0(EntryRepositoryImpl entryRepositoryImpl0, Continuation continuation0) {
        this.e = entryRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.d = object0;
        this.f |= 0x80000000;
        return this.e.deleteLikeIt(null, 0L, this);
    }
}

