package com.kakao.tistory.data.datasource;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class i extends ContinuationImpl {
    public Object a;
    public final PostDataSource b;
    public int c;

    public i(PostDataSource postDataSource0, Continuation continuation0) {
        this.b = postDataSource0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.a = object0;
        this.c |= 0x80000000;
        return this.b.load(null, this);
    }
}

