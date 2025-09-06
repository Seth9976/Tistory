package com.kakao.tistory.presentation.view.comment;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.view.comment.contract.CommentListModel;
import com.kakao.tistory.presentation.view.entry.widget.CommentToolbarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l0 extends Lambda implements Function2 {
    public final CommentListModel a;
    public final CommentFragment b;
    public final Density c;
    public final LazyPagingItems d;
    public final LazyListState e;

    public l0(CommentListModel commentListModel0, CommentFragment commentFragment0, Density density0, LazyPagingItems lazyPagingItems0, LazyListState lazyListState0) {
        this.a = commentListModel0;
        this.b = commentFragment0;
        this.c = density0;
        this.d = lazyPagingItems0;
        this.e = lazyListState0;
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
            ComposerKt.traceEventStart(0x926B1B6C, v, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.CommentListPage.<anonymous>.<anonymous> (CommentFragment.kt:174)");
        }
        ((Composer)object0).startReplaceGroup(0x7E0C98DB);
        boolean z = ((Composer)object0).changed(this.a.isInitialized());
        Density density0 = this.c;
        CommentListModel commentListModel0 = this.a;
        LazyPagingItems lazyPagingItems0 = this.d;
        LazyListState lazyListState0 = this.e;
        State state0 = ((Composer)object0).rememberedValue();
        if(z || state0 == Composer.Companion.getEmpty()) {
            state0 = SnapshotStateKt.derivedStateOf(new k0(commentListModel0, lazyPagingItems0, lazyListState0, density0.roundToPx-0680j_4(54.0f)));
            ((Composer)object0).updateRememberedValue(state0);
        }
        ((Composer)object0).endReplaceGroup();
        boolean z1 = ((Boolean)state0.getValue()).booleanValue();
        String s = StringResources_androidKt.stringResource(this.b.getTopViewTitleRes(), ((Composer)object0), 0);
        j0 j00 = new j0(this.b);
        CommentToolbarKt.CommentToolbar(s, this.a.getTotalCount(), z1, z1, j00, ((Composer)object0), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

