package com.kakao.tistory.domain.usecase;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class f extends ContinuationImpl {
    public String a;
    public long b;
    public Object c;
    public final GetEditableEntryUseCase d;
    public int e;

    public f(GetEditableEntryUseCase getEditableEntryUseCase0, Continuation continuation0) {
        this.d = getEditableEntryUseCase0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.c = object0;
        this.e |= 0x80000000;
        return this.d.a(null, 0L, this);
    }
}

