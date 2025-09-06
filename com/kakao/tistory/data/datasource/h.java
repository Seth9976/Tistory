package com.kakao.tistory.data.datasource;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class h extends ContinuationImpl {
    public NotificationDataSource a;
    public int b;
    public Object c;
    public final NotificationDataSource d;
    public int e;

    public h(NotificationDataSource notificationDataSource0, Continuation continuation0) {
        this.d = notificationDataSource0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.c = object0;
        this.e |= 0x80000000;
        return this.d.load(null, this);
    }
}

