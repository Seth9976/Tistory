package com.kakao.tistory.presentation.view.comment;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Header;
import com.kakao.tistory.presentation.view.comment.contract.CommentListModel;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class k0 extends Lambda implements Function0 {
    public final CommentListModel a;
    public final LazyPagingItems b;
    public final LazyListState c;
    public final int d;

    public k0(CommentListModel commentListModel0, LazyPagingItems lazyPagingItems0, LazyListState lazyListState0, int v) {
        this.a = commentListModel0;
        this.b = lazyPagingItems0;
        this.c = lazyListState0;
        this.d = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.a.isInitialized()) {
            boolean z = this.b.getLoadState().getSource().getPrepend().getEndOfPaginationReached();
            return !(CollectionsKt___CollectionsKt.firstOrNull(this.b.getItemSnapshotList()) instanceof Header) || !z || this.c.getFirstVisibleItemIndex() != 0 || this.c.getFirstVisibleItemScrollOffset() >= this.d;
        }
        return false;
    }
}

