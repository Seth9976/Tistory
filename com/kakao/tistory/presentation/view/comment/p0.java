package com.kakao.tistory.presentation.view.comment;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.view.comment.contract.CommentListModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class p0 extends Lambda implements Function2 {
    public final CommentFragment a;
    public final CommentListModel b;

    public p0(CommentFragment commentFragment0, CommentListModel commentListModel0) {
        this.a = commentFragment0;
        this.b = commentListModel0;
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
            ComposerKt.traceEventStart(2096033197, v, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.CommentListPage.<anonymous>.<anonymous> (CommentFragment.kt:201)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(this.a.getCommentListViewModel().getEnableInputComment(), Boolean.TRUE, ((Composer)object0), 56);
        Integer integer0 = (Integer)LiveDataAdapterKt.observeAsState(this.a.getCommentListViewModel().getNotAgreeInputTextTitle(), ((Composer)object0), 8).getValue();
        String s = integer0 == null ? null : StringResources_androidKt.stringResource(integer0.intValue(), ((Composer)object0), 0);
        if(s == null) {
            s = "";
        }
        AnimatedVisibilityKt.AnimatedVisibility(this.b.getShowEditor(), null, EnterExitTransitionKt.slideIn$default(null, m0.a, 1, null), EnterExitTransitionKt.shrinkOut$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), null, false, n0.a, 2, null), null, ComposableLambdaKt.rememberComposableLambda(-305554811, true, new o0(s, this.b, state0), ((Composer)object0), 54), ((Composer)object0), 200064, 18);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

