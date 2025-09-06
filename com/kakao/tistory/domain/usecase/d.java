package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.entity.autosave.EntryKeyEntity;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class d extends ContinuationImpl {
    public Object a;
    public String b;
    public EntryKeyEntity c;
    public Object d;
    public final CheckLatestEditEntryUseCase e;
    public int f;

    public d(CheckLatestEditEntryUseCase checkLatestEditEntryUseCase0, Continuation continuation0) {
        this.e = checkLatestEditEntryUseCase0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.d = object0;
        this.f |= 0x80000000;
        return this.e.invoke(null, this);
    }
}

