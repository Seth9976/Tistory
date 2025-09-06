package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class s extends ContinuationImpl {
    public Object a;
    public final BaseRepository b;
    public int c;

    public s(BaseRepository baseRepository0, Continuation continuation0) {
        this.b = baseRepository0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.a = object0;
        this.c |= 0x80000000;
        return this.b.checkError(null, null, this);
    }
}

