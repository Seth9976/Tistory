package com.kakao.tistory.presentation.screen.feed;

import com.kakao.tistory.presentation.common.eventbus.BlogFollowEvent;
import com.kakao.tistory.presentation.common.eventbus.BlogTopBlockEvent;
import com.kakao.tistory.presentation.common.eventbus.TistoryEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function1 {
    public final FeedViewModel a;

    public f0(FeedViewModel feedViewModel0) {
        this.a = feedViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((TistoryEventBus)object0), "it");
        if(Intrinsics.areEqual(((TistoryEventBus)object0), BlogTopBlockEvent.INSTANCE)) {
            this.a.getBlogFollowerCount();
            return Unit.INSTANCE;
        }
        if(((TistoryEventBus)object0) instanceof BlogFollowEvent) {
            FeedViewModel.access$getBlogFollowingCount(this.a);
        }
        return Unit.INSTANCE;
    }
}

