package com.kakao.tistory.presentation.view.comment;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.State;
import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class f extends Lambda implements Function1 {
    public final CommentShowMenuEvent a;
    public final CoroutineScope b;
    public final ModalBottomSheetState c;
    public final CommentListViewModel d;
    public final State e;

    public f(CommentShowMenuEvent commentShowMenuEvent0, CoroutineScope coroutineScope0, ModalBottomSheetState modalBottomSheetState0, CommentListViewModel commentListViewModel0, State state0) {
        this.a = commentShowMenuEvent0;
        this.b = coroutineScope0;
        this.c = modalBottomSheetState0;
        this.d = commentListViewModel0;
        this.e = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((CommentMenuItem)object0), "menu");
        Long long0 = this.a.getReloadId();
        CommentItem commentItemType$CommentItem0 = this.a.getCommentItem();
        e e0 = new e(this.c, ((CommentMenuItem)object0), this.d, long0, commentItemType$CommentItem0, this.e, null);
        BuildersKt.launch$default(this.b, null, null, e0, 3, null);
        return Unit.INSTANCE;
    }
}

