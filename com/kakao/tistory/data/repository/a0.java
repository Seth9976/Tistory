package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class a0 extends ContinuationImpl {
    public Object a;
    public Object b;
    public final CommentRepositoryImpl c;
    public int d;

    public a0(CommentRepositoryImpl commentRepositoryImpl0, Continuation continuation0) {
        this.c = commentRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.postComment(null, 0L, null, null, null, null, false, null, this);
    }
}

