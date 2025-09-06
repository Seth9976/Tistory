package com.kakao.tistory.presentation.main.navigation;

import com.kakao.tistory.presentation.main.MainAppState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class l extends FunctionReferenceImpl implements Function0 {
    public l(Object object0) {
        super(0, object0, MainAppState.class, "navigateToPop", "navigateToPop()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((MainAppState)this.receiver).navigateToPop();
        return Unit.INSTANCE;
    }
}

