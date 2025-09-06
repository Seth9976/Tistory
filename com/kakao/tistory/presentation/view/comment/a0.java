package com.kakao.tistory.presentation.view.comment;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Pin;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function2 {
    public final CommentFragment a;
    public final LazyListState b;
    public final int c;
    public final long d;
    public final Pin e;
    public final LazyPagingItems f;
    public final int g;

    public a0(CommentFragment commentFragment0, LazyListState lazyListState0, int v, long v1, Pin commentItemUIModel$Pin0, LazyPagingItems lazyPagingItems0, int v2) {
        this.a = commentFragment0;
        this.b = lazyListState0;
        this.c = v;
        this.d = v1;
        this.e = commentItemUIModel$Pin0;
        this.f = lazyPagingItems0;
        this.g = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CommentFragment.access$CommentList(this.a, this.b, this.c, this.d, this.e, this.f, ((Composer)object0), (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)));
        return Unit.INSTANCE;
    }
}

