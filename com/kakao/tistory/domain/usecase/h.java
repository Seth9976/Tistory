package com.kakao.tistory.domain.usecase;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class h extends ContinuationImpl {
    public GetLatestEditEntryUseCase a;
    public String b;
    public EditType c;
    public Object d;
    public final GetLatestEditEntryUseCase e;
    public int f;

    public h(GetLatestEditEntryUseCase getLatestEditEntryUseCase0, Continuation continuation0) {
        this.e = getLatestEditEntryUseCase0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.d = object0;
        this.f |= 0x80000000;
        return this.e.invoke(null, null, this);
    }
}

