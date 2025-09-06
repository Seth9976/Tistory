package com.kakao.tistory.presentation.widget.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class i1 extends FunctionReferenceImpl implements Function0 {
    public i1(FunctionState functionState0) {
        super(0, functionState0, FunctionState.class, "invoke", "invoke()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((FunctionState)this.receiver).invoke();
        return Unit.INSTANCE;
    }
}

