package com.kakao.tistory.presentation.screen.feed;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class e extends FunctionReferenceImpl implements Function0 {
    public e(Object object0) {
        super(0, object0, FeedViewModel.class, "onClickFollowing", "onClickFollowing()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((FeedViewModel)this.receiver).onClickFollowing();
        return Unit.INSTANCE;
    }
}

