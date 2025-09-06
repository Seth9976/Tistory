package com.kakao.tistory.presentation.view.blog;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.paging.compose.LazyPagingItems;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function2 {
    public final BlogFollowingFragment a;
    public final LazyListState b;
    public final LazyPagingItems c;

    public w(BlogFollowingFragment blogFollowingFragment0, LazyListState lazyListState0, LazyPagingItems lazyPagingItems0) {
        this.a = blogFollowingFragment0;
        this.b = lazyListState0;
        this.c = lazyPagingItems0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF4F72A25, v, -1, "com.kakao.tistory.presentation.view.blog.BlogFollowingFragment.Content.<anonymous> (BlogFollowingFragment.kt:77)");
        }
        BlogFollowingFragment.access$FollowingList(this.a, this.b, this.c, ((Composer)object0), LazyPagingItems.$stable << 3 | 0x200);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

