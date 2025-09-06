package com.kakao.tistory.presentation.view.comment;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.view.comment.contract.CommentListModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q0 extends Lambda implements Function3 {
    public final CommentFragment a;
    public final LazyListState b;
    public final CommentListModel c;
    public final LazyPagingItems d;
    public final State e;

    public q0(CommentFragment commentFragment0, LazyListState lazyListState0, CommentListModel commentListModel0, LazyPagingItems lazyPagingItems0, State state0) {
        this.a = commentFragment0;
        this.b = lazyListState0;
        this.c = commentListModel0;
        this.d = lazyPagingItems0;
        this.e = state0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((PaddingValues)object0), "it");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((PaddingValues)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3AFF6FA5, v, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.CommentListPage.<anonymous>.<anonymous> (CommentFragment.kt:224)");
        }
        Modifier modifier0 = PaddingKt.padding(Modifier.Companion, ((PaddingValues)object0));
        boolean z = ((Boolean)this.e.getValue()).booleanValue();
        this.a.CommentListContent(modifier0, this.b, this.c, this.d, z, ((Composer)object1), LazyPagingItems.$stable << 9 | 0x40200, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

