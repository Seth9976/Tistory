package com.kakao.tistory.data.home.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class a extends ContinuationImpl {
    public Object a;
    public String b;
    public Object c;
    public final HomeRepositoryImpl d;
    public int e;

    public a(HomeRepositoryImpl homeRepositoryImpl0, Continuation continuation0) {
        this.d = homeRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.c = object0;
        this.e |= 0x80000000;
        return this.d.getCategorySlotList(null, this);
    }
}

