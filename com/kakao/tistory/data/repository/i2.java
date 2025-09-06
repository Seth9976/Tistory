package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class i2 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public final NotificationRepositoryImpl d;
    public int e;

    public i2(NotificationRepositoryImpl notificationRepositoryImpl0, Continuation continuation0) {
        this.d = notificationRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.c = object0;
        this.e |= 0x80000000;
        return this.d.getNotificationNewCount(this);
    }
}

