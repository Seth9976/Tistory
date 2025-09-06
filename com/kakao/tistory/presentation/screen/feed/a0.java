package com.kakao.tistory.presentation.screen.feed;

import com.kakao.tistory.domain.entity.entry.EntryItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function0 {
    public final FeedViewModel a;
    public final EntryItem b;

    public a0(FeedViewModel feedViewModel0, EntryItem entryItem0) {
        this.a = feedViewModel0;
        this.b = entryItem0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.onClickBlog(this.b);
        return Unit.INSTANCE;
    }
}

