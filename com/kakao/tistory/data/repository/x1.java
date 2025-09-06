package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class x1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public final GuestbookRepositoryImpl c;
    public int d;

    public x1(GuestbookRepositoryImpl guestbookRepositoryImpl0, Continuation continuation0) {
        this.c = guestbookRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.putGuestbook(null, 0L, null, null, false, this);
    }
}

