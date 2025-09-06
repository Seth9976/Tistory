package com.kakao.tistory.presentation.blog.navigation;

import com.kakao.tistory.presentation.blog.BlogAppState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class c extends FunctionReferenceImpl implements Function0 {
    public c(Object object0) {
        super(0, object0, BlogAppState.class, "navigateToPop", "navigateToPop()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((BlogAppState)this.receiver).navigateToPop();
        return Unit.INSTANCE;
    }
}

