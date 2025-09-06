package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class e1 extends ContinuationImpl {
    public EntryRepositoryImpl a;
    public Object b;
    public Object c;
    public EntryRepositoryImpl d;
    public long e;
    public Object f;
    public final EntryRepositoryImpl g;
    public int h;

    public e1(EntryRepositoryImpl entryRepositoryImpl0, Continuation continuation0) {
        this.g = entryRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.f = object0;
        this.h |= 0x80000000;
        return this.g.modifyEntry(null, 0L, null, null, null, null, null, null, 0, null, null, null, null, this);
    }
}

