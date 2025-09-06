package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class j1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public final EntryRepositoryImpl c;
    public int d;

    public j1(EntryRepositoryImpl entryRepositoryImpl0, Continuation continuation0) {
        this.c = entryRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.postNewDraft(null, null, null, null, null, null, this);
    }
}

