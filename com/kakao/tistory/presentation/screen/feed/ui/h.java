package com.kakao.tistory.presentation.screen.feed.ui;

import androidx.compose.runtime.Composer;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.screen.feed.FeedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function2 {
    public final LazyPagingItems a;
    public final FeedViewModel b;
    public final boolean c;
    public final int d;

    public h(LazyPagingItems lazyPagingItems0, FeedViewModel feedViewModel0, boolean z, int v) {
        this.a = lazyPagingItems0;
        this.b = feedViewModel0;
        this.c = z;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        FeedListKt.FeedList(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}

