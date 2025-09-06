package com.kakao.tistory.presentation.screen.feed.ui;

import com.kakao.tistory.presentation.screen.feed.contract.FeedEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final FeedEntry a;
    public final int b;

    public b(FeedEntry feedEntry0, int v) {
        this.a = feedEntry0;
        this.b = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.getOnClickEntryWithIndex().invoke(this.b);
        return Unit.INSTANCE;
    }
}

