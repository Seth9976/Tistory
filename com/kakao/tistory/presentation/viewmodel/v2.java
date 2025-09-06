package com.kakao.tistory.presentation.viewmodel;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;

public final class v2 extends ContinuationImpl {
    public MigrationViewModel a;
    public Function0 b;
    public Object c;
    public final MigrationViewModel d;
    public int e;

    public v2(MigrationViewModel migrationViewModel0, Continuation continuation0) {
        this.d = migrationViewModel0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.c = object0;
        this.e |= 0x80000000;
        return MigrationViewModel.access$login(this.d, null, this);
    }
}

