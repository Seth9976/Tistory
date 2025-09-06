package com.kakao.tistory.presentation.widget.swipe;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class c extends ContinuationImpl {
    public CommonSwipeState a;
    public Object b;
    public final CommonSwipeState c;
    public int d;

    public c(CommonSwipeState commonSwipeState0, Continuation continuation0) {
        this.c = commonSwipeState0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.dragStop(this);
    }
}

