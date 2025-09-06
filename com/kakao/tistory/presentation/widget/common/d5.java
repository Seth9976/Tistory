package com.kakao.tistory.presentation.widget.common;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.FloatRef;

public final class d5 extends ContinuationImpl {
    public Object a;
    public AnimationSpec b;
    public FloatRef c;
    public Object d;
    public int e;

    public d5(Continuation continuation0) {
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.d = object0;
        this.e |= 0x80000000;
        return TopAppBarKt.access$settleAppBar(null, 0.0f, null, null, this);
    }
}

