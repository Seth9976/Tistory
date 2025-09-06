package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class k1 extends ContinuationImpl {
    public EntryRepositoryImpl a;
    public Object b;
    public Object c;
    public EntryRepositoryImpl d;
    public Object e;
    public final EntryRepositoryImpl f;
    public int g;

    public k1(EntryRepositoryImpl entryRepositoryImpl0, Continuation continuation0) {
        this.f = entryRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.e = object0;
        this.g |= 0x80000000;
        return this.f.postNewEntry(null, null, null, null, null, null, null, null, 0, null, null, null, null, this);
    }
}

