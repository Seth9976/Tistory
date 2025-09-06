package com.kakao.tistory.presentation.screen.feed;

import com.kakao.tistory.domain.entity.entry.EntryItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function1 {
    public final FeedViewModel a;
    public final EntryItem b;

    public b0(FeedViewModel feedViewModel0, EntryItem entryItem0) {
        this.a = feedViewModel0;
        this.b = entryItem0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.a.onClickEntryItem(((Number)object0).intValue(), this.b);
        return Unit.INSTANCE;
    }
}

