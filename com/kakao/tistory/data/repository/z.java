package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class z extends ContinuationImpl {
    public Object a;
    public Object b;
    public final CommentRepositoryImpl c;
    public int d;

    public z(CommentRepositoryImpl commentRepositoryImpl0, Continuation continuation0) {
        this.c = commentRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.pinComment(null, 0L, 0L, this);
    }
}

