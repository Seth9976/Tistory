package com.kakao.tistory.presentation.view.comment;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import com.kakao.tistory.presentation.view.comment.contract.CommentListModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class v0 extends Lambda implements Function2 {
    public final CommentFragment a;
    public final State b;

    public v0(CommentFragment commentFragment0, State state0) {
        this.a = commentFragment0;
        this.b = state0;
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
            ComposerKt.traceEventStart(1096330777, v, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.Content.<anonymous>.<anonymous>.<anonymous> (CommentFragment.kt:95)");
        }
        CommentListModel commentListModel0 = CommentFragment.access$Content$lambda$5$lambda$4$lambda$1(this.b);
        this.a.CommentListPage(commentListModel0, ((Composer)object0), 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

