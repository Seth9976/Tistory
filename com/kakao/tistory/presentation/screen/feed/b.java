package com.kakao.tistory.presentation.screen.feed;

import com.kakao.tistory.presentation.common.tiara.TistoryGNBTiaraKt;
import com.kakao.tistory.presentation.screen.feed.tiara.FeedTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final Function0 a;

    public b(Function0 function00) {
        this.a = function00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TistoryGNBTiaraKt.trackClickAppBarSearch$default(FeedTiara.INSTANCE, false, 1, null);
        this.a.invoke();
        return Unit.INSTANCE;
    }
}

