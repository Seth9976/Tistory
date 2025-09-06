package com.kakao.tistory.presentation.view.comment;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.view.comment.contract.CommentListModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function2 {
    public final CommentFragment a;
    public final Modifier b;
    public final LazyListState c;
    public final CommentListModel d;
    public final LazyPagingItems e;
    public final boolean f;
    public final int g;
    public final int h;

    public h0(CommentFragment commentFragment0, Modifier modifier0, LazyListState lazyListState0, CommentListModel commentListModel0, LazyPagingItems lazyPagingItems0, boolean z, int v, int v1) {
        this.a = commentFragment0;
        this.b = modifier0;
        this.c = lazyListState0;
        this.d = commentListModel0;
        this.e = lazyPagingItems0;
        this.f = z;
        this.g = v;
        this.h = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.CommentListContent(this.b, this.c, this.d, this.e, this.f, ((Composer)object0), (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)), this.h);
        return Unit.INSTANCE;
    }
}

