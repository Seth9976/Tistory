package com.kakao.tistory.presentation.view.comment;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.CommentInputAcceptType;
import com.kakao.tistory.presentation.view.comment.contract.CommentListModel;
import com.kakao.tistory.presentation.view.entry.widget.CommentBottomBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o0 extends Lambda implements Function3 {
    public final String a;
    public final CommentListModel b;
    public final State c;

    public o0(String s, CommentListModel commentListModel0, State state0) {
        this.a = s;
        this.b = commentListModel0;
        this.c = state0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((AnimatedVisibilityScope)object0), "$this$AnimatedVisibility");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-305554811, v, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.CommentListPage.<anonymous>.<anonymous>.<anonymous> (CommentFragment.kt:215)");
        }
        CommentBottomBarKt.CommentBottomBar(this.c.getValue() == CommentInputAcceptType.ACCEPT, StringResources_androidKt.stringResource(string.label_comment_write_hint, ((Composer)object1), 0), this.a, this.b, ((Composer)object1), 0x1000);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

