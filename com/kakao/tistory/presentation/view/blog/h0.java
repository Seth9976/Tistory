package com.kakao.tistory.presentation.view.blog;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.paging.compose.LazyPagingItems;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function2 {
    public final BlogFollowingFragment a;
    public final LazyListState b;
    public final LazyPagingItems c;
    public final int d;

    public h0(BlogFollowingFragment blogFollowingFragment0, LazyListState lazyListState0, LazyPagingItems lazyPagingItems0, int v) {
        this.a = blogFollowingFragment0;
        this.b = lazyListState0;
        this.c = lazyPagingItems0;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogFollowingFragment.access$FollowingList(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}

