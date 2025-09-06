package com.kakao.tistory.presentation.view.comment;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Comment;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Pin;
import com.kakao.tistory.presentation.view.entry.widget.PinCommentKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function3 {
    public final Pin a;

    public d0(Pin commentItemUIModel$Pin0) {
        this.a = commentItemUIModel$Pin0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((AnimatedVisibilityScope)object0), "$this$AnimatedVisibility");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1683110328, v, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.CommentListContent.<anonymous>.<anonymous>.<anonymous> (CommentFragment.kt:280)");
        }
        Comment commentItemUIModel$Comment0 = this.a.getComment();
        String s = commentItemUIModel$Comment0.getUserName();
        String s1 = commentItemUIModel$Comment0.getComment();
        PinCommentKt.StickyPinComment((s == null ? "" : s), commentItemUIModel$Comment0.getUserThumbnail(), (s1 == null ? "" : s1), this.a.getOnClickReply(), ((Composer)object1), 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

