package com.kakao.tistory.presentation.screen.feed;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function1 {
    public final FeedViewModel a;

    public o(FeedViewModel feedViewModel0) {
        this.a = feedViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        String s = (String)object0;
        this.a.getBlogFollowerCount();
        return Unit.INSTANCE;
    }
}

