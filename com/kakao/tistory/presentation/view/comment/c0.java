package com.kakao.tistory.presentation.view.comment;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.view.comment.contract.CommentListModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function2 {
    public final CommentFragment a;
    public final LazyListState b;
    public final CommentListModel c;
    public final LazyPagingItems d;

    public c0(CommentFragment commentFragment0, LazyListState lazyListState0, CommentListModel commentListModel0, LazyPagingItems lazyPagingItems0) {
        this.a = commentFragment0;
        this.b = lazyListState0;
        this.c = commentListModel0;
        this.d = lazyPagingItems0;
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
            ComposerKt.traceEventStart(303587208, v, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.CommentListContent.<anonymous>.<anonymous> (CommentFragment.kt:258)");
        }
        int v1 = this.a.getTopViewTitleRes();
        CommentFragment.access$CommentList(this.a, this.b, v1, this.c.getTotalCount(), this.c.getPinComment(), this.d, ((Composer)object0), LazyPagingItems.$stable << 12 | 0x40000);
        CommentFragment.access$saveListPosition(this.a, this.b, ((Composer)object0), 0x40);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

