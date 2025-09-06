package com.kakao.tistory.presentation.view.comment;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import com.kakao.tistory.presentation.view.comment.contract.CommentListModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class s0 extends Lambda implements Function2 {
    public final CommentListModel a;
    public final CommentFragment b;

    public s0(CommentListModel commentListModel0, CommentFragment commentFragment0) {
        this.a = commentListModel0;
        this.b = commentFragment0;
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
            ComposerKt.traceEventStart(0xA4F6B367, v, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.CommentListPage.<anonymous> (CommentFragment.kt:159)");
        }
        LazyListState lazyListState0 = LazyListStateKt.rememberLazyListState(0, 0, ((Composer)object0), 0, 3);
        Object object2 = ((Composer)object0).consume(CompositionLocalsKt.getLocalDensity());
        LazyPagingItems lazyPagingItems0 = LazyPagingItemsKt.collectAsLazyPagingItems(this.a.getComments(), null, ((Composer)object0), 8, 1);
        ((Composer)object0).startReplaceGroup(-109898587);
        boolean z = ((Composer)object0).changed(lazyPagingItems0);
        State state0 = ((Composer)object0).rememberedValue();
        if(z || state0 == Composer.Companion.getEmpty()) {
            state0 = SnapshotStateKt.derivedStateOf(new r0(lazyPagingItems0));
            ((Composer)object0).updateRememberedValue(state0);
        }
        ((Composer)object0).endReplaceGroup();
        ScaffoldKt.Scaffold-27mzLpw(null, null, ComposableLambdaKt.rememberComposableLambda(0x926B1B6C, true, new l0(this.a, this.b, ((Density)object2), lazyPagingItems0, lazyListState0), ((Composer)object0), 54), ComposableLambdaKt.rememberComposableLambda(2096033197, true, new p0(this.b, this.a), ((Composer)object0), 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(0x3AFF6FA5, true, new q0(this.b, lazyListState0, this.a, lazyPagingItems0, state0), ((Composer)object0), 54), ((Composer)object0), 0xD80, 0xC00000, 0x1FFF3);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

