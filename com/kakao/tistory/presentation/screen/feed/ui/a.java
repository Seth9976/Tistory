package com.kakao.tistory.presentation.screen.feed.ui;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.screen.feed.FeedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public final FeedViewModel a;
    public final int b;

    public a(FeedViewModel feedViewModel0, int v) {
        this.a = feedViewModel0;
        this.b = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        FeedListKt.access$EmptyItem(this.a, ((Composer)object0), (this.b | 1) & -920350135 | ((0x24924924 & (this.b | 1)) >> 1 | 306783378 & (this.b | 1)) | (306783378 & (this.b | 1)) << 1 & (0x24924924 & (this.b | 1)));
        return Unit.INSTANCE;
    }
}

