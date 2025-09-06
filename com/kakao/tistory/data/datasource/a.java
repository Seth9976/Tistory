package com.kakao.tistory.data.datasource;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class a extends ContinuationImpl {
    public ObjectRef a;
    public Object b;
    public final BaseSearchDataSource c;
    public int d;

    public a(BaseSearchDataSource baseSearchDataSource0, Continuation continuation0) {
        this.c = baseSearchDataSource0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return BaseSearchDataSource.a(this.c, null, this);
    }
}

