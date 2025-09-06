package com.kakao.tistory.presentation.screen.feed;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class f extends FunctionReferenceImpl implements Function0 {
    public f(Object object0) {
        super(0, object0, FeedViewModel.class, "onClickFollower", "onClickFollower()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((FeedViewModel)this.receiver).onClickFollower();
        return Unit.INSTANCE;
    }
}

