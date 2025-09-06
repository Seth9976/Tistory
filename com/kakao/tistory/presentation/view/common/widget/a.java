package com.kakao.tistory.presentation.view.common.widget;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class a extends ContinuationImpl {
    public RollingNumberView a;
    public int b;
    public int c;
    public Object d;
    public final RollingNumberView e;
    public int f;

    public a(RollingNumberView rollingNumberView0, Continuation continuation0) {
        this.e = rollingNumberView0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.d = object0;
        this.f |= 0x80000000;
        return this.e.a(null, this);
    }
}

