package com.kakao.tistory.domain.usecase;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class g extends ContinuationImpl {
    public Object a;
    public String b;
    public long c;
    public Object d;
    public final GetEditableEntryUseCase e;
    public int f;

    public g(GetEditableEntryUseCase getEditableEntryUseCase0, Continuation continuation0) {
        this.e = getEditableEntryUseCase0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.d = object0;
        this.f |= 0x80000000;
        return this.e.invoke(null, 0L, this);
    }
}

