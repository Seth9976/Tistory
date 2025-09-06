package com.kakao.tistory.presentation.screen.feed.ui;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.screen.feed.contract.FeedEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public final int a;
    public final FeedEntry b;
    public final int c;

    public d(int v, FeedEntry feedEntry0, int v1) {
        this.a = v;
        this.b = feedEntry0;
        this.c = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        FeedListKt.access$FeedItem(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

