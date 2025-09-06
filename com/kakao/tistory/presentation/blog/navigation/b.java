package com.kakao.tistory.presentation.blog.navigation;

import com.kakao.tistory.presentation.blog.BlogAppState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class b extends FunctionReferenceImpl implements Function0 {
    public b(Object object0) {
        super(0, object0, BlogAppState.class, "navigateToMainMy", "navigateToMainMy()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((BlogAppState)this.receiver).navigateToMainMy();
        return Unit.INSTANCE;
    }
}

