package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class h2 extends ContinuationImpl {
    public Object a;
    public Object b;
    public final NotificationRepositoryImpl c;
    public int d;

    public h2(NotificationRepositoryImpl notificationRepositoryImpl0, Continuation continuation0) {
        this.c = notificationRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.getNotificationGroups(this);
    }
}

