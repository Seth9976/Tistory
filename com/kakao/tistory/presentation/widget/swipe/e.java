package com.kakao.tistory.presentation.widget.swipe;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class e extends FunctionReferenceImpl implements Function0 {
    public e(CommonSwipeGroupState commonSwipeGroupState0) {
        super(0, commonSwipeGroupState0, CommonSwipeGroupState.class, "clearSwipe", "clearSwipe()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((CommonSwipeGroupState)this.receiver).clearSwipe();
        return Unit.INSTANCE;
    }
}

