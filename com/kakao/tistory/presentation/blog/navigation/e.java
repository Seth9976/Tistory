package com.kakao.tistory.presentation.blog.navigation;

import com.kakao.tistory.presentation.blog.BlogAppState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class e extends FunctionReferenceImpl implements Function0 {
    public e(BlogAppState blogAppState0) {
        super(0, blogAppState0, BlogAppState.class, "navigateToBlogSwitchBottomSheet", "navigateToBlogSwitchBottomSheet()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((BlogAppState)this.receiver).navigateToBlogSwitchBottomSheet();
        return Unit.INSTANCE;
    }
}

