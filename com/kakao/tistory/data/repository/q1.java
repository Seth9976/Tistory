package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class q1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public final GrammarRepositoryImpl c;
    public int d;

    public q1(GrammarRepositoryImpl grammarRepositoryImpl0, Continuation continuation0) {
        this.c = grammarRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.postGrammarCheck(null, this);
    }
}

