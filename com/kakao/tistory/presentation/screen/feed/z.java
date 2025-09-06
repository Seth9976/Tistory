package com.kakao.tistory.presentation.screen.feed;

import com.kakao.tistory.data.datasource.FeedDataSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function0 {
    public final FeedViewModel a;

    public z(FeedViewModel feedViewModel0) {
        this.a = feedViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new FeedDataSource(this.a.h);
    }
}

